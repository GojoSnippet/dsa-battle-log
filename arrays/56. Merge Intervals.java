class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                return Integer.compare(a[0],b[0]);
            }
        });
        List<List<Integer>> final_ans = new ArrayList<>();
        int start=intervals[0][0];int end=intervals[0][1];
        for(int i=1;i<intervals.length;++i){
            if(intervals[i][0] <= end){
                if(intervals[i][1] >= end)
                end=intervals[i][1];
            }
            else{
                List<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(end);
                final_ans.add(temp);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        List<Integer> temp2 = new ArrayList<>();
                temp2.add(start);
                temp2.add(end);
                final_ans.add(temp2);
        int[][] arr_ans = new int[final_ans.size()][2];
        for(int i=0;i<final_ans.size();++i){
            for(int j=0;j<2;++j){
                arr_ans[i][j]=final_ans.get(i).get(j);
            }
        }
        return arr_ans;
    }
}
