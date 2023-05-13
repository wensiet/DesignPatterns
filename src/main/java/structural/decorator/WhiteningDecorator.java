package structural.decorator;

public class WhiteningDecorator extends ToothpasteDecorator {
    public WhiteningDecorator(Toothpaste paste) {
        this.paste = paste;
    }

    @Override
    public void getInfo() {
        paste.getInfo();
        System.out.println("This paste has whitening effect");
    }
}
