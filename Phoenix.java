public class Phoenix extends Animal implements Flyable, Armorable, Upgradeable {

    public Phoenix(String name)
    {
        super(name);
    }

    public String eat()
    {
        return "All flying things";
    }

    public String fly()
    {
        return "Highest";
    }

    public String armor()
    {
        return "MYSTERIOUS EQUIPMENTS PLZ";
    }
    
    public String upgrade()
    {
        return "LEVEL MAX";
    }
}