public class RaceCondition {
    int x;
    boolean available;

    public RaceCondition()
    {
        available = true;
        x = 5;
    }

    void acquire()
    {
        while (!available)
        {

        }
        available = false;
    }

    void release()
    {
        available = true;
    }

    class First extends Thread
    {

        First()
        {
            setName("Thread-A");
        }

        @Override
        public void run() {
            acquire();
            x++;
            System.out.println(getName()+" updated x to: "+x);
            release();
        }
    }

    class Second extends Thread
    {

        Second()
        {
            setName("Thread-B");
        }

        @Override
        public void run() {
            acquire();
            x--;
            System.out.println(getName()+" read x as: "+x);
            release();
        }
    }
}

class Main{
    public static void main(String[] args) {
        RaceCondition rc = new RaceCondition();



        for(int i = 0 ; i < 10; i++)
        {
            RaceCondition.First f = rc.new First();
            RaceCondition.Second s = rc.new Second();
            s.start();
            f.start();
        }

    }
}
