package structural.bridge;

import item.Item;

public abstract class Device extends Item {
    protected Factory first;
    protected Factory second;

    protected Device(Factory first, Factory second) {
        this.first = first;
        this.second = second;
    }

    abstract public void manufacture();
}
