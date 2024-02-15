package CollectionTest2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

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
   
    private static long hashSetTime = 0;
    private static long treeSetTime = 0;
    private static long linkedHashSetTime = 0;
    private static long arrayListTime = 0;
    private static long linkedListTime = 0;
    private static long arrayDequeTime = 0;
    private static long priorityQueueTime = 0;
    private static long hashMapTime = 0;
    private static long treeMapTime = 0;
    private static long linkedHashMapTime = 0;
    
	public static void main(String[] args) {
		Collection<Integer> items = generateRandomItems();
		System.out.println("Done");
		// Load
		hashSet.addAll(items);
		treeSet.addAll(items);
		linkedHashSet.addAll(items);
		arrayList.addAll(items);
		linkedList.addAll(items);
		arrayDeque.addAll(items);
		priorityQueue.addAll(items);
		
		int k =0;
		for (Integer item : items) {
            hashMap.put(k, item);
            treeMap.put(k, item);
            linkedHashMap.put(k,item);
            k++;
        }
		
		for(int i=0; i<NUM_TESTS; i++) {
		add();
		}
		System.out.printf(" HashSet add time: %d\n", hashSetTime / NUM_TESTS);
		System.out.printf(" treeSet add time: %d\n", treeSetTime / NUM_TESTS);
		System.out.printf(" linkedHashSet add time: %d\n", linkedHashSetTime / NUM_TESTS);
		System.out.printf(" arrayListTime add time: %d\n", arrayListTime / NUM_TESTS);
		System.out.printf(" linkedListTime add time: %d\n", linkedListTime / NUM_TESTS);
		System.out.printf(" arrayDequeTime add time: %d\n", arrayDequeTime / NUM_TESTS);
		System.out.printf(" priorityQueueTime add time: %d\n", priorityQueueTime / NUM_TESTS);
		System.out.printf(" hashMapTime add time: %d\n", hashMapTime / NUM_TESTS);
		System.out.printf(" treeMapTime add time: %d\n", treeMapTime / NUM_TESTS);
		System.out.printf(" linkedHashMapTime add time: %d\n", linkedHashMapTime / NUM_TESTS);
		System.out.println("\n");
		
		hashSetTime = 0;
	    treeSetTime = 0;
	    linkedHashSetTime = 0;
	    arrayListTime = 0;
	    linkedListTime = 0;
	    arrayDequeTime = 0;
	    priorityQueueTime = 0;
	    hashMapTime = 0;
	    treeMapTime = 0;
	    linkedHashMapTime = 0;
		
	    for (int i=0; i<NUM_TESTS; i++) {
		contains();
	    }
	    
	    System.out.printf(" HashSet contains time: %d\n", hashSetTime / NUM_TESTS);
	    System.out.printf(" treeSet contains time: %d\n", treeSetTime / NUM_TESTS);
	    System.out.printf(" linkedHashSet contains time: %d\n", linkedHashSetTime / NUM_TESTS);
	    System.out.printf(" arrayList contains time: %d\n", arrayListTime / NUM_TESTS);
	    System.out.printf(" linkedList contains time: %d\n", linkedListTime / NUM_TESTS);
	    System.out.printf(" arrayDeque contains time: %d\n", arrayDequeTime / NUM_TESTS);
	    System.out.printf(" priorityQueue contains time: %d\n", priorityQueueTime / NUM_TESTS);
	    System.out.printf(" hashMap contains time: %d\n", hashMapTime / NUM_TESTS);
	    System.out.printf(" treeMap contains time: %d\n", treeMapTime / NUM_TESTS);
	    System.out.printf(" linkedHashMap contains time: %d\n", linkedHashMapTime / NUM_TESTS);
	    System.out.println("\n");
        
		hashSetTime = 0;
	    treeSetTime = 0;
	    linkedHashSetTime = 0;
	    arrayListTime = 0;
	    linkedListTime = 0;
	    arrayDequeTime = 0;
	    priorityQueueTime = 0;
	    hashMapTime = 0;
	    treeMapTime = 0;
	    linkedHashMapTime = 0;
		
	    for (int i=0; i<NUM_TESTS; i++) {
		remove();
	    }
	    
	    System.out.printf(" HashSet remove time: %d\n", hashSetTime / NUM_TESTS);
	    System.out.printf(" treeSet remove time: %d\n", treeSetTime / NUM_TESTS);
	    System.out.printf(" linkedHashSet remove time: %d\n", linkedHashSetTime / NUM_TESTS);
	    System.out.printf(" arrayList remove time: %d\n", arrayListTime / NUM_TESTS);
	    System.out.printf(" linkedList remove time: %d\n", linkedListTime / NUM_TESTS);
	    System.out.printf(" arrayDeque remove time: %d\n", arrayDequeTime / NUM_TESTS);
	    System.out.printf(" priorityQueue remove time: %d\n", priorityQueueTime / NUM_TESTS);
		System.out.printf(" hashMap remove time: %d\n", hashMapTime / NUM_TESTS);
		System.out.printf(" treeMap remove time: %d\n", treeMapTime / NUM_TESTS);
		System.out.printf(" linkedHashMap remove time: %d\n", linkedHashMapTime / NUM_TESTS);
		System.out.println("\n");

		hashSetTime = 0;
	    treeSetTime = 0;
	    linkedHashSetTime = 0;
	    arrayListTime = 0;
	    linkedListTime = 0;
	    arrayDequeTime = 0;
	    priorityQueueTime = 0;
	    hashMapTime = 0;
	    treeMapTime = 0;
	    linkedHashMapTime = 0;
	    
	    for (int i=0; i<NUM_TESTS; i++) {
		clear();
	    }
		System.out.printf(" HashSet clear time: %d\n", hashSetTime / NUM_TESTS);
		System.out.printf(" treeSet clear time: %d\n", treeSetTime / NUM_TESTS);
		System.out.printf(" linkedHashSet clear time: %d\n", linkedHashSetTime / NUM_TESTS);
		System.out.printf(" arrayList clear time: %d\n", arrayListTime / NUM_TESTS);
		System.out.printf(" linkedList clear time: %d\n", linkedListTime / NUM_TESTS);
		System.out.printf(" arrayDeque clear time: %d\n", arrayDequeTime / NUM_TESTS);
		System.out.printf(" priorityQueue clear time: %d\n", priorityQueueTime / NUM_TESTS);
		System.out.printf(" hashMap clear time: %d\n", hashMapTime / NUM_TESTS);
		System.out.printf(" treeMap clear time: %d\n", treeMapTime / NUM_TESTS);
		System.out.printf(" linkedHashMap clear time: %d\n", linkedHashMapTime / NUM_TESTS);
		}
	public static void add() {
		
		// add a random value
		int item = (int) (Math.random() * 100000);
		int key = (int) (Math.random() * 100000);
		
		long startTime;
		long endTime;
		
		// HashSet
		startTime = System.nanoTime();
		hashSet.add(item);
		endTime = System.nanoTime();
		hashSetTime += endTime - startTime;

		// TreeSet
		startTime = System.nanoTime();
		treeSet.add(item);
		endTime = System.nanoTime();
		treeSetTime += endTime - startTime;

		// LinkedHashSet
		startTime = System.nanoTime();
		linkedHashSet.add(item);
		endTime = System.nanoTime();
		linkedHashSetTime += endTime - startTime;

		// ArrayList
		startTime = System.nanoTime();
		arrayList.add(item);
		endTime = System.nanoTime();
		arrayListTime += endTime - startTime;

		// LinkedList
		startTime = System.nanoTime();
		linkedList.add(item);
		endTime = System.nanoTime();
		linkedListTime += endTime - startTime;

		// ArrayDeque
		startTime = System.nanoTime();
		arrayDeque.add(item);
		endTime = System.nanoTime();
		arrayDequeTime += endTime - startTime;

		// PriorityQueue
		startTime = System.nanoTime();
		priorityQueue.add(item);
		endTime = System.nanoTime();
		priorityQueueTime += endTime - startTime;

		// HashMap
		startTime = System.nanoTime();
		hashMap.put(key, item);
		endTime = System.nanoTime();
		hashMapTime += endTime - startTime;

		// TreeMap
		startTime = System.nanoTime();
		treeMap.put(key, item);
		endTime = System.nanoTime();
		treeMapTime += endTime - startTime;

		// LinkedHashMap
		startTime = System.nanoTime();
		linkedHashMap.put(key, item);
		endTime = System.nanoTime();
		linkedHashMapTime += endTime - startTime;
	}
	
	public static void contains() {
		// find a random value
		int item = (int) (Math.random() * 100000);
		
		long startTime;
		long endTime;
		
		// HashSet
		startTime = System.nanoTime();
		hashSet.contains(item);
		endTime = System.nanoTime();
		hashSetTime += endTime - startTime;

		// TreeSet
		startTime = System.nanoTime();
		treeSet.contains(item);
		endTime = System.nanoTime();
		treeSetTime += endTime - startTime;

		// LinkedHashSet
		startTime = System.nanoTime();
		linkedHashSet.contains(item);
		endTime = System.nanoTime();
		linkedHashSetTime += endTime - startTime;

		// ArrayList
		startTime = System.nanoTime();
		arrayList.contains(item);
		endTime = System.nanoTime();
		arrayListTime += endTime - startTime;

		// LinkedList
		startTime = System.nanoTime();
		linkedList.contains(item);
		endTime = System.nanoTime();
		linkedListTime += endTime - startTime;

		// ArrayDeque
		startTime = System.nanoTime();
		arrayDeque.contains(item);
		endTime = System.nanoTime();
		arrayDequeTime += endTime - startTime;

		// PriorityQueue
		startTime = System.nanoTime();
		priorityQueue.contains(item);
		endTime = System.nanoTime();
		priorityQueueTime += endTime - startTime;

		// HashMap
		startTime = System.nanoTime();
		hashMap.containsValue(item);
		endTime = System.nanoTime();
		hashMapTime += endTime - startTime;

		// TreeMap
		startTime = System.nanoTime();
		treeMap.containsValue(item);
		endTime = System.nanoTime();
		treeMapTime += endTime - startTime;

		// LinkedHashMap
		startTime = System.nanoTime();
		linkedHashMap.containsKey(item);
		endTime = System.nanoTime();
		linkedHashMapTime += endTime - startTime;
	}
	
	public static void remove() {
		// remove a random value
		int item = (int) (Math.random() * 100000);
		int key = (int) (Math.random() * 100000);
		
		long startTime;
		long endTime;
		
		// HashSet
		startTime = System.nanoTime();
		hashSet.remove(item);
		endTime = System.nanoTime();
		hashSetTime += endTime - startTime;

		// TreeSet
		startTime = System.nanoTime();
		treeSet.remove(item);
		endTime = System.nanoTime();
		treeSetTime += endTime - startTime;

		// LinkedHashSet
		startTime = System.nanoTime();
		linkedHashSet.remove(item);
		endTime = System.nanoTime();
		linkedHashSetTime += endTime - startTime;

		// ArrayList
		startTime = System.nanoTime();
		arrayList.remove(item);
		endTime = System.nanoTime();
		arrayListTime += endTime - startTime;

		// LinkedList
		startTime = System.nanoTime();
		linkedList.remove(item);
		endTime = System.nanoTime();
		linkedListTime += endTime - startTime;

		// ArrayDeque
		startTime = System.nanoTime();
		arrayDeque.remove(item);
		endTime = System.nanoTime();
		arrayDequeTime += endTime - startTime;

		// PriorityQueue
		startTime = System.nanoTime();
		priorityQueue.remove(item);
		endTime = System.nanoTime();
		priorityQueueTime += endTime - startTime;

		// HashMap
		startTime = System.nanoTime();
		hashMap.remove(key);
		endTime = System.nanoTime();
		hashMapTime += endTime - startTime;

		// TreeMap
		startTime = System.nanoTime();
		treeMap.remove(key);
		endTime = System.nanoTime();
		treeMapTime += endTime - startTime;

		// LinkedHashMap
		startTime = System.nanoTime();
		linkedHashMap.remove(key);
		endTime = System.nanoTime();
		linkedHashMapTime += endTime - startTime;
	}
	
	public static void clear() {
		//Clear
		long startTime;
		long endTime;
		
		// Measure HashSet clear time
		startTime = System.nanoTime();
		hashSet.clear();
		endTime = System.nanoTime();
		hashSetTime += endTime - startTime;

		// Measure TreeSet clear time
		startTime = System.nanoTime();
		treeSet.clear();
		endTime = System.nanoTime();
		treeSetTime += endTime - startTime;

		// Measure LinkedHashSet clear time
		startTime = System.nanoTime();
		linkedHashSet.clear();
		endTime = System.nanoTime();
		linkedHashSetTime += endTime - startTime;

		// Measure ArrayList clear time
		startTime = System.nanoTime();
		arrayList.clear();
		endTime = System.nanoTime();
		arrayListTime += endTime - startTime;

		// Measure LinkedList clear time
		startTime = System.nanoTime();
		linkedList.clear();
		endTime = System.nanoTime();
		linkedListTime += endTime - startTime;

		// Measure ArrayDeque clear time
		startTime = System.nanoTime();
		arrayDeque.clear();
		endTime = System.nanoTime();
		arrayDequeTime += endTime - startTime;

		// Measure PriorityQueue clear time
		startTime = System.nanoTime();
		priorityQueue.clear();
		endTime = System.nanoTime();
		priorityQueueTime += endTime - startTime;

		// Measure HashMap clear time
		startTime = System.nanoTime();
		hashMap.clear();
		endTime = System.nanoTime();
		hashMapTime += endTime - startTime;

		// Measure TreeMap clear time
		startTime = System.nanoTime();
		treeMap.clear();
		endTime = System.nanoTime();
		treeMapTime += endTime - startTime;

		// Measure LinkedHashMap clear time
		startTime = System.nanoTime();
		linkedHashMap.clear();
		endTime = System.nanoTime();
		linkedHashMapTime += endTime - startTime;
	}
	
	private static Collection<Integer> generateRandomItems() {
        Collection<Integer> items = new ArrayList<Integer>();

        for (int i = 0; i < 1000000; i++) {
            items.add((int) (Math.random() * 100000));
        }

        return items;
    }
}
