package com.prakticum;

import java.util.Scanner;

public class learn_array_8 {
    public static void main(String[] args) {
        String[] dishes = {"�������", "������", "�����", "�����-�����", "������"}; // ������
        System.out.println("�� ���������������� ���� ����.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("������� ������ �����, ������� ������ �����������:");
        System.out.println("0-�������");
        System.out.println("1-������");
        System.out.println("2-�����");
        System.out.println("3-�����-�����");
        System.out.println("4-������");

        // �������� �� ������� ������ �����, ������� ����� �����������
        int firstIndex = scanner.nextInt();

        System.out.println("������� �������, �� ������� ������ ��� �����������, �� 0 �� 4:");
        // �������� ���������� secondIndex ��� ������ ��������� (�������) �����, �������� ��� �� �������
        int secondIndex = scanner.nextInt();

        // ��������� �������� ����� ��� �������� firstIndex � ���������� swap
        String swap = dishes[firstIndex];

        // ��������� ����� � �������� firstIndex �������� ����� ��� �������� secondIndex
       dishes[firstIndex] = dishes[secondIndex];

        // ��������� ����� � �������� secondIndex �������� ���������� swap
        dishes[secondIndex] = swap;

        System.out.println("��� ������� ����:");
        System.out.println(dishes[0]);
        System.out.println(dishes[1]);
        System.out.println(dishes[2]);
        System.out.println(dishes[3]);
        System.out.println(dishes[4]);

    }
}
