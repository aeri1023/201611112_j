class Numlist{
    void NumList(){
        java.util.ArrayList<Integer> Num=new java.util.ArrayList<java.lang.Integer>();
        for (int i=1;i<1000;i++){
            if (i%4==0 && i%5!=0){
                Num.add(i);
            }
        }
        System.out.print(Num);
    }

    public static void main(String[] args) {
        Numlist n = new Numlist();
        n.NumList();
	}

}