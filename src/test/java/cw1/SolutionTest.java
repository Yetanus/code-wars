package cw1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals(23, new Solution().solution(10));
    }

    @Test
    public void negativeTest(){
        assertEquals(0, new Solution().solution(-1));
    }

}
