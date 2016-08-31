public class LeiCheng{
	public static void main(String[] args){
		int st = 1;
		long st1 = 0;
		for(int a = 1;a <= 20;a++){
			for(int b = 1;b <= a;b++){
				st *= b; 
			}
		st1 =  st1 + st;
		}
	System.out.print("累乘相加等于：" + st1);
	}
}
