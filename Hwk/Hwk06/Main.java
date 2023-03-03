package Hwk.Hwk06;

import java.util.Scanner;

// ДЗ:
// while (true) -> while (!plate.isEmpty())
//  1. Создать массив котов. Пусть все коты из массива по очереди едят из одной тарелки.
// В конце каждого цикла мы досыпаем в тарелку еду.
// Для досыпания еды сделать метод increaseFood в классе Plate.
//  2. Поменять поле satiety у кота с boolean на int.
// Допустим у кота апптит 10, сытность 3. Значит кот захочет поесть 7 единиц.
//  3. * Доработать поток thread в классе Cat, чтобы он каждую секунду уменьшал сытость кота на 1.

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Кот (имя, аппетит, сытность)
        // Тарелка (содержит какое-то количество еды)
        // Кот ест из тарлеки. Если в тарелке недостаточно еды - кот ее не трогает

        // Cat murzik = new Cat("Murzik", 15);
        // Cat barsik = new Cat("Barsik"); // appetite = 10
        // while (true) {

        // murzik.eat(plate);
        // barsik.eat(plate);

        // System.out.println(plate);
        // System.out.println(murzik);
        // System.out.println(barsik);

        // Thread.sleep(1000);



        int fill;
        Scanner sc = new Scanner(System.in);

        
        Plate plate = new Plate(250);

        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Murzik", 10);
        allCats[1] = new Cat("Barsik", 15);
        allCats[2] = new Cat("Snowball", 17);
        allCats[2] = new Cat("Tom", 20);
        allCats[3] = new Cat("Gargield", 30);

        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].satiety == false && allCats[i].appetite < plate.food) {
                allCats[i].eat(plate);
                Thread.sleep(1000);
                System.out.println("Котик " + allCats[i].name + " покушал!");
            } else {
                System.out.println("Котик " + allCats[i].name + " не поел!");
                
            }
        }

        System.out.println("Сколько корма добавить в миску?");
        fill = sc.nextInt();
        plate.fillPlate(fill);
        System.out.println(plate);

        sc.close();
    }

}