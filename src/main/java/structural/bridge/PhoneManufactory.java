package structural.bridge;

public class PhoneManufactory implements Factory {
    @Override
    public void work() {
        System.out.println("Produced");
    }
}
