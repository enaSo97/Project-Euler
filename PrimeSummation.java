package PrimeSummation;

public class PrimeSummation {
    public static void main(String[] args) {
        long prime = 2;
        long i = 2;
        long sum = 0;

        while(prime < 2000000 ){
            if(prime % i == 0){
                if (prime == i){
                    sum = prime + sum;
                    //System.out.println(prime);
                    prime++;
                    i = 2;
                }else{
                    i = 2;
                    prime++;
                }
            }else if (prime % i != 0){
                i++;
            }
        }
        System.out.println("sum " + sum);
    }
}
