public class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            Multithreading m = new Multithreading(i);
            m.start();
         //   try{
         //       m.join();
         //   }catch(InterruptedException e){
        //        e.printStackTrace();
        //    }
        }
    }

}
