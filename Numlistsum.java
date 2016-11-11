class Numlistsum{
    void NumList_sum(){
        java.util.ArrayList<Integer> Num=new java.util.ArrayList<java.lang.Integer>();
        for (int i=1;i<1000;i++){
            if (i%4==0 && i%5!=0){
                Num.add(i);
            }
        }
        int sum=0;
        for(int s:Num){
            sum+=s;
        } 
        System.out.print(sum);
    }

    public static void main(String[] args) {
        Numlistsum n = new Numlistsum();
        n.NumList_sum();
        
	}

}