package LargestSeries;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LargestSeries {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        BufferedReader reader;
        int index = 0;
        try{
            reader = new BufferedReader(new FileReader("series.txt"));
            int in = 0;
            while((in = reader.read()) != -1){
                char from = (char) in;
                if (from != '\n') {
                    array.add(Character.getNumericValue(from));
                    index++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("size " + array.size());
        long max = 0;
        for (int i = 0; i < array.size()-13; i++){
            long product = 1;
            for (int j = i; j < 13 + i; j++){
                product = array.get(j) * product;
            }
            if (product >= max){
                max = product;
            }
        }
        System.out.println("Max " + max);
    }
}
