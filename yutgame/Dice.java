package com.sd.yutgame;

public class Dice {
    private int number=0;
    public int roll(){
        this.number=(int)(Math.random()*6)+1;
        return number;
    }
    public void setNum(int Num){
        this.number=Num;
    }
    public int getNum(){
        return number;
    }
}