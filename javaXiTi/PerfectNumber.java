public class PerfectNumber{
	public static void main(String[] args){
		for(int a = 1;a <= 10000;a++){
			int b = 0;
			for(int i = 1;i < a;i++){
				if(a % i == 0){
					b = b + i;
				}
			}
			if(b == a){
                        	System.out.print(" 完数是：" + a);
                        }
		}
	}
}
