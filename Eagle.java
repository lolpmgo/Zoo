public class Eagle extends Animal implements Runnable, Flyable {


    public Eagle(String name)
    {
        super(name);
    }


    public String eat()
    {
        return "the hunter of the natural world";
    }


    public String run()
    {
        return "no one's going to run away";
    }


    public String fly()
    {
        return "can you ever catch me?";
    }





}