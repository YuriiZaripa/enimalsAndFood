public abstract class MeatEating extends Animal<Animal > {

    public void eat(Animal food) {
        if(food != this)
            System.out.print("I'm " + name + ".\nYummy!");
    }

}
