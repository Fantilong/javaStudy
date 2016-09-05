import java.util.*;
public class XiTi30{
	public static void main(String[] args){
		int[] cl = {2,4,5,6,6,8,};
                int[] cl1 = new int[cl.length + 1];
		Scanner input = new Scanner(System.in);
		int i = 0,num = 0;
		boolean b = true;
		System.out.print("请输入一个数字：");
		while(b){
			String a = input.nextLine();
               		if (a.matches("(|\\+|-)[0-9]+")){//用正则表达式验证输入是否是数字
               			num = Integer.parseInt(a);
				b = false;
       			}else {
        	       		System.out.println("输错了请重输：");
       				}
		}
		if(num >= cl[cl.length - 1]){
			cl1[cl1.length - 1] = num; 
			for(int j = i;j < cl.length;j++){
				cl1[j] = cl[j];
			}
		}else {
			for(i = 0;i < cl.length;i++){
				if(num > cl[i]){
					cl1[i] = cl[i];
				}else {
					cl1[i] = num;
					break;
				      }
			}
			for(int j = i + 1;j < cl1.length;j++){
				cl1[j] = cl[j - 1];
			}
		      }
		for(i = 0;i < cl1.length;i++){
			System.out.print(cl1[i] + " ");
		}
	}
}
