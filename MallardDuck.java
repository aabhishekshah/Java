public class MallardDuck extends Duck
{

    public MallardDuck()
    {
        quackBehaviour = new Quack();
    }

    public void display()
    {
        System.out.println("I'm a real Mallard duck");
    }
}
