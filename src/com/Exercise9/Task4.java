package com.Exercise9;
import java.io.*;
import java.util.Scanner;

class AreDivisible extends Exception{
    public AreDivisible(String message){
        super(message);
    }
}
class IsAnOddNumber extends Exception{
    public IsAnOddNumber(String message){
        super(message);
    }
}
class IsNotAnAdult extends Exception{
    public IsNotAnAdult(String message){
        super(message);
    }
}

public class Task4 {
    public static void exceptionCalling(int value, int val){
        try {
            if ((value%val)== 0){
                int result = value/val;
                System.out.println(result);
               throw new AreDivisible("These numbers are divisible");
            }else if((value%val) != 0){
                double result = value/val;
                System.out.println(result);
                throw new IsAnOddNumber("These numbers are divisible by each other but give a remainder");
            }
        }catch (AreDivisible e){
            System.out.println(e);
        }catch (IsAnOddNumber e){
            System.out.println(e);
        }

    }
    public static void adultCalculator(int age){
        try{
            if(age < 18){
                throw new IsNotAnAdult("You are under 18 years and not an Adult");
            }else{
                System.out.println("You are an Adult :)");
            }

        }catch(IsNotAnAdult anAdult){
            System.out.println(anAdult);
        }
    }
}

class DemoForThis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first value");
        int firstValue = sc.nextInt();
        System.out.println("Please enter the second value");
        int secondValue = sc.nextInt();
        Task4.exceptionCalling(firstValue,secondValue);
    }
}
class DemoForAdultException{
    public static void main(String[] args) {
        Scanner ageInput = new Scanner(System.in);
        System.out.println("Please Enter your Age:");
        int num = ageInput.nextInt();
        Task4.adultCalculator(num);
    }
}
