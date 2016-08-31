import java.util.*;
public class TypeNumMathod{
	int letter = 0,blank = 0,num = 0,other = 0;
	public void Thenumberofdatatypes(String a){
		for(int b = 0;b < a.length();b++){//.length()能获得String类型中各种数据的个数
			char c = a.charAt(b);//.charAt(1)将String中的第一个数据赋给某个变量
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){//检查是否是英文
				letter++;
			}else if(c == ' '){//检查是否是空格
					blank++;
				}else if(c >= '0' && c <= '9'){//检查是否是数字
						num++;
					}else {
						other++;
						}
		}
	System.out.println("英文 " + letter);
        System.out.println("空格 " + blank);
        System.out.println("数字 " + num);
        System.out.println("其他 " + other);
	}
}
