package Exercises;
/* Задача 5. Поиск числа в массиве. Бинарный поиск

*/
public class Exercises5Search {
    public int search (int [] nums, int target){
int left = 0;
int right = nums.length - 1;
return rec (nums, target, left,right);
    }
    private int rec (int[] nums, int target, int left, int right) {
       int mid = (left + right) / 2;
       if (left > right) {
           return - 1;
       } else if (target == nums[mid]){
           return mid;
       } else if (target > nums[mid]);
       return rec (nums, target, mid + 1, right);
  //  } else {
  //      return rec(nums, target, left, mid - 1);
    }
}

