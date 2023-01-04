
// Runtime: 3ms
// Memory : 45.1MB

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findcomb(0, candidates, target, ans, new ArrayList<>());
        return ans;

    }

    private void findcomb(int index, int arr[], int target, List<List<Integer>> ans, List<Integer> ds) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[index] <= target) {
            ds.add(arr[index]);
            findcomb(index, arr, target - arr[index], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findcomb(index + 1, arr, target, ans, ds);
    }

}



// Runtime : 8ms 
// Memory : 44.9MB
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