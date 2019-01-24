public class RubberDuck extends Duck
{

    public RubberDuck()
    {
        quackBehaviour = new Squeak();
    }

    public void display()
    {
        System.out.println("I'm a rubber duckie");
    }

}