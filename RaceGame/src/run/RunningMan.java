package run;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.JPanel;

/**
 * 左值和右值问题
 * 
 * 左值：是可以被赋值的变量  比如 a=10  x=12
 * 右值：一个可以给其他变量赋值的值
 * 		this, 60, "diss", 3.14
 * 		它们不能 this = (某某值) , 60 = (某某值)
 *
 */
public class RunningMan extends Thread{

	public String name;
	public int x_point, y_point;
	public Image image;
	static Random random = new Random();
	//用来保存准备状态图片的变量
	private Image img_ready;
	//第一名
	static RunningMan NO1;
	//用来判断是否产生第一名
	static boolean isEnd = false;
	//终止线程的布尔值
	static boolean canRun = true;
	//
	static int num;
	//
	GameJFrame gj;
	public RunningMan(String name, int x_point, int y_point, Image image, GameJFrame gj) {
		
		this.name = name;
		this.x_point = x_point;
		this.y_point = y_point;
		this.image = image;
		img_ready = image;
		this.gj = gj;
	}
	
	public void drawSelf(Graphics graphic, JPanel jp){
		
		graphic.drawImage(image, x_point, y_point, jp);
	}
	
	//跑动的方法
	public void move(){
		x_point += random.nextInt(10);
	}
	
	@Override
	public void run() {
		
		while(x_point < 950 && canRun){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			move();
		}
		
		if(canRun){
			//循环执行完表示到达终点 瞬间把这个人的坐标改成终点坐标 让这个不会冲出去太远
			x_point = 950;
			//跑到终点变为准备图片
			image = img_ready;
		}
		synchronized (random) {
			
			if(canRun){
				//只有能跑的状态下再去计数
				num++;
				
			}
			//如果没有产生第一名 if语句执行给第一名赋值
			if(!isEnd && canRun){
				/**
				 * 判断多线程安全问题
				 * 		1.是不是多线程环境 : 是
				 * 		2.是不是有共享数据: 有
				 * 		3.是否有多条语句操作共享数据: 是
				 * 
				 */
				/*try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
				//第一个冲出来的就是第一名
				NO1 = this;
				//然后马上第一名产生 后面出来的人不再执行if语句
				isEnd = true;
			}
			//四个人都跑完了，在打印成绩
			if(num == 4){
				System.out.println("The first one is: " +NO1.name);
				//所有人跑完了，计算钱数
				new GetResult(gj).setMoney();;
			}
		}
		
	}
}
