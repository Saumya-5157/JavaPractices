import java.math.*;

public class Functions {
    public int Fact(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        return num * Fact(num-1);
    }
    public int Fib(int num){
        if (num <= 1){
            return num;
        }
        return Fib(num-1) + Fib(num - 2);
    }
    public boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i=2;i*i<=num;i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
}
