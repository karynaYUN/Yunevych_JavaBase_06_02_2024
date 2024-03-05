package ua.hillel.yunevych.lessons.lesson7;
import java.util.Arrays;

public class HomeWork9 {
    public static void main(String[] args) {
        //З початку я зробила команди по 25 людей
        int[] team1 =new int [25];
        int [] team2 =new int [25];
        //Потім роблю так щоб для кожного гравця першої та другої команди
        //був рандомний вік для кожної людини
        for (int i=0; i<team1.length; i++){
            team1[i] = (int) (Math.random()*23)+18;
        }
        for(int i=0; i<team1.length; i++){
            team2[i] =(int) (Math.random()*23)+18;
        }
        //Зараз демонструю вік всіх гравців
        System.out.println("Вік гравців першої команди:");
        for(int i=0; i<team1.length; i++){
            System.out.print(team1[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Вік гравців другої команди:");
        for(int i=0; i<team2.length; i++){
            System.out.print(team2[i] + " ");
        }
    }
}
