package com.prakticum;

import java.util.Random;

public class learn_while_4 {
    public static void main(String[] args) {
        Random random = new Random(); // Генерирует случайное число
        int secretCode;
        int pilotInput;

       while(true){
           // Добавьте цикл - ракета летает бесконечно
           secretCode = random.nextInt(100); // Здесь задаётся код - случайное число от 0 до 100
           System.out.println("Ракета SpaceY на орбите!");
           pilotInput = random.nextInt(100); // Пилот пытается угадать код

           if (secretCode == pilotInput) { // Если пилот угадал код, то цикл должен завершиться
               System.out.println("Пилот угадал число! Летим домой!");
            break;
           }
       }
    }
}
