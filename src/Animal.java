public abstract class Animal<T extends Food> implements Food{

    String name;

    public abstract void eat(T food);

}
