package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Nhập cạnh a: ");
            int a = scanner.nextInt();
            System.out.println("Nhập cạnh b: ");
            int b = scanner.nextInt();
            System.out.println("Nhập cạnh c: ");
            int c = scanner.nextInt();

            Triangle t1 = new Triangle(a, b, c );
        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
