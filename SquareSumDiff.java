package SquareSumDiff;

public class SquareSumDiff {
    public static void main(String[] args) {
        int diff = 0;
        int sum = 0;
        int square = 0;

        for (int i = 1; i < 101; i++){
            sum = (i * i) + sum;
            square = i + square;
        }
        square = square * square;
        diff = square - sum;
        System.out.println("diff " + diff);
    }
}
