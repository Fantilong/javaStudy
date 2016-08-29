public class SanGeShuPaiXu{
	public void paixuMathod(int x,int y,int z){
		int num;
		if(x > y){
			num = y;;
			y = x;
			x = num;
			if(x > z){
				num = z;
				z = x;
				x= num;
			} 
		}else if(x > z){
				num = z;
				z = x;
				x = num;
				if(x > y){
					num = y;
					y = x;
					x = num;
				}
			}
		if(y > z){
			num = z;
			z = y;
			y= num;
		}
	System.out.print("由小到大输出：" + x + " " + y + " " + z);
	}
}
