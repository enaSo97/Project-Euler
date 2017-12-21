package PrimeNum;

public class PrimeNum {
    public static void main(String[] args) {
        int index = 0;
        int number = 2;
        int count = 2;
        Integer[] prime = new Integer[10002];

        while (index != 10002){
            count = 2;
            while (count != number){
                if (number%count == 0 && count != number){
                    // not prime
                    number++;
                    count = 2;
                }else {
                    count++;
                }
            }
            if (number%count == 0 /*&& count == number*/){
                prime[index] = number;
                System.out.println("prime " + prime[index]);
                number++;
                index++;
            }
        }
        System.out.println("10001th prime " + prime[10000]); //because index starts from 0
    }
}
