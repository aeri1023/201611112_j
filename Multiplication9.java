class Multiplication9{
    void dan(){
        int[] x={1,2,3,4,5,6,7,8,9};
        for(int i: x) {
            System.out.printf("\n%d dan -",i);
        for(int j: x) {
            System.out.printf("\t%dx%d=%2d ",i,j,i*j);
        }
        }
    }
    public static void main(String[] args) {
			Multiplication9 m=new Multiplication9();
			m.dan();
	}

        

}