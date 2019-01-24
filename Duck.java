public abstract class Duck

{
    QuackBehaviour quackBehaviour;

    public Duck(){

    }

    public void setQuackBehaviour(QuackBehaviour qb)
    {
        quackBehaviour = qb;
    }


    abstract void display();

    public void performQuack()
    {
        quackBehaviour.quack();
    }


    public void swim()
    {
        System.out.println("All ducks float, even decoys.");
    }

    public void ReverseSwim()
    {
        System.out.println("I ReverseSwim");
    }

    public void sleep()
    {
        System.out.println("I sleep");
    }
    public void eat()
    {
        System.out.println("I eat");
    }

}
