package creational.singleton;

import item.Item;

public class SingletonItem extends Item {
    private static SingletonItem instance = null;

    private SingletonItem() {

    }

    public static SingletonItem getInstance() {
        if (instance == null) {
            instance = new SingletonItem();
        }
        return instance;
    }

    @Override
    public String toString() {
        return getName() + " " + getAmount();
    }
}
