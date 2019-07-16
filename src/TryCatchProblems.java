import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchProblems {



    public void pr1() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("enter an integer");
            int nr = scan.nextInt();
            System.out.println("the number is " + nr);
        } catch (InputMismatchException e) {
            System.out.println("the input needs to be a number");
        }

    }

    public void pr2() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("enter a char");
            String c = scan.nextLine();
            System.out.println("the string is " + c);
        } catch (InputMismatchException e) {
            System.out.println("the input needs to be a string");
        }

    }

    public int[] pr3(int n) {
        int[] arr = new int[n];
        Scanner scan = new Scanner(System.in);
        System.out.print("please input an array of " + n + " numbers\n");
        for(int i = 0; i<n; i++){
            try{
                arr[i] = scan.nextInt();
                //System.out.println("");
            }
            catch (InputMismatchException e){
                //arr[i] = scan.nextInt();
                //System.out.println("");
                continue;
            }
        }

        return arr;

    }



    public void pr5(int[] arr, int index) {
        try {
            System.out.println(arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside catch, number too large");
        }
    }

    public void waitMethod(int seconds){
        Thread tr = new Thread();
        tr.start();
        System.out.println("I will wait for 5 seconds");
        try {
            tr.sleep(seconds*1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("done");
        tr.interrupt();
    }
}
