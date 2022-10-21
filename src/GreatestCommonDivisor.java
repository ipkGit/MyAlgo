import java.math.BigInteger;

public class GreatestCommonDivisor {
    public BigInteger euclidGCD(BigInteger a, BigInteger b) {
        //to find GCD 3918848 and 1653264 this method spend 5 iteration
        while (true) {
            if (a.equals(BigInteger.ZERO)) return b;
            if (b.equals(BigInteger.ZERO)) return a;
            if (a.compareTo(b)>0) a = a.mod(b);
            else b = b.mod(a);
        }

        //or you can use already existing method in BigInteger class .gcd()
    }
}
