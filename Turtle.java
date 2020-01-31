public class Turtle extends Animal implements Runnable, Swimmable {


    public Turtle(String name)
    {
        super(name);
    }


    public String eat()
    {
        return "Turtle eats sea weeds";
    }


    public String run()
    {
        return "Turtle is the fastest animal";
    }


    public String swim()
    {
        return "Turtle swimmmmmmmmmmms";
    }





}