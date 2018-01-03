package TriangularNumber;

public class TriangularNumber {
    public static void main(String[] args) {
        Integer[] array = new Integer[1000000]; // integer array to store triangular numbers
        int numOfFactor = 0;
        int i = 2;
        int divisor = 1;
        array[1] = 1;
        while(numOfFactor < 502){
            numOfFactor = 0;
            divisor = 1;
            array[i] = array[i - 1] + i;
            //System.out.println(array[i]);
            while(divisor <= array[i]){// checking for the factor number for the number of corresponding index
                if (array[i]%divisor == 0){
                    numOfFactor++;
                    divisor++;
                }else{
                    divisor++;
                }
            }
            System.out.println("number of factor " + numOfFactor);
            i++;
        }
        System.out.println("first triangular number with over 500 divisor " + array[i - 1]);
    }
}
