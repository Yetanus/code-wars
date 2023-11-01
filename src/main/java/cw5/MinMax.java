package cw5;

import java.util.Arrays;
import java.util.NoSuchElementException;

class MinMax {
    public MinMax() {
    }

    public static int[] minMax(int[] arr) {
        Integer min = Arrays.stream(arr).min().orElseThrow(NoSuchElementException::new);
        Integer max = Arrays.stream(arr).max().orElseThrow(NoSuchElementException::new);
        return new int[]{min, max};
    }
}
