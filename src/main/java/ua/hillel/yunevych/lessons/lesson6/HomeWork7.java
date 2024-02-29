package ua.hillel.yunevych.lessons.lesson6;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

                final int MIN = 0;
                final int MAX = 10;
                final int MAX_ATTEMPTS = 3;

                int secretNumber = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
                int attempts = 0;
                int guess;

                System.out.println("Вгадайте число в діапазоні від " + MIN + " до " + MAX);
                System.out.println("У вас є " + MAX_ATTEMPTS + " спроби.");

                while (attempts < MAX_ATTEMPTS) {
                    System.out.print("Введіть ваше число: ");

                    while (!in.hasNextInt()) {
                        System.out.println("Будь ласка, введіть ціле число.");
                        in.next();
                    }

                    guess = in.nextInt();
                    in.nextLine();

                    if (guess < MIN || guess > MAX) {
                        System.out.println("Введене число повинно бути в діапазоні від " + MIN + " до " + MAX + ".");
                        continue;
                    }

                    if (guess == secretNumber) {
                        System.out.println("Вітаємо! Ви вгадали число " + secretNumber);
                        return;
                    } else {
                        System.out.println("Спроба " + (attempts + 1) + ": Не вірно.");
                        if (guess < secretNumber) {
                            System.out.println("Шукане число більше.");
                        } else {
                            System.out.println("Шукане число менше.");
                        }
                    }
                    attempts++;
                }

                System.out.println("На жаль, ви не вгадали.Число було: " + secretNumber);
            }
        }


