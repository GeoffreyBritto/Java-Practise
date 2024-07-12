public class practise1 {
    public static void main(String[] args){
        String[] name = new String[5];
        int[] rnos; //Declaration of array, roll no array is getting created and the variable is stored in the stack memory
        rnos = new int[5]; //Creation of the object, here object is created in the memory(heap).
        
        //Variables are stored in the stack memory while objects are stored in the heap memory.
        //Declaration happens at Compile-time while Creation of the object happens at Run-time.
        //In C/C++ arrays have contiguous memory allocation however this is not the case in Java as Heap objects are not continuous, it may or may not be continuous
        //Variables of Primitive Datatypes like int, char, bool are stored in the stack memory however Object Datatypes like String, Hashmap are stored in the Heap Memory(look at 25:32 of Introduction to Arrays and ArrayList for clarification)

        for(int i = 0; i < rnos.length; i++){
            rnos[i] = i+1;
            System.out.print(rnos[i]);
        }
    }
}
