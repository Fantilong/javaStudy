import java.util.Scanner;
public class XiTi29{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[][] num = new int[3][3];
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 3;j++){
				System.out.print("请输入一个整数：");
				String a = input.nextLine();
           			if (a.matches("(|\\+|-)[0-9]+")){//用正则表达式验证输入是否是数字
               				num[i][j] = Integer.parseInt(a);
				}else {
               				System.out.println("输错了请重输：");
					}
			}
		//	System.out.println(num[i][j] + " ");
		}
                int str = 0;
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 3;j++){
				if(i == j){
					str += num[i][j];
				}
			//	System.out.print(num[i][j] + " ");
			}
		//	System.out.println();
		}
		System.out.print("等于：" + str);
	}
}
