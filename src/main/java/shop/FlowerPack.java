package shop;

import flower_store.Flower;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack (Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public double getPrice() {
        return amount * flower.getPrice();
    }
}
