package com.Exercise9;
import java.io.*;

public class Task1 {
    public static String generateExceptionNull(){
       String str = null;
       return str;

    }
}

class Demo {
    public static void main(String[] args) {
        try{
            String nelly = Task1.generateExceptionNull();
            nelly.toString();
        }catch (NullPointerException e){
            e.printStackTrace();
            e.toString();
        }

    }
}
