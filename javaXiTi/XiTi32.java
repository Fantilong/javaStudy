import java.util.*;
public class XiTi32{
	public static void main(String[] args){
	//	char[] ch = new char[7];
		Scanner input = new Scanner(System.in);
		boolean b = true;
		while(b){
			System.out.print("请输入一个7位整数：");
			String a = input.nextLine();
			char[] ch = a.toCharArray();
			if (a.matches("(|\\+|-)[0-9]+") && ch.length >= 7){//用正则表达式验证输入是否是数字
				System.out.print("截取从右端开始的4～7位是：");
               		 	for(int i = 3;i < ch.length;i++){
                       			System.out.print(ch[i] + " ");
                		}
				b = false;
			}else {
				System.out.print("输错了，请重输：");
				}
		//	String c = Long.toString(s);
		//	char ch = c.toCharArray();
		//	if(ch.length < 7){
		//		System.out.print("请重输,");
		//	}else {
		               // ch = a.toCharArray();
		//		b = false;
		//		}
	//	System.out.print("截取从右端开始的4～7位是：");
	//	for(int i = 3;i < ch.length;i++){
	//		System.out.print(ch[i] + " ");
		}
	}
}
