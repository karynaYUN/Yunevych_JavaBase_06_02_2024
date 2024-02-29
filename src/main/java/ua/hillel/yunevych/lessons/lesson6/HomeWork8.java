package ua.hillel.yunevych.lessons.lesson6;
import java.util.Arrays;

public class HomeWork8 {

        public static void main(String[] args) {
            int[] BadNumbers = new int[100];
            int count = 0;

            while (count < 100) {
                int number = (int) (Math.random() * 100) + 1;
                if (!String.valueOf(number).contains("4") && !String.valueOf(number).contains("9")) {
                    BadNumbers[count] = number;
                    count++;
                }
            }
            System.out.println(" Шатлі без нещасливих чисел:");
            System.out.println(Arrays.toString(BadNumbers));
        }
    }

