
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        int k = 4;
        //Output: [2,3]
        System.out.println(Arrays.toString(topKFrequent(nums, k)));

    }

    public static int[] topKFrequent(int[] nums, int k) {

        //Almacenamos los numeros existentes
        Map<Integer, Integer> mapNums = new HashMap<>();
        //Definimos el array para retornar
        int[] result = new int[k];

        //Iteramos el array para comenzar almacenar los datos en HashMap
        for (int i : nums) {

            //Usamos mapNums.getOrDefault para prevenir un valor nulo, key, defaultValue + 1
            mapNums.put(i, mapNums.getOrDefault(i, 0) + 1);
        }

        //Creamos el minHeap para organizar de menor mayor con Map.Entry
        //PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Map.Entry.comparingByValue());

        for (Map.Entry<Integer, Integer> en : mapNums.entrySet()) {
            minHeap.add(en);
            //Validamos el tamaño del minHeap
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        //Almacenamos en el array result
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll().getKey();
        }

        return result;
    }
}
