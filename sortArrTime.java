package com.wachman;
import java.util.Stack;

public class sortArrTime {
    public static void main(String[] args) {

    int[] arr =  {7,3,9,2};
        sortArr(arr);
    }

    public static void sortArr(int[] arr){
        Stack<Integer> copy = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int finalI = i;
            setTimeout(() -> copy.push(arr[finalI]), arr[i]*100);
        }
        setTimeout(() -> printSort(copy,arr), arr[1]*400);
    }


    public static void printSort (Stack<Integer> copy, int[] arr){
        for (int i = arr.length-1; i >=0 ; i--) {
            arr[i]=copy.pop();
        }
    for (int j : arr) {
      System.out.println(j);
        }
    }

    public static void setTimeout(Runnable runnable, int delay){
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            }
            catch (Exception e){
                System.err.println(e);
            }
        }).start();
    }

}
