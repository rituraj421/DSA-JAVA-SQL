package COLLECTIONS;

import java.util.ArrayList;
import java.util.List;

public class coll_1_list {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("ritu");
        myList.add("raj");
        myList.add("Roj");

        myList.remove("Roj");// or we can also input the index which we want to remove
        myList.remove(1); // here we are removing the index 

        myList.add(1, "choudhary");

        // myList.get(0);
        System.out.println(myList.get(0));
        System.out.println(myList);

        System.out.println(myList.size());
    }
}
