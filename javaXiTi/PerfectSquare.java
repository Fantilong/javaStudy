public class PerfectSquare{
	public static void main(String[] args){
		for(int x = 1;x <= 100000;x++){
			if(Math.sqrt(x + 100)%1 == 0 && Math.sqrt(x + 268)%1 == 0){
				System.out.print("满足条件的数字是：" + x);
				}
			}
		}
}
