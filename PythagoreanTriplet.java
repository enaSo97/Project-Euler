package PythagoreanTriplet;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        double triplet = 0;
        double product = 0;

            for ( a = 1; a < 1000; a++){
                for (b = 1; b < 1000; b++) {
                    //triplet = 0;
                    if (a < b) {
                        c = (a * a) + (b * b);
                        //System.out.println("c " + c);
                        triplet = Math.sqrt(c) + a + b;
                        if (triplet == 1000) {
                            product = (Math.sqrt(c)*a*b);
                            System.out.println("final " + a + " " + b + " " + Math.sqrt(c));
                            System.out.println("product of final " + product);
                        }
                    }
                }
            }
    }
}
