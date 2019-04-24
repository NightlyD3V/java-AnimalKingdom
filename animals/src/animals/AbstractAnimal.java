package animals;

public abstract class AbstractAnimal
{
    public AbstractAnimal(int eat)
    {
        this.eat = eat;
    }
    public abstract String getName();
    public abstract String move();
    public abstract String breath();
    public abstract int getNumber();
    public abstract int getYearDiscovered();

    public void eat(int i)
    {
        eat = eat + i;
    }
}