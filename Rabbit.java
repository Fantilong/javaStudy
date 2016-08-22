public class Rabbit{
public static void main(String[] args){
	int rabbit01 = 1,rabbit02 = 1,mouthRabbitTotal,mouth = 24;
	System.out.println("第1个月的兔子数量是 " + (rabbit01 + rabbit02));
        System.out.println("第1个月的兔子数量是 " + (rabbit01 + rabbit02));
	for(int a = 3;a < mouth;a++){
		mouthRabbitTotal = rabbit01 + rabbit02;
		rabbit01 = rabbit02;
		rabbit02 = mouthRabbitTotal;
		System.out.println("第 " + a + "个月的兔子数量是 " + mouthRabbitTotal);
	}	
}
}
