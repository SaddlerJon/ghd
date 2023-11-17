import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IndicesTest {

    @Test
    public void testValidPairOfIndices() {
        int[] indices = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, Indices.findIndicies(indices, target));
    }

    @Test
    public void testAnotherValidPairOfIndices() {
        int[] indices = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, Indices.findIndicies(indices, target));
    }

    @Test
    public void testNoValidPairOfIndices() {
        int[] indices = {1, 2, 3, 4};
        int target = 8;
        int[] expected = new int[0];
        assertArrayEquals(expected, Indices.findIndicies(indices, target));
    }

    @Test
    public void testValidPairOfIndicesWithZeroTarget() {
        int[] indices = {-1, -2, -3, 2, 0};
        int target = 0;
        int[] expected = {1, 3};
        assertArrayEquals(expected, Indices.findIndicies(indices, target));
    }

    @Test
    public void testEmptyArray() {
        int[] indices = {};
        int target = 5;
        int[] expected = new int[0];
        assertArrayEquals(expected, Indices.findIndicies(indices, target));
    }
}
