package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int max = 0;
        int ollMax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив создаваемого массива: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println("Созданный массив: " + Arrays.toString(myArray));
        System.out.println("Максимальное кол-во подряд идущих элементов массива: ");
        for (int j = 0; j < myArray.length; j++) {
            for (int a = 0; a < myArray.length; a++) {
                if (myArray[j] == myArray[a]) {
                    max++;
                } else {
                    if (max > ollMax) {
                        ollMax = max;
                    }

                    max = 1;
                    break;

                }
            }
        }

        System.out.println(ollMax);
    }
}



