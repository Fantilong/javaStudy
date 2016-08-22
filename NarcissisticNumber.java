public class NarcissisticNumber{
	public static void main(String[] args){
		int unit,ten,hundred;
		for(int number = 101;number < 200;number++){
			hundred = number/100;
			ten = number % 100 /10;
			unit = number % 10;
			if(hundred*hundred*hundred + ten*ten*ten + unit*unit*unit == number){
				System.out.print("水仙花数是 " + number);
			}
		}
	}
}
