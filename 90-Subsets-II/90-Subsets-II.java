class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        findSubset(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public void findSubset(int index, int[] nums, List<Integer> ds, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(ds));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i - 1] == nums[i])
                continue;
            ds.add(nums[i]);
            findSubset(i + 1, nums, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}