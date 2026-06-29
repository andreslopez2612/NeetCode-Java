import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {

        int[] nums = {1,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,5,5,6,6,6,6,6,6,6,6,6,6,6,6,6};
        int k = 4;
        //Output: [2,3]
        System.out.println(Arrays.toString(topKFrequent(nums, k)));

    }

    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> numsMaps = new HashMap<>();

        for (Integer s : nums) {
            numsMaps.put(s, numsMaps.getOrDefault(s, 0) + 1);
        }

        // 2. Keep a Min-Heap of size K using a lambda expression
        // It compares map entries by their frequency values (ascending)
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );

        // 3. Maintain only the top K elements in the heap
        for (Map.Entry<Integer, Integer> entry : numsMaps.entrySet()) {
            minHeap.add(entry);// Se agrega datos al minHeap
            if (minHeap.size() > k) {
                minHeap.poll(); // Evict the element with the lowest frequency
            }
        }

        System.out.println(minHeap);

        // 4. Extract results from the heap into an array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll().getKey();
        }
        
        return result;
    }
}
