class chocalate{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        long min=Long.MAX_VALUE;
        int i=0,j=m-1;
        while(j<n){
            min=Math.min(min,a.get(j)-a.get(i));
            i++;
            j++;
        }
        return min;
    }
}