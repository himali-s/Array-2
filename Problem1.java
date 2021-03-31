import java.util.*;
//Find All Numbers Disappeared in an Array
    // Time Complexity :O(n)
    // Space Complexity : O(n)
    // Did this code successfully run on Leetcode :Yes
    // Any problem you faced while coding this : Problem while thinking about
    //optimization, could not implement one


    // Your code here along with comments explaining your approach
    //Brute force approach , Make a hashset, dump all the elements of the array 
    // then traverse from i to n and check if set contains the number, if not then add ot 
    // result List
public class Problem1 {
    
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));


    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return res;
        }
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        System.out.println(set);
        int i = 1;
        while(i < n+1){
            if(!set.contains(i)){
            res.add(i);
            
        }
            i++;
            
        }
        
        
        return res;
    }
    
}
