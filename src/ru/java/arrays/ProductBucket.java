package ru.java.arrays;

import java.util.Scanner;

public class ProductBucket {

    static final String[] PRODUCTS = new String[]{"Хлеб", "Яблоки", "Молоко"};
    static final int[] PRICES = new int[]{100, 200, 300};
    static int[] evaluateCost = new int[]{0, 0, 0};

    public static void createProductBucket() {

        int productNumber = 0;
        int productCount = 0;
        int overalPrice = 0;

//        System.out.println("Перечень продуктов: " + Arrays.toString(PRODUCTS));
//        System.out.println("Стоимости продуктов: " + Arrays.toString(PRICES));

        int j = 0;
        for (String product : PRODUCTS) {
            System.out.println(j + ". " + product + "\t" + PRICES[j]);
            j++;
        }

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Выберите товар и количество или введите end");
            String input = scanner.next();

            if (input.equals("end")) {
                break;
            }

            try {
                productNumber = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число");
            }

            input = scanner.next();

            try {
                productCount = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число");
            }

            evaluateCost[productNumber] += productCount;
        }
        System.out.println("Ваша корзина:\n" +
                "Наименование товара\t\t" + "Количество\t" + "Цена/за.ед\t" + "Общая стоимость");


        for (int i = 0; i < PRODUCTS.length; i++) {
//            System.out.println(PRODUCTS[i] + "\t\t\t\t\t\t" + evaluateCost[i] + "\t\t\t" + PRICES[i] + "\t\t\t" + (evaluateCost[i] * PRICES[i]));
            System.out.printf("%-20s%10d%12d%13d%n",PRODUCTS[i],evaluateCost[i],PRICES[i],(evaluateCost[i] * PRICES[i]));
            overalPrice += evaluateCost[i] * PRICES[i];
        }

        System.out.printf("Итоговая сумма: %40d",overalPrice);

    }
}
