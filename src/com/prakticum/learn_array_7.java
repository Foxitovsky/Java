package com.prakticum;

import java.util.Scanner;

public class learn_array_7 {
    public static void main(String[] args) {
        double[] expenses = {100.50, 500.00, 10.00, 0.0, 40.60, 500.10, 200.00};

        Scanner scanner = new Scanner(System.in);

        System.out.println("������� �� ������ �������� ��� ��������� �� 0 (��) �� 6 (��).");
        System.out.println("������� ������ ���, ����� �� ������� �� ������ ���������������:");

        // �������� ����������, ������� ����� ������� ������ ���������� ��������
        int day = scanner.nextInt();

        System.out.println("������� ����� ����� ���� �� ���� ����:");
        // �������� ����������, � ������� ����� ��������� ����� �������� ���� �� ��������� ����
        double debitDouble = scanner.nextDouble();

        // �������� �������� �������� � ������ �������� �� �����
        expenses[day] = debitDouble;
        System.out.println("�� ���� � �������� " + day + " ������ ���� ������ " + debitDouble );
    }
}
