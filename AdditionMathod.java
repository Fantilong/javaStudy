public class AdditionMathod{
	public int additionMathod(int input,int numOf){
		int result = 0;int a = 10;
		for(int i = 0;i < numOf;i++){
			if(i == 0){
				a = 1;
			}else a = a*10;
			result += result + input*a;
		}
	return result;
	}
}
