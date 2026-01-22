package part11;
import java.util.*;

//java collection s framework example
public class App {
    public static void main(String[] args) {
        // List<String> list = new ArrayList<>();
        // list.add("Apple");
        // list.add("Banana");
        // list.add("Cherry");
        // for (String fruit : list) {
        // System.out.println(fruit);
        // }
        // List<String> list = List.of("Apple", "Banana", "Cherry");
        // for (String fruit : list) {
        // System.out.println(fruit);
        // }

        // Set<String> set = new HashSet<>();
        // set.add("Apple");
        // set.add("Banana");
        // set.add("Cherry");
        // set.add("Apple");
        // for (String fruit : set) {
        // System.out.println(fruit);
        // }
        // Set<String> set = Set.of("Apple", "Banana", "Cherry");
        // for (String fruit : set) {
        // System.out.println(fruit);
        // }

        // Queue<String> queue = new LinkedList<>();
        // queue.offer("Apple");
        // queue.offer("Banana");
        // queue.offer("Cherry");
        // // System.out.println(queue.poll());
        // // System.out.println(queue.peek());
        // // System.out.println(queue.size());
        // while (!queue.isEmpty()) {
        //     System.out.println(queue.poll());
        //     System.out.println(queue.peek());
        // }

        // Deque<String> deque = new ArrayDeque<>();
        // deque.addFirst("Apple");   
        // deque.addFirst("Banana");
        // deque.addLast("Cherry");
        // System.out.println(deque.poll());
        // // System.out.println(deque.peek());
        // // System.out.println(deque.size());
        // while (!deque.isEmpty()) {
        //     System.out.println(deque.poll());
        // }
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 12);
        map.put("Banana", 29);
        map.put("Cherry", 32);
        // System.out.println(map);
        // System.out.println(map.get("Banana"));
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }   
    }
}
