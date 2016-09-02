/*请问还有更好的方法吗？下面我写了一个方法，不过我觉得太麻烦了！
*/
import java.util.*;
public class XiTi28a{
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                int[] num = new int[10];
                System.out.println("请输入十个整数");
                for(int i = 0;i < 10;i++){
                        boolean s = true;
                        while(s){
                                System.out.print("第 " + (i + 1) + " 个：");
				if(input.hasNextInt()){//这里的if条件只能验证一次,
						       //输入错误则会陷入无限循环
						       //怎么使他能再次输入？
						       //只要输入错误则再次输入并验证输入
					num[i] = input.nextInt();
					s = break;
				}else {
					System.out.print("输错了请重输：");
					}
			//	if(num[i] != 0){
			//		s = false;
			//	}
                        }
                }
        }
}
