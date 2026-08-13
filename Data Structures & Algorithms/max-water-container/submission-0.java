class Solution {
    public int maxArea(int[] heights) {
        //two pointer question 

        //formula for volume calculation 
        // min value() *(right - left)
        int left = 0 ; 
        int right = heights.length - 1;
        int maxarea = 0;


        for ( int i = 0 ; i < heights.length ; i ++){
            
            int height = Math.min (heights[left], heights[right]);
            int width = right - left ;

            int area = height * width ;

            maxarea = Math.max(maxarea,area);

            if(heights[left] < heights[right]){
                left ++;
            }else{
                right -- ;
            }
        }

        return maxarea;
    }
}
