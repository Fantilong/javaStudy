public class FenShuXiangJia{
	public static void main(String[] args){
		int x = 1,y = 1,num;
		double st = 0;
		for(int i = 0;i < 20;i++){
			num = y;
			y = x;
			x = x + num;
                        st += (double)x/y;
		}
	System.out.print("前多少项之和是：" + st);
	}
}
