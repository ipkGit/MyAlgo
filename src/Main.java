import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        //testing algorithms of Fibonacci numbers
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        fibonacciNumber.streamFibonacci().limit(30).forEachOrdered(System.out::println); //from 0 to 832040
        System.out.println("Fibonacci and iteration  = " + fibonacciNumber.iteration(30));  //832040
        System.out.println("Fibonacci and memoization = " + fibonacciNumber.memoization(30)); //832040 and !!!don't try n>40, it will be too long

        //testing to Euclid's algorithm to find GCD
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        System.out.println("GCD result = "
                + gcd.euclidGCD(new BigInteger("1313131313131313554575"),
                new BigInteger("75824582458545485485455455455"))); //5

    }
}

