public class reMathod2{
	public static void main(String[] args){
		int pep = 5,age = 10;
		System.out.print("第五个人的岁数是：" + reMathod(pep));
	}
	public static int reMathod(int m){
		if(m == 1){
			return 10;
		}else {
			return 2 + reMathod(m - 1);
			}
	}
}
