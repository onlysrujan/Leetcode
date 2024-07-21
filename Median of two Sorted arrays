class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int temp[]=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                temp[k++]=nums1[i++];
            }else{            
                temp[k++]=nums2[j++];
            }
        }
        while(i<nums1.length){
            temp[k++]=nums1[i++];
        }
        while(j<nums2.length){
            temp[k++]=nums2[j++];
        }
        int c=nums1.length+nums2.length;
        if(c%2==0){
            int a=temp[c/2-1];
            int e=(c/2);
            int b=temp[e];
            double d=(double)(a+b)/2;
            return d;
        }else{
            return (double)temp[c/2];
        }     
    }
}
