package aftermultithreading;

import javax.xml.stream.events.StartDocument;

public class MainThread {

    public static void main(String[] args) {
        SampleThread sampleThread = new SampleThread();
        try {
            System.out.println("Part 1 print in Ascending Order");
            for (int i = 1; i <= 10; i++) {
                System.out.println("value of i is " + i);
                Thread.sleep(500);
            }
        }
        catch (Exception e){
            System.out.println("Exception Occurs"+e.getMessage());
        }
    }
}
