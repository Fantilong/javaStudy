public class BounceBall{
	public static void main(String[] args){
		int high = 100;double s = 100;
		for(int a = 1;a > 0;a++){
			high /= 2;
			s = s + high;
			if(a == 10){
				double b = high;
				System.out.print("第十次反弹高度为：" + b + "米");
				System.out.println("总共经过：" + s + "米");
			}
		}
	}
}
