package ua.edu.ucu.apps.flowerstore.store;

// Concrete decorator for adding wrapper to a flower
public class WrapperDecorator extends AbstractDecorator {
    public WrapperDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5.0; // Adding the cost of the wrapper
    }
}
