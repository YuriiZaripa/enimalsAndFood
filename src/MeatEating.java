public abstract class MeatEating extends Animal {

    public void eat(Food food) {
        System.out.print("I'm " + name + ". ");
        if (food != this && food instanceof Animal) {
            System.out.println("Yummy!");
        } else {
            System.out.println("I don't eat that!");
        }
    }

}
