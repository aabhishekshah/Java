public class DecoyDuck extends Duck
{

    public DecoyDuck()
    {
        quackBehaviour =  new MuteQuack();
    }

    public void display()
    {
        System.out.println("I'm a duck Decoy");
    }

}