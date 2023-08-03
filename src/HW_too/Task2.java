package HW_too;
//Если необходимо, исправьте данный код
//try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = {8, 2, 3, 4, 6};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Catching exception: " + ex);

        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);

        }
    }
}
