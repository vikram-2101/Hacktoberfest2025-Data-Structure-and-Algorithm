
public class TrapingRainWater {

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = trap(arr);
        System.out.println(ans);
    }

    public static int trap(int[] height) {
        int n = height.length;
        int res = 0;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = height[0];
        for(int i = 1;i < n;i++){
            lmax[i] = Math.max(height[i],lmax[i-1]);
        }
        rmax[n-1] = height[n-1];
        for(int j = n-2; j>=0;j--){
            rmax[j] = Math.max(height[j], rmax[j+1]);
        }
        for(int k = 1;k<n-1;k++){
            res = res + (Math.min(lmax[k],rmax[k])-height[k]);
        }
        return res;
    }
}