package HighestSum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

public class HighestSum {
    public static void main(String[] args) {
        BufferedReader reader;
        ArrayList<Integer> array = new ArrayList<>();
        int index = 0;
        BigInteger sum = new BigInteger("1");
        String result;
        try{
            reader = new BufferedReader(new FileReader("numbers.txt"));
            String line = reader.readLine();
            while(line != null){
                sum = sum.add(new BigInteger(line));
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //result = result.substring(0,11);
        System.out.println("sum " + sum);
        //System.out.println("First 10 digit of sum of 150 digits " + result);
    }
}
