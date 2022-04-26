package com.Exercise9;

public class Task2 {
    public static void exceptionHandler(int value){
        int val;
        int arr[] = new int[4];

        try {
            if(value == 0){
                val = 3/value;
                System.out.println(val);
            }else if (value == 1){
                arr[6]=6;
            }
        }catch (ArithmeticException e){
            System.out.println("The number is not divisible by 0");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The index is out of bounds");
        }finally {
            System.out.println("This is done running");
        }
    }

}
class Demonstration{
    public static void main(String[] args) {
        for (int i = 0;i< 5;i++){
            Task2.exceptionHandler(i);
            System.out.println();
        }
    }
}
