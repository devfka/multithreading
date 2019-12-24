package advanced.atomic.atomicinteger;

public class Main
{
    public static void main(String[] args)
    {
        WithAtomicObject counter = new WithAtomicObject();
        //CounterWithoutAtomic counter = new CounterWithoutAtomic();

        new Thread(counter).start();
        new Thread(counter).start();
        new Thread(counter).start();
    }
}
