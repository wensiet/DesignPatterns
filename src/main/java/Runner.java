import item.Item;
import creational.builder.BuilderItem;
import creational.factory.ItemFactory;
import creational.factory.ItemType;
import creational.prototype.ItemProto;
import creational.singleton.SingletonItem;
import structural.adapter.Camera;
import structural.adapter.Dictaphone;
import structural.adapter.MultiRecorderAdapter;
import structural.adapter.VoiceRecorder;
import structural.bridge.Device;
import structural.bridge.Phone;
import structural.bridge.PhoneManufactory;
import structural.bridge.PhoneTesting;
import structural.composite.Professor;
import structural.composite.Student;
import structural.composite.UniversityMembersManager;
import structural.decorator.EnamelCareDecorator;
import structural.decorator.Paste;
import structural.decorator.Toothpaste;
import structural.decorator.WhiteningDecorator;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        testDecorator();
    }

    public static void testSingleton() {
        SingletonItem item1 = SingletonItem.getInstance();
        item1.setName("Yigor");
        item1.setAmount(2);
        System.out.println("First item: " + item1);
        SingletonItem item2 = SingletonItem.getInstance();
        System.out.println("Second item: " + item2);
        item2.setName("Ded");
        System.out.println("First item: " + item1);
    }

    public static void testBuilder() {
        BuilderItem item1 =
                BuilderItem.newBuilder().setName("Yigor").setAmount(2).setCapacity(0).setDescription("person")
                        .setPrice(-1.5).build();
        System.out.println(item1);
    }

    public static void testFactory() {
        ItemFactory factory = new ItemFactory();
        Item iron = factory.getItem(ItemType.SOLID);
        Item helium = factory.getItem(ItemType.GAS);
        Item water = factory.getItem(ItemType.LIQUID);
        iron.setName("iron");
        helium.setName("helium");
        water.setName("water");
        System.out.println(iron + " " + helium + " " + water);
    }

    public static void testPrototype() {
        ItemProto p = new ItemProto();
        p.setName("Yigor");
        p.setAmount(2);
        System.out.println("Initial item: " + p);
        ItemProto clone = (ItemProto) p.getCopy();
        System.out.println("Cloned item: " + clone);
        clone.setName("Ded");
        System.out.println("Modified clone item: " + clone);
        System.out.println("Initial item: " + p);
    }

    public static void testAdapter() {
        Dictaphone dictaphone = new Dictaphone();
        Camera camera = new Camera();
        VoiceRecorder adapter = new MultiRecorderAdapter(camera);

        dictaphone.record();
        adapter.record();
    }

    public static void testBridge() {
        Device iPhone = new Phone(new PhoneManufactory(), new PhoneTesting());
        iPhone.setName("iPhone 10");
        iPhone.manufacture();
    }

    public static void testComposite() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Yigor", "computer science"));
        students.add(new Student("Ded", "bio-engineering"));
        ArrayList<Professor> professors = new ArrayList<>();
        professors.add(new Professor("Kiselev", "calculus"));
        professors.add(new Professor("Tormasov", "computer architecture"));
        UniversityMembersManager innopolis = new UniversityMembersManager("Innopolis", students, professors);
        innopolis.getInfo();
    }

    public static void testDecorator() {
        Toothpaste colgate = new Paste("Colgate", 2.0);
        Toothpaste colgateCare = new EnamelCareDecorator(colgate);
        Toothpaste colgateCareAndWhite = new WhiteningDecorator(colgateCare);
        colgate.getInfo();
        colgateCare.getInfo();
        colgateCareAndWhite.getInfo();
    }

}
