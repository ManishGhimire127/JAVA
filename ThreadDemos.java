// Programs for creating multiple threads
// b) RunnableInterface
class ThreadDemo {
    public static void main(String args[]) {
        new ThreadDemos("One");
        new ThreadDemos("Two");
        new ThreadDemos("Three");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
class ThreadDemos implements Runnable {
    String name;
    Thread t;
    ThreadDemos(String thread) {
        name = thread;
        t = new Thread(this.name);
        System.out.println("New thread: " + t);
        t.start();
    }
    public void run() {
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println(name + ": " + i);
                    Thread.sleep(1000);
                } }
                catch (InterruptedException e) {
                    System.out.println(name + "Interrupted");
                }
                System.out.println(name + " exiting.");
            }
        }  
            
        
    
