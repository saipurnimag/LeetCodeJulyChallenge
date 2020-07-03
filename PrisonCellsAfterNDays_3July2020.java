class Solution {
    public int[] prisonAfterNDays(int[] ar, int N) {
        if(0==ar.length)
            return ar;
        ar = prison(ar,1);
        ar = prison(ar,(N-1)%14);
        return ar;
    }

    public static int[] prison(int ar[], int n){
        while(n-->0){
            int b[] = new int[8];
            for(int i=1;i<=6;++i)
                b[i] = (ar[i-1]==ar[i+1])?1:0;
            ar = b;
        }
        return ar;
    }

}