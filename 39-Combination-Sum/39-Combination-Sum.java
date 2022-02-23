class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        findCombinations(candidates, 0, target, new ArrayList(), result);
        return result;

    }

    public void findCombinations(int[] arr, int start, int target, List<Integer> list, List<List<Integer>> result) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList(list));
        }
        for (int i = start; i < arr.length; i++) {
            list.add(arr[i]);
            findCombinations(arr, i, target - arr[i], list, result);
            list.remove(list.size() - 1);
        }
    }
}