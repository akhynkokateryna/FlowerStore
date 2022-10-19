package shop;

import flower_store.Flower;
import flower_store.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        Flower flower = new Flower();
        flower.setFlowerType(FlowerType.ROSE);
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
    }

    @Test
    private void testPrice() {
        assertEquals(100, flowerBucket.getPrice());
    }

}
