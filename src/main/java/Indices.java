public class Indices {
    //    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up
    //    to target.
    //    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //    You can return the answer in any order.
    //
    //    Input: nums = [2,7,11,15], target = 9
    //    Output: [0,1]
    //    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    public static int[] findIndicies(int[] indices, int target) {
        for (int i = 0; i <indices.length; i++) {
            for (int j = i+1; j< indices.length; j++ ) {
                int value1 = indices[i];
                int value2 = indices[j];
                int sum = value1 + value2;

                if (sum == target) {
                    System.out.println("Indices that add up to the target " + target + ":");
                    System.out.println("Index 1: " + value1);
                    System.out.println("Index 2: " + value2 + "\n");
                    return new int[]{i, j};
                }
            }
        }
        System.out.println("No indices found that add up to the target" + target + ".\n");
        return new int[0];
    }

    public static void main(String[] args) {
        // Example usage
        int[] indices = {2, 7, 11, 15};
        int target = 9;

        int[] result = findIndicies(indices, target);

        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No indices found.");
        }
    }
}
