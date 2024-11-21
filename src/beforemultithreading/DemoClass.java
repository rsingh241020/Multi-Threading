package beforemultithreading;

public class DemoClass {
    public static void main(String[] args) {
        System.out.println("Part 1 print in Ascending Order");
        for(int i =0;i<=10;i++){
            System.out.println("value of i is " +i);
        }
        System.out.print("part 2 print the Descending Order ");
        for(int i =10;i>=1;i--){
            System.out.println("Value of i is "+i);
        }
    }
}
