package ua.hillel.yunevych.lessons.lesson8;

import java.util.Arrays;

public class HomeWork10 {
    public static void main(String[] args) {
        int [] lenghth1=new int[7];
        int [] lenghth2=new int[7];
        int bingo =0;

        for(int i=0; i<lenghth1.length; i++){
            int random1 = (int) Math.random() * 10;
        }

        for(int i=0; i<lenghth2.length; i++){
            int random2 = (int) Math.random() * 10;
        }

        Arrays.sort(lenghth1);
        Arrays.sort(lenghth2);

        System.out.println("Перший масив:");
        System.out.println(Arrays.toString(lenghth1));
        System.out.println("Другий масив:");
        System.out.println(Arrays.toString(lenghth2));

        for(int i=0; i<lenghth1.length; i++){
            if (lenghth1[i] == lenghth2[i]) {
                bingo++;
            }
        }
        System.out.println("Кількість збігів: " + bingo);
    }
}
