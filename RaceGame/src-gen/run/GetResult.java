package run;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GetResult {

	JRadioButton jr_mans[];
	JTextField jtf_cost;
	JLabel jl_money;
	JRadioButton selected;
	public GetResult(GameJFrame gj) {
		
		jr_mans = gj.jr_mans;
		jtf_cost = gj.jtf_cost;
		jl_money = gj.jl_money;
		this.selected = gj.selected;
	}
	
	//计算钱数
	public int getRightMoney(){
		
		int cost = Integer.valueOf(jtf_cost.getText());
		int money = Integer.valueOf(jl_money.getText());
		
		for(JRadioButton jr : jr_mans){
			if(selected.getText().equals(RunningMan.NO1.name)){
				return money + cost;
			}
		}
		return money - cost; 
	}
	//把新出炉的钱数设置在界面上
	public void setMoney(){
		//先计算钱数 再进行清空操作-----------------
		jl_money.setText(getRightMoney()+ "");
		jtf_cost.setText("");
	}
}
