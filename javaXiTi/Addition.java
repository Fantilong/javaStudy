import java.util.*;
public class Addition{
	public static void main(String[] args){
		AdditionMathod mathodOb = new AdditionMathod();//创建方法对象调用运算方法
		Scanner sc = new Scanner(System.in);//Scanner对象调用扫描键盘输入
		boolean flag1 = true,flag2 = true;//判断是否是Int类型数据
		String[] number = new String[2];//储存输入数据
	        Integer[] answer = new Integer[2];//存储解析的Int数据
		/*我要让用户只能输入Int数据，否则提示输入错误。重新输入。现在用了两个boolean值分别判断，
		应该有其他更简单的写法吧？
		*/
		while (flag1) {
				System.out.println("请输入您想运算的数字：");
                        	number[0] = sc.next();//取得输入
				try {
                                        answer[0] = Integer.parseInt(number[0]);//解析输入值并赋给answer
                                } catch (NumberFormatException e) {//抓取异常，不懂NumberFormatException e 是抓取的什么异常？
                                        System.out.println("输入错误，请重新输入");//输出错误提示
                                        sc.nextLine();//感觉多余，注释也能正确运行。
                                        continue;//跳出cathch
                                }
			if (answer[0] != null) {//判断是否有值
                                flag1 = false;//有值则跳出while，因为while条件是true。
                        } else {//这段代码感觉多余？注释也能正确运行。
                                sc.nextLine();//同上
				}//同上
		}
		while(flag2){
			System.out.println("请输入您想运算的次数：");
                        number[1] = sc.next();
                        try {
                        	answer[1] = Integer.parseInt(number[1]);
                        } catch (NumberFormatException e) {
                                System.out.println("输入错误，请重新输入");
                        //      sc.nextLine();
                                continue;
                        }
			if (answer[1] != null) {
                               // System.out.println("测试结束");
                                flag2 = false;
                        } else {
                                sc.nextLine();
                                }
		}
		long c = mathodOb.additionMathod(answer[0],answer[1]);//调用方法运算，用long接受是因为方法运算的数值太大，赋给时可能会丢失数据。
		System.out.print("结果是：" + c);//输出结果
	}
 
}
