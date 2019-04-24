package animals;

public class Mamal extends AbstractAnimal
{
    public Mamal(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "no eggs";
    }
}