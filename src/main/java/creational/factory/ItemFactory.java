package creational.factory;

import item.Item;

public class ItemFactory {
    public Item getItem(ItemType type) {
        Item item = null;
        switch (type) {
            case SOLID -> item = new SolidItem();
            case LIQUID -> item = new LiquidItem();
            case GAS -> item = new GasItem();
        }
        return item;
    }
}
