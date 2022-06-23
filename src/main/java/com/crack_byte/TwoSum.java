package com.crack_byte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TwoSum {
    /**
     * O(n) but fast
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int pow = (int) Math.pow(1, 2);
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        int i = 0;
        while (i < nums.length) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]) - 1, i};
            }
            map.put(nums[i], ++i);

        }
        return nums;
    }

    public static int solve(List<Integer> A, int B) {
        Map<Integer, Integer> map = new HashMap<>(A.size());
        int i = A.size() - 1, count = 0;
        while (i >= 0) {
            Integer key = A.get(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
            --i;
        }
        i = A.size() - 1;
        while (i >= 0) {
            Integer t = map.get(B - A.get(i));
            if (t != null && t != i) {
                ++count;
            }
            --i;
        }
        return count;
    }
    static int power(int x, int y)
    {
        if (y == 0)
            return 1;
        else if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        else
            return x * power(x, y / 2) * power(x, y / 2);
    }
    /**
     * two pointer approach faster
     * Note : currently has some issues with it nmeed to fix
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int target, int... nums) {
        int low = 0;
        int high = nums.length - 1;
        int c1 = nums[low], c2 = nums[high];
        while (c1 + c2 != target) {
            if (Math.abs(c1 + c2) < Math.abs(target)) {
                low++;
            } else if (Math.abs(c1 + c2) > Math.abs(target)) {
                high--;
            }
            c1 = nums[low];
            c2 = nums[high];
        }
        return new int[]{low, high};
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> T = B;
        ArrayList<Integer> T2 = A;
        if(A.size()>=B.size()){
            T = A;
            T2 = B;
        }
        for(int i = 0 ; i<T.size();++i){
            int ind = search(T2,T.get(i));
            if(ind<0){
                T.remove(i);
            }else{
                T2.remove(ind);
            }
        }
        Iterator<Integer> iterator = T.iterator();
        return T;

    }
    public static int search(ArrayList<Integer> list , int target){
        int i = 0,j=list.size()-1;
        while(i<=j){
            if(i<j){
                if(list.get(i)==target) return i;
            }
            if(list.get(j)==target) return j;
            ++i;
            --j;
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,1,4,10));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,6,2,10,1));

        ArrayList<Integer> solve = solve(list, list2);
        System.out.println(solve.size());
    }
}
