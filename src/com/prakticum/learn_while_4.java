package com.prakticum;

import java.util.Random;

public class learn_while_4 {
    public static void main(String[] args) {
        Random random = new Random(); // ���������� ��������� �����
        int secretCode;
        int pilotInput;

       while(true){
           // �������� ���� - ������ ������ ����������
           secretCode = random.nextInt(100); // ����� ������� ��� - ��������� ����� �� 0 �� 100
           System.out.println("������ SpaceY �� ������!");
           pilotInput = random.nextInt(100); // ����� �������� ������� ���

           if (secretCode == pilotInput) { // ���� ����� ������ ���, �� ���� ������ �����������
               System.out.println("����� ������ �����! ����� �����!");
            break;
           }
       }
    }
}
