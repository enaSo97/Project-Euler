package LargestPalindrome;

public class LargestPalindrome {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int multi = 0;
        int count = 0;
        int check = 0;
        String string;
        String[] array = new String[5];
        String[] three = new String[5];
        String[] second = new String[5];
        String[] result  = new String[10000];

        for (int i = 1; i < 1000; i++){
            for (int j = 1; j < 1000; j++){
                multi = i * j;
                string = Integer.toString(multi);
                //System.out.println(multi);
                if (string.length() > 2 && string.length()%2 == 0) {
                    array[0] = string.substring(0, (string.length() / 2));
                    array[1] = string.substring(string.length() / 2);
                    if (array[1].length() > 2 && array[0].length() > 2){
                        three[0] = array[1].substring(2,3);
                        second[0] = array[0].substring(0,1);
                        second[1] = array[0].substring(1,2);
                        three[1] = array[1].substring(1,2);
                        three[2] = array[1].substring(0,1);
                        second[2] = array[0].substring(2,3);
                        if (three[0].equals(second[0])){
                            if (three[1].equals(second[1])){
                                if (three[2].equals(second[2])){
                                    result[count] = array[0] + array[1];
                                    count++;
                                }
                            }
                        }
                    }

                }
            }
        }
        for (int k = 0; k < count; k++){
            check = Integer.parseInt(result[k]);
            if (check > 900000) {
                System.out.println("found " + result[k]);
            }
        }
    }
}
