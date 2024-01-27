public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int x=5;
            int y=0;
            int z=x/y;
        } catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: "+e);

        }
        finally{
            System.out.println("Last line must be executed");
        }
    }
}
