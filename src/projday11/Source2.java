package projday11;

class BMI{
	public float returnWeight(String str) {
		String[] s = str.split("@");
		String[] a = s[0].split("-");
		String weight = a[0]+"."+a[1];
		return Float.parseFloat(weight);
	}
	
	public float returnheight(String str) {
		String[] s = str.split("@");
		String[] a = s[1].split("-");
		String height = a[0]+"."+a[1];
		return Float.parseFloat(height);
	}
	
	public float calculateBMI(float height,float weight) {
		try {
			if(height==0||weight==0) {
				throw new IllegalArgumentException("Divide by zero error");
			}
			else {
				float bmi = weight/(height*height);
				return bmi;
			}
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		return -1;
	}
	
	public String checkStatus(float bmi) {
		if(bmi>=20&&bmi<=24) {
			return "nourished";
		}
		else {
			return "malnourished";
		}
	}
}

public class Source2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMI b = new BMI();
		String str = "68-33@1-78";

		float wt=b.returnWeight(str);
		float ht=b.returnheight(str);
		float calcBmi = b.calculateBMI(ht, wt);
		System.out.println(b.calculateBMI(ht, wt));
		System.out.println(b.checkStatus(calcBmi));

	}

}
