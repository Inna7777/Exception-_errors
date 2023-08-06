package lesson1;


public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        System.out.println(getArrayLength( new int[]{1,2,3,3,3,5}, 10));


    }

    public  static int getArrayLength(int[] array, int min){
        if (array.length < min){
            return -1;
        }
        return array.length;
    }

}