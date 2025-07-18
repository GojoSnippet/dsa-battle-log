class Solution {
    public boolean currentKCheck(int[] piles,int k,int h){
        int count = 0;
        for(int i: piles){
            count+= Math.ceil((double)i/k);
        }
        if(count <= h)return true;
        else return false;
    }
    public int binarySearchCheck(int[] piles,int start,int last,int h){
        
        if(start == last) return start;
        else{
            int mid = (start+last)/2;
            boolean checkVal = currentKCheck(piles,mid,h);
            if(checkVal){
                return binarySearchCheck(piles,start,mid,h);
            }
            else return binarySearchCheck(piles,mid+1,last,h);
        }
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles[piles.length-1];
        return binarySearchCheck(piles,1,n,h);
    }
}
