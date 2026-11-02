class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {


        List<List<Integer>> ans = new ArrayList<>();

        findCombination(0, candidates, target,
                        new ArrayList<>(), ans);

        return ans;
    }

    void findCombination(int index, int[] candidates, int target,
                         List<Integer> current, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

        // Pick
        current.add(candidates[index]);

        findCombination(index, candidates,
                        target - candidates[index], current, ans);

        // Backtracking
        current.remove(current.size() - 1);

        // Not Pick
        findCombination(index + 1, candidates,
                        target, current, ans);
    }
}
        
    
