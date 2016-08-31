public class Number{
	public static void main(String[] args){
		char[] t2 = {'x','y','z'};
		char[] t1 = {'a','b','c'};
		for(int i = 0;i < t1.length;i++){
			for(int j = 0;j < t2.length;j++){
				if(t1[i] == 'a' && t2[j] == 'x'){
					continue;
				}else if(t1[i] == 'a' && t2[j] == 'y'){
						continue;
					}else if(t1[i] == 'c' && t2[j] == 'x' 
						|| t1[i] == 'c' && t2[j] == 'z'){
							continue;
						}else if(t1[i] == 'b' && t2[j] == 'y' 
							|| t1[i] == 'b' && t2[j] == 'z'){
							continue;
							}else System.out.println(t1[i] + "VS" + t2[j]);
			}
		}
	}
}
