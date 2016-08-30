public class Rhombus{
	public static void main(String[] args){
		int row = 6;
		for(int loopNum = 1 ; loopNum <= row ; loopNum++){
			if(loopNum <= row/2){
				for(int locVariable1 = 1 ; locVariable1 <= row/2 - loopNum ; locVariable1++){
					System.out.print(" ");
				}
				if(loopNum > 1){
					for(int locVariable2 = 1 ; locVariable2 <= 2*loopNum - 1 ; locVariable2++){
						if(locVariable2 == 1 || locVariable2 == 2*loopNum - 1){
							System.out.print("*");
						}else{
						 	 System.out.print(" ");
						     }
					}
				}else{
				     System.out.print("*");
				     }
			}else{
				for(int locVariable3 = 1 ; locVariable3 <= loopNum - (row/2 + 1) ; locVariable3++){
					System.out.print(" ");
				}
			    	for(int locVariable4 = 1 ; locVariable4 <= (2*row - 2*loopNum) + 1 ; locVariable4++){
					if(locVariable4 == 1 || locVariable4 == (2*row - 2*loopNum) + 1){
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
