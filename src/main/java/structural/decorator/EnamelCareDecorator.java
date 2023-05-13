package structural.decorator;

public class EnamelCareDecorator extends ToothpasteDecorator {
    public EnamelCareDecorator(Toothpaste toothpaste) {
        this.paste = toothpaste;
    }

    @Override
    public void getInfo() {
        paste.getInfo();
        System.out.println("This paste cares about enamel");
    }
}
