public class TestFen{
	public static void main(String[] args){
		int x = 2,y = 1,t;
		double num = 0;
		for(int i = 1;i <= 20;i++){
			num = num + (double)x / y;
			t = y;
			y = x;
			x = x + t;
		}
	System.out.print("一共是：" + num);
	}
}
