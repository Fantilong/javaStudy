import java.util.*;
public class Week{
	public char getCharM(){
		Scanner getInput = new Scanner(System.in);//系统输入
		String input = getInput.nextLine();//获得输入String
		char firL = input.charAt(0);//.charAt(0)获得字符串的第一个字符
		if((firL < 'A' || firL > 'Z') && (firL < 'a' || firL > 'z')){//主义逻辑运算符的ture和false
			System.out.print("输入错误！不知道星期怎么拼吗？你妹的！再输：");
			firL = getCharM();//递归
		}
	return firL;
	}
}
