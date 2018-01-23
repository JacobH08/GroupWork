import java.util.Scanner;
public class Program7 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be read in? ");
        int Array[] = new int[input.nextInt()];
        read(Array, input);
        double Average = average(Array);
        System.out.println("The average is " + Average);
        print(Array);
    }
    public static void read(int[] Array, Scanner input){
        System.out.print("Enter the numbers in the list: ");
        for(int i = 0; i < Array.length; i++){
            Array[i] = input.nextInt();
        }
    }
    public static double average(int[] Array){
        double total = 0;
        for(int i = 0; i < Array.length; i++){
            total += Array[i];
        }
        double Average = total / Array.length;
        return Average;
    }
    public static void print(int[] Array){
        System.out.print("The Array is: " + java.util.Arrays.toString(Array));
    }
}