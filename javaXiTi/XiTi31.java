
import java.util.*;
public class XiTi31{
	public static void main(String[] args){
		/*逆序输出数组方法一*/
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();//ArrayList动态数组，比数组要方便。
		boolean b = true;
		while(b){
			int s = 0;
			System.out.print("请输入一个数字:");
			String a = input.nextLine();
			try{
       				s = Integer.parseInt(a);
       			}catch(NumberFormatException e){
       				System.out.print("输错了，请重输：");
       				}
			num.add(s);//添加数据方法.add()
			if(num.size() == 5){//返回数组长度方法.size()
				b = false;
			}
		}
		System.out.print("数组正序是：");
		for(int j = 0;j < num.size();j++){
			System.out.print(num.get(j) + " ");//输出某一个地址的数值的方法.get()
		}
		System.out.print("数组逆序是：");
		for(int j = num.size() - 1;j >= 0;j--){
			System.out.print(num.get(j) + " ");
		}
		/*逆序输出组数方法二*/
	//	int[] num = new int[6];
	//	int i = 0,j;
	/*	do{
			System.out.print("请输入一个数字：");
       			String a = input.nextLine();
               		if (a.matches("(|\\+|-)[0-9]+")){//用正则表达式验证输入是否是数字
               			num[i] = Integer.parseInt(a);
       			}else {
               	       		System.out.println("输错了请重输：");
       				}
			i++;
		}while(i != 5);
	//	System.out.print(" " + i);
		System.out.print("您输入的数组是：");
		for(j = 0;j < i;j++){
			System.out.print(num[j] + " ");
		}
                System.out.print("您输入的数组的逆序是：");
		for(j = 1;j <= i;j++){
			System.out.print(num[i - j] + " ");
		}
	*/
		
	}
}
