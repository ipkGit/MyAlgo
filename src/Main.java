


public class Main {
    public static void main(String[] args) {

        //test algorithms of Fibonacci numbers
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        fibonacciNumber.streamFibonacci().limit(30).forEachOrdered(System.out::println);
        System.out.println(fibonacciNumber.iteration(30));  //3736710778780434371
        System.out.println(fibonacciNumber.memoization(30)); //832040 and !!!don't try n>40, it will be too long


    }
}

