import java.util.*;
public class XiTi33{
	public static void main(String[] args){
		int[][] num = new int[3][3];
		for(int i = 0;i < 3;i++){
			num[i][i] = 1;
			num[i][0] = 1;
		}
		for(int i = 2;i < 3;i++){
			for(int j = 1;j < i;j++){
				num[i][j] = num[i - 1][j -1] + num[i - 1][j];
			}
		}
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 3;j++){
				System.out.print(num[i][j] + " ");
			}	
                                System.out.println();
		}
	}
}
