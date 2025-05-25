import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {

            int targetMenosValorAtual = target - nums[i];

            if(map.containsKey(targetMenosValorAtual)) {

                result[0] = map.get(targetMenosValorAtual);
                result[1] = i;

                return result;
            } else {
                map.put(nums[i], i);
            }
        }

        throw new IllegalArgumentException("Nenhuma combinação de índices encontrada para o target fornecido.");
    }
}
