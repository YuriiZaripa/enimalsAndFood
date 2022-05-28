public abstract class Herbivore extends Animal<Plant> {

    public void eat(Plant food) {
        System.out.println("I'm " + name + ".\nYummy!");
    }
}
