public class XiTi24{
	public static void main(String[] args){
		int input = 3452;
		String a = Integer.toString(input);
		char[] gr = a.toCharArray();
		System.out.print("gr长度是：" + gr.length);
		for(int i = gr.length - 1;i >= 0;i--){
			System.out.print("倒序输出：" + gr[i]);
		}
	}
}
