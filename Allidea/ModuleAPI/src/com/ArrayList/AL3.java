package com.ArrayList;

import java.util.ArrayList;

public class AL3 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        arr.add("Java");
        String s="";
        for(int i=0;i<arr.size();i++)
        {
            s+=arr.get(i)+" ";
        }
        System.out.println(s);
    }
}
