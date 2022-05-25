public abstract class Herbivore extends Animal {

    public void eat(Food food) {
        System.out.print("I'm " + name + ". ");
        if (food instanceof Plant) {
            System.out.println("Yummy!");
        } else {
            System.out.println("I don't eat that!");
        }
    }

}
