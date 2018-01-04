package CollatzSequence;

public class CollatzSequence {
    public static void main(String[] args) {
        int start = 0;
        int count = 0;
        int max = 0;
        int longest =0;

        for (int i = 0; i < 1000000; i++){
            count = Chain(i);
            if (count > max){
                max = count;
                longest = i;
            }
        }
        System.out.println("longest chain " + longest + "max " + max);
    }
    public static int Chain(int num){
        int numChain = 1;
        //System.out.println(num);
        while(num > 1){
            numChain++;
            if (num%2 == 0){
                num = num / 2;
                if(num == 837799){
                    System.out.println();
                }
                //System.out.println(num);
                //numChain++;
            }
            else{
                num = (num * 3) + 1;
                //System.out.println(num);
                //numChain++;
            }
        }
        return numChain;
    }
}
