public class CompileTimeExcep {
    public static void main(String[] args) {
        Thread  T = new Thread(()->{
        try{
            System.out.println("thread sleep");
            Thread.sleep(5000);
            System.out.println("thread wake");
        }catch(InterruptedException e)
        {
            System.out.println("sleep Interrupted");
        }
        });
        T.start();
        T.interrupt();
    }
}
