package com.prakticum;

import java.util.Scanner;

public class learn_array_6 {
    public static void main(String[] args) {
        String[] currencies = {"USD","EUR","JPY","RUB"};

        System.out.println("� ����� ������-�������� �������� ��������� ������:");
        System.out.println(currencies[0]);
        System.out.println(currencies[1]);
        System.out.println(currencies[2]);
        System.out.println(currencies[3]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("���� �� ���������� ������� � �����, ������� 1, � ���� � �����, ������� 2");

        int country = scanner.nextInt();  // �������� �� ������� ���� ������������

        // ���� ������� �����, �������� �������� �������� ���� �� ����� DKK
        if (country == 1) {
            currencies[1] = "DKK";
        } else if (country == 2) {
            currencies[2] = "CNY";
        }
        // ���� �����, �������� �������� �������� ���� �� ���� CNY


        System.out.println("� ����� ������-�������� �������� ��������� ������:");
        System.out.println(currencies[0]);
        System.out.println(currencies[1]);
        System.out.println(currencies[2]);
        System.out.println(currencies[3]);
    }
}
