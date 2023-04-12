public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cat cat= new Cat("Garfield",3);
        Kitty kitty= new Kitty("Garfield junior",3,"korolevski");
        System.out.println(cat.getName());
        System.out.println(cat.getWeight());

        System.out.println(kitty);
        System.out.println(kitty.getName());
        System.out.println(kitty.getWeight());
        System.out.println(kitty.getBread());
    }
}