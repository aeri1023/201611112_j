class StringBuffer{
    void Triangle(int n){
            String s="*";
            String a=" ";
            
            for(int i=1;i<=n;i++){
                for (int j=1;j<=i;j++){
                    System.out.printf(s);
                }
                for (int k=1;k>i;k++){
                    System.out.printf(a);
                }
            System.out.printf("\n");
            }
    }
	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	sb.Triangle(10);
	}
}