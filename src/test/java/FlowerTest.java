import flower_store.Flower;
import flower_store.FlowerColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowerTest {
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    private void testPrice() {
        int price = 20;
        flower.setPrice(price);
        assertEquals(price, flower.getPrice());
    }

    @Test
    private void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        assertEquals("#FF0000", flower.getColor());
    }

    public static class FlowerBucketTest {
        private FlowerBucket flowerBucket;

        @BeforeEach
        public void init() {
            Flower flower = new Rose();
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
}