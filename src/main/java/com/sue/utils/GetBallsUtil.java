package com.sue.utils;

import java.util.TreeSet;

public class GetBallsUtil {
    public static String getBalls(){
        String s = "";
        TreeSet <Integer> set = new TreeSet<>();

        while(set.size()<2){
            set.add((int) Math.ceil(10*Math.random())+1);
        }
        while(set.size()<4){
            set.add((int) Math.ceil(10*Math.random()+12));
        }
        while(set.size()<6){
            set.add((int) Math.ceil(10*Math.random()+23));
        }
        int  b = (int) Math.ceil(16*Math.random());

        for(Integer i :set){
            s += i+" ";
        }
        return s += b;
    }
    public static void main(String[]args){
        System.out.println(getBalls());
    }
}
