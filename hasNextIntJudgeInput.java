import java.util.Scanner;
 
public class hasNextIntJudgeInput {
    public static void main(String[] args) {
        System.out.println("请输入运算的数字：");
        Scanner s1 = new Scanner(System.in), s2 = new Scanner(System.in);
        String l1 = null, l2 = null;
        boolean flag = true;
        while (flag) {
            if (s1.hasNextInt()) {
                l1 = s1.next();
                flag = false;
            } else {
                System.out.println("运算数字输入不合法请重新输入:");
                l1 = s1.next();
            }
        }
        System.out.println("请输入运算的次数:");
        flag = true;
        while (flag) {
            if (s2.hasNextInt()) {
                l2 = s2.next();
                flag = false;
            } else {
                System.out.println("运算次数输入不合法请重新输入:");
                l2 = s2.next();
            }
        }
        System.out.println("计算结果为：" + additionMethod(l1, l2));
    }
    private static long additionMethod(String data, String times) {
        int l1 = Integer.parseInt(data);
        int l2 = Integer.parseInt(times);
        long l = l1;
        for (int i = 0; i < l2; i++) {
            l += l1;
        }
        return l;
    }
}
