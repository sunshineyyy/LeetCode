//Assume that each input would have exactly one solution.
//Return {0, 0} if no match found.
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] resultArray = {0,0};
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target-numbers[i])) {
                int index = map.get(target-numbers[i]);
                resultArray[0] = index + 1;
                resultArray[1] = i + 1;
            } else {
                map.put(numbers[i],i);
            }
        }
        return resultArray;
    }
}
