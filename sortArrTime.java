package com.wachman;

public class sortArrTime {
    public static void main(String[] args) {

    int[] arr =  {7,3,9,2};
        for (int i = 0; i < arr.length; i++) {
            int finalI = i;
            setTimeout(() -> System.out.println(arr[finalI]), arr[i] * 100);
        }    }

    public static void setTimeout(Runnable runnable, int delay){ //setTimeout function
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
