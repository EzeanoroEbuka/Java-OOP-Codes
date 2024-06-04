import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestArrayFun {
    @Test
    public void testingArrayFun() {
         //ArrayFun arrayFun = new ArrayFun();
         int[] ArrayOfnumber = {4,6,10,4,10,6};
         int[] numberInput = {2,3,5,2,5,3};
         assertArrayEquals(ArrayOfnumber,ArrayFun.multiplyArrayByTwo(numberInput ));
    }
}
