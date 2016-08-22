public class PrimeNumber{
	public static void main(String[] args){
		for(int a = 101;a < 150;a++){
			for(int b = 2;b <= 4;b++){
				if(a/b != 0){
					System.out.println("素数是 " + a + " ");
				}
			break;
			}
		}
	}
}
