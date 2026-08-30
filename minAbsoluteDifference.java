class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
    
        Arrays.sort(arr);

        List<List<Integer>> list = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
           int diff = arr[i+1]-arr[i];

           if(diff<minDiff){
            minDiff =diff;
            list.clear();
            List<Integer> temp= new ArrayList<>();
            temp.add(arr[i]);
            temp.add(arr[i+1]);
            list.add(temp);
           }

           else if(diff==minDiff){
            List<Integer> temp= new ArrayList<>();
            temp.add(arr[i]);
            temp.add(arr[i+1]);
            list.add(temp);
           }
        }

        return list;
    }
}
