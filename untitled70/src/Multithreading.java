public class Multithreading extends Thread {
    private int threadNumber;

    public Multithreading(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        print(threadNumber);
    }

    private synchronized static void print(int threadNumber) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "from thread" + threadNumber);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //   @Override
        //   public void run(){
        //      for(int i=1;i<=5;i++){
        //         System.out.println(i+"from thread"+threadNumber);
        //         try{
        //             sleep(1000);
        //         }catch(InterruptedException e){
        //            e.printStackTrace();
        //       }
        //    }
        //  }
    }
}