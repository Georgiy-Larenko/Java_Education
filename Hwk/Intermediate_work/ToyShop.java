package Hwk.Intermediate_work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ToyShop {
    private List<Toy> toys;
    private List<Toy> prizeToys;

    public ToyShop() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    // метод для добавления новой игрушки в магазин
    public void addToy(Toy toy) {
        toys.add(toy);
    }

    // метод для изменения веса (частоты выпадения) игрушки
    public void changeToyWeight(int toyId, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    // метод для розыгрыша призовой игрушки
    public void play() {
        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }

        double randomNumber = Math.random() * totalWeight;
        double currentWeightSum = 0;

        for (Toy toy : toys) {
            currentWeightSum += toy.getWeight();
            if (randomNumber <= currentWeightSum) {
                prizeToys.add(toy);
                break;
            }
        }
    }

    // метод для получения призовой игрушки
    public Toy getPrizeToy() {
        if (prizeToys.isEmpty()) {
            return null;
        }

        Toy prizeToy = prizeToys.remove(0);
        writeToFile(prizeToy);
        return prizeToy;
    }

    // метод для записи призовой игрушки в файл
    private void writeToFile(Toy toy) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Hwk/Intermediate_work/prizeToys.txt", true))) {
            writer.write(toy.getId() + "," + toy.getName() + "," + toy.getQuantity() + "," + toy.getWeight() + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to file (Ошибка чтения файла).");
        }
    }
}
