public class reMathod1{
	public static void main(String[] args){
		int num = 5;
		System.out.print("num阶乘等于：" + mathod(num));
	}
	public static long mathod(int n){
		long str = 0;
		if(n == 1){
			str = 1;
		}else {
			str = n * mathod(n - 1);
			}
		return str;
	}
}
