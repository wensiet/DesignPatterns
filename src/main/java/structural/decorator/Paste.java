package structural.decorator;

import item.Item;

public class Paste extends Item implements Toothpaste {
    private final double price;

    public Paste(String name, double price) {
        setName(name);
        this.price = price;
    }

    @Override
    public void getInfo() {
        System.out.println(getName() + " with price " + price + "$");
    }
}
