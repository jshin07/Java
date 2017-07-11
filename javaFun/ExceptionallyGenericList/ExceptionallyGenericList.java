import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ExceptionallyGenericList {
    // ExceptionallyGenericList myList = new ExceptionallyGenericListTest();

    public static void main(String[] args) {
        genList();
    }
    public static void genList(){
        // List<Objects> myList = new ArrayList<>();
        List<String> myList = new ArrayList<>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        System.out.println(myList);
        // for (int i=0; i<myList.size();i++ ) {
        //     try{
        //     int castedValue = (Integer)myList.get(i);
        //     }
        //     catch(ClassCastException x){
        //         System.out.println("ERROR ON INDEX #" + i);
        //     }
        // }
    }
}
