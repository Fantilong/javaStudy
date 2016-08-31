public class NarcissisticNumber{
	public static void main(String[] args){
		int unit,ten,hundred;
		for(int number = 101;number < 200;number++){
			hundred = number/100;//除以100得出百位数，因为init类型会自动将得出double类型数据转换
			ten = number % 100 /10;//取百位数的余再除以10得到十位数
			unit = number % 10;//去十位数的余得出个位数
			if(hundred*hundred*hundred + ten*ten*ten + unit*unit*unit == number){
				System.out.print("水仙花数是 " + number);
			}
		}
	}
}
