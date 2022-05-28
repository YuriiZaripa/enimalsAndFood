public class Main {

    public static void main(String[] args) {
        Lion lion = new Lion();

        Goat goat = new Goat();
        Cow cow = new Cow();

        Grass grass = new Grass();

        feed(goat, grass);
        feed(lion, cow);

//        feed(goat, cow);
//        feed(cow, lion);
//        feed(lion, grass);
    }

    public static void feed(Animal animal, Food food) {
        animal.eat(food);
    }
}
