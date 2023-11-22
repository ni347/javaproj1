package projday10;

class BMI{
	public float returnWeight(String str) {
		return Float.parseFloat(str.split("@")[0].replace("-", "."));
	}
	
	public float returnHeight(String str) {
		return Float.parseFloat(str.split("@")[1].replace("-", "."));
	}
	
	public float calculateBMI(float height, float weight) {
		try {
			if(height==0||weight==0) {
//				return -1;
				throw new IllegalArgumentException();
			}
		}catch(IllegalArgumentException e) {
			return -1;
		}
		return weight/(height*height);

	}
	
	public String checkStatus(float bmi) {
		if(bmi>20&&bmi<24) {
			return "nourished";
		}
		else {
			return "malnourished";
		}
	}
}

public class Source {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="68-33@1.78";
		BMI bmi = new BMI();
		float wt = bmi.returnWeight(str);
		float ht = bmi.returnHeight(str);
		float calcBmi = bmi.calculateBMI(ht, wt);
		System.out.println(calcBmi);
		System.out.println(bmi.checkStatus(calcBmi));
	}
}