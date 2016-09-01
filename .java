public class XYZ{
	public static void main(String[] args){
		int x = -234,y = -56756,z = 3467,num;
	//	while(x >= 0 && y >= 0 && z >= 0){
			if(x > y){
				num = y;
				y = x;
				x = num;
				if(x > z){
					num = z;
					z = x;
					x = num;	
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
				y = num;
			}
		//	if(y > z){
		//		y = z;
		//	}
		System.out.print("由大到小排列" + x +" " + y + " " + z);
	//	break;
	//	}
	}
}
