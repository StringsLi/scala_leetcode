package math;

/**
 * 遍历数组，无为0的元素移动数组前方，用index下标记录。
 * 遍历结束，对index值后的元素统一设为0
 */

public class Problem_283_MoveZeroes {

    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        while(index < nums.length){
            nums[index++] = 0;
        }

    }
}
