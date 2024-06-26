public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Rares", 17, "no");
        Person person2 = new Person("Paul", 15, "no");
        Person person3 = new Person("Tibi", 44, "yes");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

        System.out.println("-------------------------------------------------------------------------");

        Product mac = new Product("MacBook",2000,10, "Laptop");
        Product iphone = new Product("iPhone 13",1000,5, "Phone");
        Product ipad = new Product("iPad Pro",1500,2, "Tablet");

        System.out.println(mac.isCategory("Phone"));

        System.out.println("-------------------------------------------------------------------------");

        Bottle apa = new Bottle(500, 300, "Open");

        System.out.println(apa.toString());

        System.out.println(apa.statusCapacity());

        System.out.println(apa.remainCapacity());

        System.out.println(apa.emptyCapacity());

        System.out.println(apa.openBottle());

        System.out.println(apa.closeBottle());

        System.out.println(apa.specigicAmount(128));

    }
}