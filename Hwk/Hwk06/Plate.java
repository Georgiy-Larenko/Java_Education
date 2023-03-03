package Hwk.Hwk06;

public class Plate {

    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public int fillPlate(int x){
        return food += x;
    }

    public boolean decreaseFood(int foodToDecrease) {
        if (food >= foodToDecrease) {
            food = food - (foodToDecrease);
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Plate[" + food + "]";
    }

}
