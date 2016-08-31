public class TestMathod{
	public static void main(String[] args){
		int a = 4,b = 5,divisor,multiple;
		Mathod ob = new Mathod();
		divisor = ob.mathod(a,b);
		multiple = a*b/divisor;
		System.out.print("最大公约数是 " + divisor);
		System.out.print(" 最大公倍数是 " + multiple);
	}
}
