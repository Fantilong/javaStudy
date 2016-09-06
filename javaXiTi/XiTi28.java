import java.util.*;
public class XiTi28{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];
		System.out.println("请输入十个整数");
		for(int i = 0;i < 10;i++){
			boolean s = true;
			while(s){
				String a;
				System.out.print("第 " + (i + 1) + " 个：");
				a = input.next();
				try{
					num[i] = Integer.parseInt(a);
				}catch(NumberFormatException e){
					System.out.print("输错了，请重输：");
					}
				if(num[i] != 0){
					s = false;
				}
			}
		}
		//顺序输出整数数组
		for(int j = 0;j < num.length;j++){
			for(int x = j + 1;x < num.length;x++){
				if(num[j] > num[x]){
					int l = num[j];
					num[j] = num[x];
					num[x] = l;
				}
			}
                System.out.print(num[j] + " ");
		}
	}
}
