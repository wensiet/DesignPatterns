package structural.bridge;

public class Phone extends Device{
    public Phone(Factory first, Factory second) {
        super(first, second);
    }

    @Override
    public void manufacture() {
        System.out.println("Phone: " + getName());
        first.work();
        second.work();
    }
}
