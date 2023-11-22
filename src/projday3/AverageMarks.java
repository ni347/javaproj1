package projday3;
//import java.text.DecimalFormat;

public class AverageMarks {
	
	public double avgMarks(double a, double b, double c) {
		return ((a+b+c)/300)*100;
	}
	
	public double avgMarks(double a, double b, double c, double d, double e) {
		return ((a+b+c+d+e)/500)*100;
	}
	
	public double avgMarks(double a, double b, double c, double d, double e, double f, double g) {
		return ((a+b+c+d+e+f+g)/700)*100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageMarks per  = new AverageMarks();
//		DecimalFormat df = new DecimalFormat("0.00");
		String name = "Nick";
		System.out.println(per.avgMarks(90, 90, 90));
		System.out.println(per.avgMarks(90, 69, 64, 93,93));
//		double z = per.avgMarks(90, 95, 83, 93, 63, 94, 92);
//		System.out.println(df.format(z));
//		System.out.printf("%.2f",per.avgMarks(90, 95, 83, 93, 63, 94, 92)); // to print 2 digit after decimal
//		System.out.format("%.2f",per.avgMarks(90, 95, 83, 93, 63, 94, 92)); // to print 2 digit after decimal
//		System.out.format("%s %.2f",name,per.avgMarks(90, 95, 83, 93, 63, 94, 92)); // to add string in lowercase
		System.out.format("%S %.2f",name,per.avgMarks(90, 95, 83, 93, 63, 94, 92)); // to add string in uppercase
	}

}
