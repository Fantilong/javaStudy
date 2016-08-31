import java.util.*;
public class CodeTest {
    Scanner sc=new Scanner(System.in);
     
    public void start(){
        System.out.println("请输入第一个整数,");
        String in=sc.next();
        System.out.println("请输入第二个整数");
        String put=sc.next();
        String str="^\\d+$";
        if(in.matches(str)&&put.matches(str)){
            System.out.println("输入正确");
        }else{
            System.out.println("输入错误,请重新输入");
            start();
        }
        }
public static void main(String[] args) {
CodeTest ct=new CodeTest();
ct.start();
}
}
