package threads;

public class AppThread {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Juraci");
        MyThread t2 = new MyThread("Jurema");
        MyThread t3 = new MyThread("Josimar");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Final do main.");

    }
    
}
