package aftermultithreading;

public class SampleThread extends Thread{

    SampleThread(){
        start();//
    }
    public void run(){
        try{
            System.out.println("part 2 print the Descending Order ");
            for(int j =10;j>=1;j--){
                System.out.println("Value of j is "+j);
                Thread.sleep(500);
            }
        }

        catch (Exception e){
            System.out.println("Exception Occured"+e.getMessage());
        }
    }

}
