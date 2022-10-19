package shop;

import flower_store.Flower;
import flower_store.FlowerType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlowerBucket {

    private List<FlowerPack> flowPacks = new ArrayList<FlowerPack>();

    public void add(FlowerPack flowPack) {
        flowPacks.add(flowPack);
    }

    public int getPrice() {
        int price = 0;
        for (FlowerPack flowp: flowPacks) {
            price += flowp.getPrice();
        }
        return price;
    }

}
