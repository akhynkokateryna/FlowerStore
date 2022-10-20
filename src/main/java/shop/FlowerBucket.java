package shop;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Bundle {

    @Getter@Setter
    private List<FlowerPack> flowPacks = new ArrayList<FlowerPack>();

    public void add(FlowerPack flowPack) {
        flowPacks.add(flowPack);
    }

    public double getPrice() {
        double price = 0.0;
        for (FlowerPack flowp: flowPacks) {
            price += flowp.getPrice();
        }
        return price;
    }

}
