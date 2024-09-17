package Leetcode;


import java.util.ArrayList;
import java.util.List;

public class Combination_Sum  {

    private void findCombinations(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (arr[index] <= target) {
            ds.add(arr[index]);
            findCombinations(index, arr, target - arr[index], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(index + 1, arr, target, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    // Main method to test the combinationSum function
    public static void main(String[] args) {
        Combination_Sum Cs = new Combination_Sum();
        int[] candidates = {3,4};
        int target = 13;

        List<List<Integer>> result = Cs.combinationSum(candidates, target);

        // Printing the result
        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
