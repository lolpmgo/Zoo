public class FlyFish extends Animal implements Flyable, Swimmable {


    public FlyFish(String name)
    {
        super(name);
    }


    public String eat()
    {
        return "Plankton, Organism, small plants";
    }


    public String fly()
    {
        return "I can flyyyyyyy";
    }


    public String swim()
    {
        return "And I can swimmmmmmm";
    }





}