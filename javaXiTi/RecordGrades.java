public class RecordGrades{
	public static void main(String[] args){
		int grades = 68;
		char level;
		level = grades >= 90 ? 'A' : grades >= 60 ? 'B' : 'C';//运算符嵌套运算，相当于if else循环。？相当于if，前面相当于条件后面相当于结果。：相当于否则！
		System.out.print("等级 = " + level);
	}
}
