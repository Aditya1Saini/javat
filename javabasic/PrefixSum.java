
public class PrefixSum
{
    public static  void SubArr(int nums[])
    {
        int totalSub=0;
        int maxSum=Integer.MIN_VALUE;// min_value  give the least value of integer
        int prefix[]= new int [nums.length];
        prefix[0]= nums[0]; // as we know that prefix arr start is always zero 
        for(int i=1;i<nums.length;i++)// prefix arr calculate
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int start =0 ;start< nums.length;start++) // to fix the start point in the arr[2,4,6,8,10]
        {
            for(int end=start;end<nums.length;end++)//to fix the end point 
            {
                totalSub= start==0 ? prefix[end] : prefix[end]- prefix[start-1];
                

            }
            if(maxSum<totalSub)
            {
                maxSum= totalSub;
            }
        }
        System.out.println("the total subarrays are : "+maxSum);
    }
    public static void main(String[] args) {
        int nums[] ={1,-2,6,-1,3};
        SubArr(nums);
        
    }
}