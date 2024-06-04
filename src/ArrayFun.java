public class ArrayFun {

    public static int[] multiplyArrayByTwo(int[] numberInput) {

        int[] output = new int[numberInput.length];

        for (int count = 0; count < 6; count++) {
            int eachElement = numberInput[count] * 2;
            output[count] = eachElement;
        }
        return output;
    }
}
