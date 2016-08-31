public class ExplodeNumber{
	public static void main(String[] args){
		int num = 92,k = 2;
		/*正整数分解质因数就是玩除法，最小的质数是2.所以依次用2去除以正整数，如果除不尽则给质数增值。否则输出质数并将商赋给正整数，做新一轮的乘法。*/
		System.out.print(num + " = ");
		while(k <= num){//循环，因为答案一定在这个整数以内
			if(k == num){
				System.out.print(num);
				break;
			}else if(num % k == 0){
			      	System.out.print(k + " * ");
				num = num/k;
			      }else k++;
		}
	}
}
