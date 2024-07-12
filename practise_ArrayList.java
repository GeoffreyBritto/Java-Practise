import java.util.ArrayList;

public class practise_ArrayList {
    public static void main(String[] args) {
        //ArrayList is one of the collection framework of Java

        ArrayList<Integer> list = new ArrayList<>();//Integer is the wrapper class of primitive datatype int
        list.add(5); //Adds the value into the ArrayList
        list.add(6);

        System.out.println(list.contains(7)); //Checks if the ArrayList contains the specified value
        list.set(0, 12); //Sets the value in the index given by the first argument to the element given in the next argument

        System.out.println(list);

        for (int i = 0; i < 2; i++) {
            System.out.println(list.get(i)); //list[index] will not work as it's not an array but an ArrayList.
        }
    }
}
