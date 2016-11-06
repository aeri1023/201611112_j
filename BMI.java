class BMI {
	void BMI_(float w, float h) {
		float bmi = (float) w / (h * h);
		System.out.printf("bmi : %f", bmi);
        String mybmi="";
		if (bmi <= 18.5)
			mybmi= "low";
		else if (bmi >= 18.5 && bmi < 23)
			mybmi= "normal";
		else if (bmi >= 23 && bmi < 25)
			mybmi= "risky";
		else if (bmi >= 25 && bmi < 30)
			mybmi= "obesity 1";
		else if (bmi >= 30 && bmi < 40)
			mybmi= "obesity 2";
		else if (bmi >= 40)
			mybmi= "obesity 3";
		else
			mybmi= "error";
        System.out.printf(" Weight : %f kg, Height : %f m grade : %s", w, h, mybmi);
	}
	public static void main(String[] args) {
		float w = (float) 58.0;
		float h = (float) 1.7;
		BMI b = new BMI();
		b.BMI_(w,h);
		
	}
}