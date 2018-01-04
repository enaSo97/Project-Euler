package PowerSum;

import java.math.BigInteger;

public class PowerSum {
    public static void main(String[] args) {
        BigInteger product = new BigInteger("1");
        String result;
        String bit;
        long sum = 0;

        for (int i = 1; i <= 1000; i++){
            product = product.multiply(new BigInteger("2")); // calculating 2^1000 using BigInteger
            //System.out.println(product);
        }
        System.out.println("2^1000 = " + product);
        result = product.toString(); // converting the product into string
        //System.out.println("result " + result);
        //Integer[] array = new Integer[result.length()];
        System.out.println("length " + result.length());
        for (int j = 0; j < result.length(); j++){
            bit = result.substring(j, j + 1);// splits the string into each digit
            //System.out.println(bit);
            sum = sum + Long.parseLong(bit); // calculates the sum of digits by converting the string into long integer
        }
        System.out.println("sum " + sum); // printing out the final answer

    }
}
