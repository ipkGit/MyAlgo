

public class GreatestCommonDivisor {
    public int euclidGCD(int a, int b) {
        //to find GCD 3918848 and 1653264 this method spend 5 iteration
        if (a == 0) return b;
        if (b == 0) return a;
        if (a >= b) return euclidGCD(a % b, b);
        if (a <= b) return euclidGCD(a, b % a);
        else return 0;
    }
}
