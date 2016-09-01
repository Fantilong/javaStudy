import java.util.*;
/*
Switch case default语句的用法!
1.default就是如果没有符合的case就执行它,default并不是必须的.
 
2.case后的语句可以不用大括号. case 后面必须是常量表达式constant expressions,
   错误表示如: case x .
 
3.switch语句的判断条件可以接受int,byte,char,short, enum不能接受其他类型.
 
4.一旦case匹配,就会顺序执行后面的程序代码,而不管后面的case是否匹配,
  直到遇见break,利用这一特性可以让好几个case执行统一语句.

switch(这里是一个条件){
	case 与switch条件比较满足则执行后面的代码#执行代码后面接的是冒号冒号冒号：
	代码代码代码
	break；控制流程满足上一个case条件，执行完代码后跳出switch。也可行不写break；
	       则继续验证后面的case。
	default:如果上面的case都不满足则执行default后的代码。
}
				
*/
public class XiTi26{
	public static void main(String[] args){
		char m,n,h;
		boolean a = true;
		Week Ob = new Week();
		System.out.print("请输入星期的首字母：");
		m = Ob.getCharM();
		switch(m){
			case 'M'://如果是这个值#主义值后面是冒号（：）
			case 'm':
			System.out.print("Monday");//执行语句
			break;//如果是这种情况，执行代码完毕则跳出switch
			case 'W':
			case 'w':
			System.out.print("Wednesday");
			break;
			case 'F':
			case 'f':
			System.out.print("Friday");
			break;
			case 'T':
			case 't': {
				System.out.print("请输入第二个数字");
				while(a){
	                                n = Ob.getCharM();//取得输入值
					if(n == 'U' || n == 'u'){
						System.out.print("Tuesday");
						a = false;
					}else if(n == 'H' || n == 'h'){
							System.out.print("Thursday");
							a = false;
						}else {
							System.out.print("输错了！再次输入：");
							}
				}
			}
			break;
			case 'S':
                        case 's': {
                                System.out.print("请输入第二个数字");
				while(a){
                                	h = Ob.getCharM();
                                	if(h == 'U' || h == 'u'){
                                        	System.out.print("Sunday");
						a = false;
                                	}else if(h == 'A' || h == 'a'){
                                                	System.out.print("Saturday");
							a = false;
                                        	}else {
                                                	System.out.print("输错了！再次输入：");
                                                }
				}
                        }
			break;
		default:System.out.print("你输入的不是星期首字母！");//如果所有的case情况都不是则执行default后的代码#default后是冒号
		}
	}
}
