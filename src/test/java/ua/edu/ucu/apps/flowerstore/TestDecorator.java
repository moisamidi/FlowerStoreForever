package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.store.Flower;
import ua.edu.ucu.apps.flowerstore.store.RibbonDecorator;
import ua.edu.ucu.apps.flowerstore.store.Rose;
import ua.edu.ucu.apps.flowerstore.store.WrapperDecorator;

import static org.junit.jupiter.api.Assertions.*;

public class TestDecorator {
    @Test
    public void testRibbonDecorator() {
        Flower rose = new Rose();
        Flower decoratedRose = new RibbonDecorator(rose);

        assertEquals(2.0, decoratedRose.getPrice());
    }

    @Test
    public void testWrapperDecorator() {
        Flower rose = new Rose();
        Flower decoratedRose = new WrapperDecorator(rose);

        assertEquals(5.0, decoratedRose.getPrice());
    }
}
