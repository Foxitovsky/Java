package com.prakticum;

public class learn_for_2 {
    public static void main(String[] args) {
        int circle = 5;
        int prised = 5;
        int pullup = 3;
        int press = 7;

        for (int i = 1; i <= circle; i++) {
            // � ���������� ������ ����������� 5 ������
            System.out.println("���� " + i);
            if (i % 2 == 0) {
                for (int j = 1; j <= prised; j++){
                    // ���������� ������� ����� ������� �� ������� - ���������, �������� �� ���� ������
                    // ���� ��, �� �������� 5 ���
                    System.out.println("  ��������� " + j);
                }
            }
            else {
                for (int j = 1; j <= pullup; j++) {
                    // ����� ����� �������� 3 ����
                    System.out.println("  ���������� " + j);
                }
            }
            for (int p = 1; p <= press; p++){
                // ���������� �� ������ ����� ������ ����� 7 ���
                System.out.println("  ������ ����� " + p);
            }
            // ��������� ������������� � ����� ������� �����
            System.out.println("������� ����, ��� �������!");
        }
        System.out.println("������� ������������ �������! �� - �������!");
    }
}
