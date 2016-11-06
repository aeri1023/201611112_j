class ComputeGrade {
	String grade;
	void computeGrade(double marks){
		if(90<=marks && marks <=100){
			grade="A";
		}
		else if(80<=marks && marks < 90){
			grade="B";
		}
		else if(70<=marks && marks < 80){
			grade="C";
		}
		else if(60<=marks && marks < 70){
			grade="D";
		}
		else{
			grade="F";
		}
		
		System.out.println("score : "+marks+" grade: "+grade);
	}
	
	public static void main(String[] args) {
		ComputeGrade c=new ComputeGrade();
		c.computeGrade(85);
	}
}