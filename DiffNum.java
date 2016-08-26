public class DiffNum{
	public static void main(String[] args){
		int all = 0;
		for(int x = 1;x < 5;x++){
			for(int y = 1;y < 5;y++){
				for(int z = 1;z < 5;z++){
					if(x != y && y != z && z != x){
						all++;
						
					}
				}
			}
		}
		System.out.print("一共有：" + all + "次");
	}
}
