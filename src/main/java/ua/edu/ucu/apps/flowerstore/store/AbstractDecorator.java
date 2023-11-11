package ua.edu.ucu.apps.flowerstore.store;

// AbstractDecorator extending Flower
public abstract class AbstractDecorator extends Flower {
    protected Flower flower;

    public AbstractDecorator(Flower flower) {
        this.flower = flower;
    }

    @Override
    public double getPrice() {
        return flower.getPrice();
    }
}

