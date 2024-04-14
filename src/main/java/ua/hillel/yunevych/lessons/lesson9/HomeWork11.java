package ua.hillel.yunevych.lessons.lesson9;

import java.util.Scanner;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість рядків M: ");
        int M = scanner.nextInt();
        System.out.print("Введіть кількість стовпців N: ");
        int N = scanner.nextInt();

        // Створюємо вхідну матрицю M x N та транспоновану матрицю N x M
        int[][] mat = new int[M][N];
        int[][] transp= new int[N][M];

        // Зчитуємо елементи вхідної матриці
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        // Транспонуємо матрицю
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                transp[j][i] = mat[i][j];
            }
        }

        System.out.println("Транспонована матриця:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(transp[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

