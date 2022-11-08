package leetcode_top_interview_question;

public class _01_Two_Sum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 4;
        int[] result = new int[2];
        result = twoSum(nums,target);
        for (int i = 0; i < result.length ; i++) {
            System.out.println(result[i]);
        }
    }
        public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int temp_value=0;
            for (int i = 0; i <nums.length ; i++) {
                temp_value = nums[i];
                for (int j = i+1; j < nums.length ; j++) {
                    if((temp_value + nums[j])==target){
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }

        return result;
        }
    }

