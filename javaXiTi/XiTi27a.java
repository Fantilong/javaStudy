public class XiTi27a{
	public static void main(String[] args){
		int[] a = new int[]{2,3,5,7};
		for(int i = 0;i < 4;i++){
			System.out.print(a[i] + " ");
		}
		boolean b = false;
		for(int j = 11;j < 120;j += 2){
			for(int i = 0;i < 4;i++){
				if(j % a[i] == 0){
					b = false;
					break;
				}else {
					b = true;
					}
			}
			if(b == true){
				System.out.print(j + " ");
			}
		}
	}	
}
