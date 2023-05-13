package creational.prototype;

import item.Item;

public class ItemProto extends Item implements IPrototype {
    @Override
    public IPrototype getCopy() {
        ItemProto copy = new ItemProto();
        copy.setName(getName());
        copy.setAmount(getAmount());
        return copy;
    }

}
