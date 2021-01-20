class Solution {
    public static void subsets(int[] ar,List<Integer> temp,List<List<Integer>> ans,int i) 
    {
			if(i==ar.length) {
				List<Integer> subset = new ArrayList<>(temp);
				ans.add(subset);
				return;
			}
			temp.add(ar[i]);
			subsets(ar, temp,ans, i+1);
			temp.remove(temp.size()-1);
			subsets(ar, temp,ans, i+1);
			
		}
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
			subsets(nums,new ArrayList<>(),res, 0); 
            return res;        
    }
}
