package SmallestMultiple;

public class SmallestMultiple {
    public static void main(String[] args) {
        int smallest = 1;
        int i = 1;
        int count = 0;

        while (count != 20){
            count = 0;
            for (i = 1; i < 21; i++){
                if (smallest % i == 0) {
                    count++;
                }

            }
            smallest++;
        }
        smallest--;
        System.out.println("smallest " + smallest);
    }
}
