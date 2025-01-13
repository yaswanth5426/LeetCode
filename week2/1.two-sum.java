class Solution {
    boolean twoSum(int arr[], int target) {
        
       HashSet<Integer> set= new HashSet<>();
       for(int i=0;i<arr.length;i++){
           int diff= target-arr[i];
           if(set.contains(diff)){
               return true;
           }
           set.add(arr[i]);
       }
       return false;
  }
}