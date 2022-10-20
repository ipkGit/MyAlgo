import java.util.HashMap;
import java.util.Map;
import java.util.stream.LongStream;

public class FibonacciNumber {

    //Fibonacci is row of number where number == the sum of the two previous number,
    //except first two numbers on row
    //(n) 0 1 2 3 4 5 6 7  8  9  10 ...
    //(v) 0 1 1 2 3 5 8 13 21 34 55 ...


    public int memoization(int n) {
        //this method is too slow. To calculate memoization(40) method to spend over 20 sec.


        //first number in row fibonacci
        Map<Integer, Integer> memory = new HashMap<>(Map.of(0, 0, 1, 1));


        //writing new values of numbers fibonacci in our map with recursion
        if (!memory.containsKey(n)) {
            memory.put(n, memoization(n - 1) + memoization(n - 2));
        }
        return memory.get(n);

    }

    public long iteration(int n) {
        //this method recommend to use.
        long last = 0, next = 1; //first number in row fibonacci

        //all of this just easy and clearly
        for (int i = 0; i < n; i++) {
            long oldLast = last;
            last = next;
            next = next + oldLast;
        }
        return last;
    }

    private long last = 0, next = 1;//first number in row fibonacci
    public LongStream streamFibonacci () {
        //for show all numbers of Fibonacci in row with usage stream

        return  LongStream.generate(() -> {
            long oldLast = last;
            last = next;
            next = oldLast+next;
            return last;
        });
    }


}
