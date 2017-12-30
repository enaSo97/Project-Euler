package LatticePath;

import java.math.BigInteger;

public class LatticePath {
    public static void main(String[] args) {
        int right = 20; // it is 20 * 20 grid
        int left = 20;
        BigInteger upper = new BigInteger("1");
        BigInteger rightFact = new BigInteger("1");
        BigInteger leftFact = new BigInteger("1");
        BigInteger path = new BigInteger("1");

        upper = factorial(right + left);
        rightFact = factorial(right);
        leftFact = factorial(left);

        rightFact = rightFact.multiply(leftFact);// combining the denominator of N choose K which is K*(N - K)
        path = upper.divide(rightFact);
        System.out.println("Number of Path " + path);
    }

    public static BigInteger factorial (int n){
        int c;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");


        for (c = 1; c <= n; c++) {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        return fact;
    }

}
