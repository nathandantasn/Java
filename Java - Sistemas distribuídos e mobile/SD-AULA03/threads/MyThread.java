package threads;

public class MyThread extends Thread {

    public MyThread (String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Thread: " + getName() + " iniciou");
        
        try {
            sleep(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thread: " + getName() + " finalizou");
    
    }
    
}
