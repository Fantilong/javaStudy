public class Rabbit{
public static void main(String[] args){
/*本质就是将之前的两个数相加*/
	int rabbit01 = 1,rabbit02 = 1,mouthRabbitTotal,mouth = 24;
	System.out.println("第1个月的兔子数量是 " + (rabbit01 + rabbit02));
        System.out.println("第1个月的兔子数量是 " + (rabbit01 + rabbit02));
	for(int a = 3;a < mouth;a++){
		mouthRabbitTotal = rabbit01 + rabbit02;//将前两个数相加，一直循环
		rabbit01 = rabbit02;//将第二个数赋第一个数
		rabbit02 = mouthRabbitTotal;//将最后一个数赋给第一个数
		System.out.println("第 " + a + "个月的兔子数量是 " + mouthRabbitTotal);
	}	
}
}
