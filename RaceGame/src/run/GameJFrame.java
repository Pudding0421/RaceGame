package run;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * 
 * 赛跑游戏简单版   (面向过程)
 * 
 * BUG:
 * 		1.开始按钮不能点击两次
 * 		2.到达长点以后冲出去好远
 * 		3.到终点后还是原地跑步
 * 		4.一个循环控制四个人跑,第一名的胖子始终占优势
 * 		5.只能玩一次，不能重新开始
 * 		6.不能下注
 * 
 * 解决BUG:
 * 4.一个循环控制四个人跑,第一名的胖子始终占优势
 * 		面向对象思想体现 把每一个小人看作一个对象 自己封装自己的横坐标 画自己的方法 自己去递增横坐标 到终点后自己停下来
 * 
 * 2.到达长点以后冲出去好远
 * 		到终点后横坐标写死
 * 
 *3.到终点后还是原地跑步
 *		到终点后把图片换回来
 *
 *5.只能玩一次，不能重新开始
 *		两个按钮开始，重新开始
 *
 *新BUG
 *		7.第一名跑到终点后就打印成绩
 *
 *解决
 *		需要判断四个人都跑完了 再去 打印成绩
 */

public class GameJFrame extends JFrame{

	//背景图片的数组
	Image img_back[] = new Image[4];
	//四个准备状态的小人
	Image img_ready[] = new Image[4];
	//四个跑动状态的小人
	Image img_run[] = new Image[4];
	//四个胜利状态的小人
	Image img_win[] = new Image[4];
	//四个小人的数组
	RunningMan mans[] = new RunningMan[4];
	//四个小人的名字
	String names[] = {"Jack", "Lucy", "Jimmy", "Eric"}; 
	
	//赛跑界面的面板
	GamePanel game_panel = new GamePanel();
	//控制面板
	JPanel jp_control = new JPanel();
	//开始按钮
	JButton bt_start = new JButton("Start");
	//重新开始按钮
	JButton bt_restart = new JButton("Replay");
	//单选按钮
	JRadioButton jr_mans[] = new JRadioButton[4];
	//单选按钮组
	ButtonGroup bg = new ButtonGroup();
	//
	JLabel jl_tips = new JLabel("Bet account: ");
	//
	JTextField jtf_cost = new JTextField(10);
	//
	JLabel jl_moneyTips = new JLabel("My principal: ");
	JLabel jl_money = new JLabel("10000");
	//用来记录选项的
	JRadioButton selected;
	
	
	public GameJFrame() {
		
		//构造器开始
		for(int i = 0; i < img_back.length; i++){
			//实例化图片的循环
			img_back[i] = Toolkit.getDefaultToolkit().createImage("imgBack/" +(i+1)+ ".jpg");
			//实例化四个准备状态的小人
			img_ready[i] = Toolkit.getDefaultToolkit().createImage("imgReady/" +(i+1)+ "1.gif");
			//实例化四个跑动状态的小人
			img_run[i] = Toolkit.getDefaultToolkit().createImage("imgRun/" +(i+1)+ "1.gif");
			//实例化四个胜利状态的小人
			img_win[i] = Toolkit.getDefaultToolkit().createImage("imgWin/" +(i+1)+ "1.gif");
			//实例化四个单选按钮
			jr_mans[i] = new JRadioButton(names[i]);
			bg.add(jr_mans[i]);
			//
			jp_control.add(jr_mans[i]);
		}
		
		//开始按钮的监听--------------------------
		bt_start.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//判断是否选人
				if(!(jr_mans[0].isSelected() || jr_mans[1].isSelected() || jr_mans[2].isSelected() || jr_mans[3].isSelected())){
					JOptionPane.showMessageDialog(GameJFrame.this, "不选人你干啥来了...", "选人", JOptionPane.WARNING_MESSAGE);
					//没有返回值的方法 可以直接写一个return, 不反悔任何数据 只是单纯的结束方法
					return;
				}
				if(jtf_cost.getText().equals("")){
					JOptionPane.showMessageDialog(GameJFrame.this, "没钱你玩啥啊...", "投币", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				//开始的那一刻把选择的选项记录下来 为了以后计算成绩防止 中途改变
				for(JRadioButton jr : jr_mans){
					if(jr.isSelected()){
						selected = jr;
					}
				}
				
				//点击开始按钮 让重新开始按钮可以用 开始按钮不可用
				bt_restart.setEnabled(true);
				bt_start.setEnabled(false);
				//表示比赛没结束，可以产生第一名
				RunningMan.isEnd = false;
				//让线程跑起来的布尔值
				RunningMan.canRun = true;
				//变成跑动图片
				for(int i = 0; i < mans.length; i++){
					mans[i].image = img_run[i];
					mans[i].start();
				}
			}
		});
		//开始按钮的监听--------------------------
		//重新开始按钮的监听--------------------------
		bt_restart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//点击重新开始按钮 让开始按钮可以用 重新开始按钮不可用
				bt_restart.setEnabled(false);
				bt_start.setEnabled(true);
				//表示比赛结束了
				RunningMan.isEnd = true;
				//让线程跑起来的布尔值
				RunningMan.canRun = false;
				//重新开始的时候清空计数器
				RunningMan.num = 0;
				
				for(int i = 0; i < img_back.length; i++){
					mans[i] = new RunningMan(names[i], 0, (i * game_panel.getHeight())/4 + 55, img_ready[i], GameJFrame.this);
				}
			}
		});
		//重新开始按钮的监听--------------------------
		
		
		//将组件放在控制面板上
		//游戏第一次打开 重新开始按钮不可用
		bt_restart.setEnabled(false);
		
		jp_control.add(jl_tips);
		jp_control.add(jtf_cost);
		jp_control.add(jl_moneyTips);
		jp_control.add(jl_money);
		
		jp_control.add(bt_start, BorderLayout.CENTER);
		jp_control.add(bt_restart, BorderLayout.CENTER);
		//将组件放在控制面板上
		
		//给控制面板设置分组边框
		jp_control.setBorder(BorderFactory.createTitledBorder("Control"));
		
		//赛跑界面面板放到窗体上
		add(game_panel, BorderLayout.CENTER);
		//控制面板放到窗体上
		add(jp_control, BorderLayout.SOUTH);
		//设置标题
		setTitle("Race Game By zh.d v1.0");
		setSize(1100, 700);
		setLocation(100, 10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗体不可以改变大小
		setResizable(false);
		setVisible(true);
		
		for(int i = 0; i < img_back.length; i++){
			mans[i] = new RunningMan(names[i], 0, (i * game_panel.getHeight())/4 + 55, img_ready[i], this);
		}
		//构造器结束
	}
	
	/**
	 * 次面板
	 */
	class GamePanel extends JPanel{
		
		@Override
		public void paint(Graphics graphic) {
			
			super.paint(graphic);
			for(int i = 0; i < img_back.length; i++){
				//画背景图片的方法
				graphic.drawImage(img_back[i], 0, (getHeight() * i)/4, getWidth(), getHeight()/4, this);
				//每个人画自己的方法
				mans[i].drawSelf(graphic, game_panel);
				
				/*//当到达终点后,跑动图片变为准备图片
				if(mans[i].x_point == 950){
					mans[i]. = img_ready[i];
				}*/
			}
			//红色终点线
			graphic.setColor(Color.RED);
			graphic.fillRect(950, 0, 5, getHeight());
			
		}
	}
	
	public static void main(String[] args) {
		new GameJFrame();
	}
}
