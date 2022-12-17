package project_utils;

public class SumArray {

    public int sumArray(int[] array){

        int sum = 0;
        for (int i : array){
           sum = sum + i;
        }
        return sum;
    }
}
