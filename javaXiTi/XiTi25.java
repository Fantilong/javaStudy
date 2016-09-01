public class XiTi25{
	public static void main(String[] args){
		int input = 12321;
	//	String a = String.valueOf(input);
		char[] str = String.valueOf(input).toCharArray();
		if(str[0] == str[4] && str[1] == str[3]){
			System.out.print("input是一个回文数");
		}else {
			System.out.print("input不是一个回文数");
			}
	}
}
