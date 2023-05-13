package creational.builder;

import item.Item;

public class BuilderItem extends Item {
    private String description;
    private int capacity;
    private double price;

    private BuilderItem() {

    }

    public static ItemBuilder newBuilder() {
        return new BuilderItem().new ItemBuilder();
    }

    public class ItemBuilder {
        public ItemBuilder setDescription(String description) {
            BuilderItem.this.description = description;
            return this;
        }

        public ItemBuilder setCapacity(int capacity) {
            BuilderItem.this.capacity = capacity;
            return this;
        }

        public ItemBuilder setPrice(double price) {
            BuilderItem.this.price = price;
            return this;
        }

        public ItemBuilder setName(String name) {
            BuilderItem.this.setName(name);
            return this;
        }

        public ItemBuilder setAmount(int amount) {
            BuilderItem.this.setAmount(amount);
            return this;
        }

        public BuilderItem build() {
            return BuilderItem.this;
        }
    }

    @Override
    public String toString() {
        return getName() + " " + getAmount() + " " + description + " " + capacity + " " + price;
    }
}
