package com.prakticum;

import java.util.Scanner;

public class learn_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� � ��� ������: ");
        double balance = scanner.nextDouble(); // ���� ����������
        int years = 0;

        while (balance < 1000000) {
            balance = balance + balance * 0.05;
            years = years + 1;
        }

        System.out.println("����� " + years + " ��� � ��� ����� �������!");
    }
}
