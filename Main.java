import java.util.Scanner;
//import src/factorial;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public int Fact(int num){
//        if(num == 0 || num == 1){
//            return 1;
//        }
//        return num * Fact(num-1);
//    }

    public static void main(String[] args) {
        Functions func = new Functions();
        while(true){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
//            System.out.println(func.Fact(num));
//            System.out.println(func.Fib(num));
            System.out.println((func.isPrime(num)));/*Checking if Prime*/
        }


    }
}