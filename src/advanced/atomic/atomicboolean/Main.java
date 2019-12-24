package advanced.atomic.atomicboolean;

public class Main
{
    public static void main(String[] args)
    {
        WithAtomicObject counter = new WithAtomicObject();

        new Thread(counter).start();
        new Thread(counter).start();
        new Thread(counter).start();
    }
}
