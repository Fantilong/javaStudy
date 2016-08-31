import java.util.*;
public class TypeNum{
	public static void main(String[] args){
		String input;
		Scanner inputOb = new Scanner(System.in);//扫描系统输入
		System.out.print("请输入一段字符：");//提示输数据入类型
		input = inputOb.nextLine();//将输入赋给某个变量，nextLine()扫描String类型数据
		TypeNumMathod ob = new TypeNumMathod();
		ob.Thenumberofdatatypes(input);//调用算数据类型个数的方法
	}	
}
