package com.prakticum;
import java.util.Random;
import java.util.Scanner;

public class learn_while_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomInt = new Random().nextInt(1000); // ���������� ����� ����� �� 0 �� 1000

        int userInput = -1; // ��� �����, ����� ���� ����������, ���� Random ������ 0
        System.out.println("� ������� ����� �� 0 �� 1000.");
        System.out.println("��� ���:");

        // �������� ������� ����� ��� ������� ����
        while (userInput != randomInt) {
        userInput = scanner.nextInt(); // � ���� ���������� ������ ����������� ���� ������������
            if (userInput > randomInt) { // ������� ����������� � �����
                System.out.println("������");
            } else if (userInput < randomInt) {
                System.out.println("������");
            } else {
                System.out.println("�� �����������! ������ ��� � �������.");
            }
        }
    }
}
