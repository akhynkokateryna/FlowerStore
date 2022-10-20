import flower.Flower;
import flower.FlowerType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import shop.FlowerBucket;
import shop.FlowerPack;
import shop.Store;

import java.util.Random;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private final FlowerBucket flowerBucket = new FlowerBucket();
    private final FlowerBucket flowerBucket1 = new FlowerBucket();
    private final Store store = new Store();

    @Test
    public void testAll() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Flower();
        flower.setFlowerType(FlowerType.ROSE);
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);

        int price1 = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity1 = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower1 = new Flower();
        flower1.setFlowerType(FlowerType.CHAMOMILE);
        flower1.setPrice(price1);
        FlowerPack flowerPack1 = new FlowerPack(flower1, quantity1);
        flowerBucket1.add(flowerPack1);

        store.add(flowerBucket);
        store.add(flowerBucket1);

        Assertions.assertEquals(store.search(flowerBucket), true);
        Assertions.assertEquals(store.search(flowerPack1), true);
    }
}
