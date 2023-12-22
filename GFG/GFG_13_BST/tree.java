package GFG_13_BST;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class tree {
    public static void main(String[] args) {
        // treeset
        TreeSet<String> t = new TreeSet<>();
        t.add("ritu");
        t.add("raj");
        t.add("Ch"); 
        
        System.out.println(t);

        System.out.println(t.contains("raju"));

        Iterator<String> i = t.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        // treeMap
        System.out.println("TreeMap");


        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10,"ritu");
        tm.put(11, "raj");
        tm.put(12, "c");

        System.out.println(tm);
        System.out.println(tm.containsKey(10));

        for(Map.Entry<Integer, String>e : tm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
