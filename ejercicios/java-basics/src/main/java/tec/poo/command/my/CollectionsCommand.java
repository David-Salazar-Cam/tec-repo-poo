package tec.poo.command.my;

import java.util.*;

public class CollectionsCommand {

    private String[] args;

    public CollectionsCommand(String[] args) {
        this.args = args;
    }

    public void execute() {
        // Example of using List
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");

        // Using stream method to print elements of the list
        System.out.println("List elements:");
        myList.stream().forEach(System.out::println);

        // Example of using Set
        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(2); // Adding a duplicate element, which will be ignored

        // Using stream method to print elements of the set
        System.out.println("\nSet elements:");
        mySet.stream().forEach(System.out::println);

        // Example of using Map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 10);
        myMap.put("banana", 20);
        myMap.put("orange", 30);

        // Using stream method to print elements of the map
        System.out.println("\nMap elements:");
        myMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }

    @Override
    public String toString() {
        return "Collections Example";
    }
}
