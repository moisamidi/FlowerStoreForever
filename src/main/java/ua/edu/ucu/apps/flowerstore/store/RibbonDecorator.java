package ua.edu.ucu.apps.flowerstore.store;

// Concrete decorator for adding ribbon to a flower
public class RibbonDecorator extends AbstractDecorator {
    public RibbonDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.0; // Adding the cost of the ribbon
    }
}
