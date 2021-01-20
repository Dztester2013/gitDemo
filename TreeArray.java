package Practice;

public class TreeArray {

    public static void main(String[] args) {
        int[] nums = {7,1,7,6,5,3,4,2,100,7};
       int  minValue = nums[0];
        for(int i=0;i<nums.length;i++){

                if(nums[i]<minValue){
                    minValue=nums[i];


            }
        }            System.out.println(minValue);






    }
}
