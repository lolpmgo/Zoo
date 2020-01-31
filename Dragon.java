public class Dragon extends Animal implements Flyable, Swimmable, Armorable, Upgradeable {


    public Dragon(String name)
    {
        super(name);
    }


    public String eat()
    {
        return "Dragon Dominates";
    }


    public String fly()
    {
        return "Hush!";
    }


    public String swim()
    {
        return "Dive in the deep";
    }
    
    public String armor()
    {
        return "Powerful";
    }
    
    public String upgrade()
    {
        return "UPGRADE!";
    }
}



