package GirdProduct;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GridProduct {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[400];
        BufferedReader reader;
        int j = 0;
        long product = 0;
        long max = 0;
        try{
            reader = new BufferedReader(new FileReader("grid.txt"));
            String line = reader.readLine();
            while(line != null){
                String[] stringArray = line.split(" ");
                for (int i = 0; i < stringArray.length; i++){
                    intArray[j] = Integer.parseInt(stringArray[i]);
                    //System.out.println(intArray[j]);
                    //System.out.println("j " + j);
                    j++;
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int i = 0;
        while(i < intArray.length - 64) {
            if (i % 19 != 0 || i == 0 || i % 18 != 0 || i % 17 != 0) {
                product = intArray[i] * intArray[i + 21] * intArray[i + 42] * intArray[i + 63];
                //System.out.println(product);
                if (product > max) {
                    max = product;
                    //System.out.println(max);
                }
            }
            i++;
        }
        int m = 3;
        while( m < intArray.length - 60){
            product = intArray[m] * intArray[m + 19] * intArray[m + 38] * intArray[m + 57];
            System.out.println(product);
            if (product > max) {
                max = product;
                System.out.println(max);
            }
            m++;
        }
        int k = 0;
        while (k < intArray.length - 60){
            product = intArray[k] * intArray[k + 20] * intArray[k + 40] * intArray[k + 60];
            if (product > max) {
                max = product;
                System.out.println(max);
            }
            k++;
        }
        int h = 0;
        while (h < intArray.length - 4){
                product = intArray[h] * intArray[h + 1] * intArray[h + 2] * intArray[h + 3];
           // System.out.println(product);
                if (product > max) {
                    max = product;
                    //System.out.println(max);
                }
            h++;
        }

        System.out.println("Max " + max);
    }
}
