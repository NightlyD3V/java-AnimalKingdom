package animals;

public abstract class AbstractAnimal
{
    private int maxId = 0;
    private int id;
    private String name;
    private int year;

    public AbstractAnimal(String name, int year)
    {
        id = maxId++;
        this.name = name;
        this.year = year;
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return year;
    }

    @Override 
    public String toString()
    {
        return "Name: " + name + "\n" + 
               "Year: " + year + "\n";
    }
}