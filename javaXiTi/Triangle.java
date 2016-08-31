public class Triangle{
	public static void main(String[] args){
		int row = 5;
		for(int a = 1 ; a <= row ; a++){
			for(int b = 1 ; b <= row - a ; b++){
				System.out.print(" ");
			}
			
			for(int c = 1 ; c <= 2*a - 1 ; c++){
				if(a == 1 || a == row){
					System.out.print("*");
				}else{
					if(c == 1 || c == 2*a -1){	
						System.out.print("*");
					}else{
					System.out.print(" ");
					}
				}
			}
		System.out.println();
		}
	}
}
