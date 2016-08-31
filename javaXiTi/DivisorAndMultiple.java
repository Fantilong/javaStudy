import java.util.*;
public class DivisorAndMultiple{
	public static void main(String[] args){
		int num1,num2,divisor,multiple;
		Scanner input = new Scanner(System.in);/*Scanner类是一个用于扫描输入文本的新的实用类，对象调用下列方法(函数),读取用户在命令行输入的各种数据类型next.Byte(),nextDouble(),nextFloat,nextInt(),nextLine(),nextLong(),nextShot()　上述方法执行时都会造成堵塞,等待用户在命令行输入数据回车确认.例如,拥护在键盘输入12.34,hasNextFloat()的值是true,而hasNextInt()的值是false. NextLine()等待用户输入一个文
本行并且回车,该方法得到一个String类型的数据*/
		Mathod mathodOb = new Mathod();//这是另一个有求公约数方法的类
		System.out.print("键入正整数1：");
		num1 = input.nextInt();//表示要输入的是int类型的数据
		while(num1 <= 0){
			System.out.print("你妹啊！我要的是正正正整数：");
			num1 = input.nextInt();
		}
		//确保输入数值大于0
                System.out.print("键入正整数2：");
                num2 = input.nextInt();
		while(num2 <= 0){
                	System.out.print("你妹啊！我要的是正正正整数：");
                        num2 = input.nextInt();
                }
		divisor = mathodOb.mathod(num1,num2);//调用求最大公约方法
		multiple = num1 * num2 / divisor;//求最小公倍数
		System.out.print("最大公约数是 " + divisor);
		System.out.print(" 最大公倍数是 " + multiple);
	}
}
