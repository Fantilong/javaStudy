public class YearMouthDay{
	public static void main(String[] args){
		int year = 2100,mouth = 3,day = 5,numOfMouth;
		for(int i = 1;i < mouth;i++){
			if(i == 4 || i == 6 || i == 9 || i == 11){
				numOfMouth = 30;
			}else if(i == 2){
					if(year%4 == 0 && year%100 != 0){
						numOfMouth = 28;
					}else {
						numOfMouth = 29;
						}
				}else {
					numOfMouth = 31;
					}
			day += numOfMouth;
		}
		System.out.print("是第：" + day + "天");
	}
}
