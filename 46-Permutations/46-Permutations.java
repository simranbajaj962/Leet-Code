// Time Complexity: (n! * n)
// Space Complexity: O(n) + O(n)

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        findPermutations(nums, new ArrayList<>(), ans, freq);
        return ans;
    }

    private void findPermutations(int nums[], List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                findPermutations(nums, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}

// Time Complexity: (n! * n)
// Space Complexity: O(n) + O(n!)
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findPermutations(0,nums,ans);
        return ans;
    }

    private void findPermutations(int index, int nums[],List<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index; i<nums.length;i++){
            swap(i,index,nums);
            findPermutations(index+1,nums,ans);
            swap(i,index,nums);
        }
    }

    private void swap(int i,int j,int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}