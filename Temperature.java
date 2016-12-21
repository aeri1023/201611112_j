class Temperature{
void change(String a, float b){
    float c;
    if(a.equals("F")){
        c=(b-32f)/1.8f;
        System.out.println("user in put "+c+"C");
    }
    else if(a.equals("C")){
        c=(b*1.8f)+32f;
        System.out.println("user in put "+c+"F");
    }
    else{
        System.out.println("user in put error!");
    }
}
public static void main(String[] args){
    Temperature t=new Temperature();
    t.change("F",45);
}
}
