package com.prakticum;

public class learn_array_2 {
    public static void main(String[] args) {
        double[] expenses = {100.50, 500.00, 10.00, 0.0, 640.60, 370.20, 200.00};

        // �������� 115 ������ � �������� �� �����
        expenses[2] = expenses[2] + 115.0;
        System.out.println("����� �������� �������� �� �����: " + expenses[2] + " ������.");

        // ���������� ��� ����� ������� �����
        double sum = expenses[1] + expenses[4] + expenses[5];
        System.out.println("����� ������� ������� ���� �� �������, ������� � �������.");
        System.out.println("����� �� ��������� � ��� ���: " + sum + " ������.");
    }
}
