class Solution {
public int countGoodRectangles(int[][] rectangles) {
    int max=0;
    int ans=0;
    for (int i=0; i<rectangles.length; i++){
        int tm= Math.min(rectangles[i][0],rectangles[i][1]);
        
            max= Math.max(max,tm); 
        
        
    }
    System.out.println(max);
    int j=0;
    for(;j<rectangles.length;j++){
        int tm= Math.min(rectangles[j][0],rectangles[j][1]);

        if (max==tm){
        ans+=1;
    }
    }
return ans;
}
}
