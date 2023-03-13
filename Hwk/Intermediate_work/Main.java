package Hwk.Intermediate_work;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        // добавляем игрушки в магазин
        toyShop.addToy(new Toy(1, "Car", 10, 50));
        toyShop.addToy(new Toy(2, "Doll", 15, 30));
        toyShop.addToy(new Toy(3, "Teddy", 5, 20));
        toyShop.addToy(new Toy(4, "Ball", 20, 10));

        Scanner scanner = new Scanner(System.in);

        // меняем вес игрушки
        System.out.print("Enter toy id to change weight (Введите Id игрушки, у которой изменяем вес): ");
        int toyId = scanner.nextInt();
        System.out.print("Enter new weight (Введите новое значение веса): ");
        double weight = scanner.nextDouble();
        toyShop.changeToyWeight(toyId, weight);

        // розыгрыш призовой игрушки
        toyShop.play();
        Toy prizeToy = toyShop.getPrizeToy();
        if (prizeToy == null) {
            System.out.println("No prize toys available (Нет призов.).");
        } else {
            System.out.println("Prize toy (Призовая игрушка): " + prizeToy.getName());
        }
        scanner.close();
    }
}
