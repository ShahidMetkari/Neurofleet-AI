package Arrayspart1;

import java.util.Scanner;

public class Creation {
    public static void main(String[] args) {
        int marks[] = new int[5];

        // i/p, o/p
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy :" + marks[0]);
        System.out.println("chem :" + marks[1]);
        System.out.println("math :" + marks[2]);

        marks[2] = 100;
        System.out.println("math :" + marks[2]);

        // length of array
        System.out.println("length of array: " + marks.length);
    }
} 
