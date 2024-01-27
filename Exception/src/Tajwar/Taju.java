package Tajwar;

public class Taju{
    public static void main(String[] args){
        System.out.println("Before exception");
        int b=1;
        int c=0;
        try{
            int a=b/c;
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Exception is caught");
        }
        System.out.println("After Exception");

    }
}
