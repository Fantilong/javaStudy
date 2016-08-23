public class Mathod{
	int t,divisor;
	public int mathod(int x,int y){
		if(x < y){
			t = x;
			x = y;
			y = t;
			divisor = y / (x % y);
		}else if(x == y){
				divisor = x;
			}else divisor = y / (x % y);
	return divisor;
	}
}
