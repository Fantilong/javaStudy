import java.util.*;
public class MoneyAward{
	public static void main(String[] args){
                double input = 0,money = 0;
		boolean switche = true;
		String a = null;
		Scanner userInput = new Scanner(System.in);
		System.out.print("请输入利润：");
		while(switche){
			if(userInput.hasNextInt()){
				a = userInput.next();
				switche = false;
			}else {
				System.out.print("你他妈的输错了：");
				userInput.next();
				}
		}
		input = Integer.parseInt(a);
		if(input > 0 && input <= 10){
			money = input*0.01;
		}else if(input > 10 && input <= 20){
				money = 10*0.1 + (input - 10) * 0.075;
			}else if(input > 20 && input <= 40){
					money = 10*0.1 + 10*0.075 + (input - 20) * 0.05;
				}else if(input > 40 && input <= 60){
						money = 10*0.1 + 10*0.075 +20*0.05 + (input - 40) * 0.03;
					}else if(input > 60 && input <= 100){
							money = 10*0.1 + 10*0.075 +20*0.05 + 20*0.03 + (input - 60) * 0.015;
						}else if(input > 100){
								money = 10*0.1 + 10*0.075 +20*0.05 + 20*0.03 + 40*0.015 + (input - 100) * 0.01;
							}
		System.out.print("奖金是：" + money);
	}
}
