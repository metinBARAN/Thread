public class Main {

    public static void main(String[] args) throws InterruptedException {

        Process pro=new Process();

        Thread t1=new Thread(pro);
        Thread t2=new Thread(pro);
        Thread t3=new Thread(pro);
        Thread t4=new Thread(pro);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();

        System.out.println("odd numbers --> "+Process.odds.size()+ " ==> " +Process.odds);
        System.out.println("even numbers --> "+Process.evens.size()+ " ==> " +Process.evens);
    }
}
