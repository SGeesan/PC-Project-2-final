package Test;

import java.util.*;
public class Test {
	public static int COLLECTION_SIZE= 100000;
	private static final int NUM_TESTS = 100;
	private static HashSet<Integer> hashSet = new HashSet<>();
    private static TreeSet<Integer> treeSet = new TreeSet<>();
    private static LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    private static ArrayList<Integer> arrayList = new ArrayList<>();
    private static LinkedList<Integer> linkedList = new LinkedList<>();
    private static ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
    private static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    private static HashMap<Integer, Integer> hashMap = new HashMap<>();
    private static TreeMap<Integer, Integer> treeMap = new TreeMap<>();
    private static LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
    
    private static void coltest(Collection<Integer> col, Collection<Integer> items) {
    System.out.println(col.getClass().getName().substring(10) + " test");
    // Initialize total time variables
    long totalAddTime = 0;
    long totalRemoveTime = 0;
    long totalContainsTime = 0;
    long totalClearTime = 0;

    // Perform the experiment
    for (int i = 0; i < NUM_TESTS; i++) {
        // Add all items at the beginning
        col.addAll(items);

        // Measure time for adding number 50
        long startTime = System.nanoTime();
        col.add(50);
        totalAddTime += System.nanoTime() - startTime;

        // Measure time for removing number 60
        startTime = System.nanoTime();
        col.remove(60);
        totalRemoveTime += System.nanoTime() - startTime;

        // Measure time for checking if the collection contains number 70
        startTime = System.nanoTime();
        boolean contains70 = col.contains(70);
        totalContainsTime += System.nanoTime() - startTime;

        // Clear operation
        startTime = System.nanoTime();
        col.clear();
        totalClearTime += System.nanoTime() - startTime;
    }

    // Print average times
    System.out.println("Average time taken for adding number 50: " + (totalAddTime / 100) + " nanoseconds");
    System.out.println("Average time taken for removing number 60: " + (totalRemoveTime / 100) + " nanoseconds");
    System.out.println("Average time taken for checking if collection contains number 70: " + (totalContainsTime / 100) + " nanoseconds");
    System.out.println("Average time taken for clear operation: " + (totalClearTime / 100) + " nanoseconds");
}
    
    private static void maptest(Map<Integer, Integer> map, Collection<Integer> items) {
    System.out.println(map.getClass().getName().substring(10) + " test");

    // Initialize total time variables
    long totalPutTime = 0;
    long totalRemoveTime = 0;
    long totalContainsKeyTime = 0;
    long totalContainsValueTime = 0;
    long totalClearTime = 0;

    // Perform the experiment 100 times
    for (int i = 0; i < NUM_TESTS; i++) {
        // Fill the map with items
        for (Integer item : items) {
            map.put(item, item);
        }

        // Measure time for adding a key-value pair
        long startTime = System.nanoTime();
        map.put(50, 50);
        totalPutTime += System.nanoTime() - startTime;

        // Measure time for removing a key-value pair
        startTime = System.nanoTime();
        map.remove(60);
        totalRemoveTime += System.nanoTime() - startTime;

        // Measure time for checking if the map contains a key
        startTime = System.nanoTime();
        boolean containsKey = map.containsKey(70);
        totalContainsKeyTime += System.nanoTime() - startTime;

        // Measure time for checking if the map contains a value
        startTime = System.nanoTime();
        boolean containsValue = map.containsValue(70);
        totalContainsValueTime += System.nanoTime() - startTime;

        // Measure time for clearing the map
        startTime = System.nanoTime();
        map.clear();
        totalClearTime += System.nanoTime() - startTime;
    }

    // Print average times
    System.out.println("Average time taken for putting a key-value pair: " + (totalPutTime / 100) + " nanoseconds");
    System.out.println("Average time taken for removing a key-value pair: " + (totalRemoveTime / 100) + " nanoseconds");
    System.out.println("Average time taken for checking if map contains a key: " + (totalContainsKeyTime / 100) + " nanoseconds");
    System.out.println("Average time taken for checking if map contains a value: " + (totalContainsValueTime / 100) + " nanoseconds");
    System.out.println("Average time taken for clearing the map: " + (totalClearTime / 100) + " nanoseconds");
}

    public static void main(String[] args) {
    	Collection<Integer> items = generateRandomItems();
    	coltest(hashSet, items);
        coltest(treeSet, items);
        coltest(linkedHashSet, items);
        coltest(arrayList, items);
        coltest(linkedList, items);
        coltest(arrayDeque, items);
        coltest(priorityQueue, items);
        maptest(hashMap, items);
        maptest(treeMap, items);
        maptest(linkedHashMap, items);
        
	}
    
    private static Collection<Integer> generateRandomItems() {
        Collection<Integer> items = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            items.add((int) (Math.random() * 100000));
        }
        return items;
    }
}