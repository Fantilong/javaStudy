import java.util.*;
public class XiTi31{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] num = new int[5];
		int i = 0,j;
		do{
			System.out.print("请输入一个数字：");
       			String a = input.nextLine();
               		if (a.matches("(|\\+|-)[0-9]+")){//用正则表达式验证输入是否是数字
               			num[i] = Integer.parseInt(a);
       			//	b = false;
       			}else {
               	       		System.out.println("输错了请重输：");
       				}
			i++;
		}while(num [i] != -1 || i == 5);
	}
}
