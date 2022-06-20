package com.prakticum;

public class leart_for {
    public static void main(String[] args) {

        int flatsNumber = 5; // Количество квартир на этаже
        int floorsNumber = 10; // Количество этажей

        for (int i = 1; i <= floorsNumber; i = i + 1) {
            for (int j = 1; j <= flatsNumber; j = j + 1) {
                int currentFlat = (i - 1) * flatsNumber + j; // Заготовка формулы для учёта квартир
                System.out.println("Этаж " + i + " квартира " + currentFlat + " — доставлено.");
            }
        }
    }
}
