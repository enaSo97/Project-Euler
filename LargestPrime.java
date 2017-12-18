package LargestPrine;

public class LargestPrime {
    public static void main(String[] args) {
        long prime = 600851475143L;
        int largest = 0;
        int i = 2;
        while (prime > 0){
            if (i > prime && prime%i == 0){
                //System.out.println("after mod " + prime);
                if (i >= largest){
                    prime = prime/i;
                    largest = i;
                }else{
                    i++;
                }
            }
            else if (prime % i != 0){
                i++;
            }
        }
        System.out.println("largest Prime " + largest);

    }
}
