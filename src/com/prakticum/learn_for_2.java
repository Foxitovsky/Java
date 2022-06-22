package com.prakticum;

public class learn_for_2 {
    public static void main(String[] args) {
        int circle = 5;
        int prised = 5;
        int pullup = 3;
        int press = 7;

        for (int i = 1; i <= circle; i++) {
            // В тренировке должно выполниться 5 кругов
            System.out.println("Круг " + i);
            if (i % 2 == 0) {
                for (int j = 1; j <= prised; j++){
                    // Выполнение каждого круга зависит от условия - проверьте, является ли круг чётным
                    // Если да, то присесть 5 раз
                    System.out.println("  Приседаем " + j);
                }
            }
            else {
                for (int j = 1; j <= pullup; j++) {
                    // Иначе нужно отжаться 3 раза
                    System.out.println("  Отжимаемся " + j);
                }
            }
            for (int p = 1; p <= press; p++){
                // Независимо от номера круга качаем пресс 7 раз
                System.out.println("  Качаем пресс " + p);
            }
            // Небольшое подбадривание в конце каждого круга
            System.out.println("Хороший темп, так держать!");
        }
        System.out.println("Отлично позанимались сегодня! Вы - молодец!");
    }
}
