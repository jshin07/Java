
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class PuzzleJava{
    // public ArrayList<Integer> getSum(int[] array){
    //     ArrayList<Integer> array2= new ArrayList<>();
    //     int sum=0;
    //     for (int i=0; i<array.length; i++ ) {
    //         sum += array[i];
    //         if(array[i]>10){
    //             array2.add(array[i]);
    //         }
    //     }
    //     System.out.println(sum);
    //     return array2;
    // }

    // public ArrayList<String> japNames(String [] array){
    //     ArrayList<String> nameArray= new ArrayList<>();
    //     ArrayList<String> newArray= new ArrayList<>();
    //     for (int y =0 ;y < array.length ; y++ ) {
    //         nameArray.add(array[y]);
    //     }
    //     System.out.println("This is original array " + nameArray);
    //     Collections.shuffle(nameArray);
    //     System.out.println("This is a shuffled array " + nameArray);
    //     for (int x =0; x< nameArray.size() ;x++ ) {
    //         if(nameArray.get(x).length() >5){
    //             newArray.add(nameArray.get(x));
    //         }
    //     }
    //     return newArray;
    // }

    // public void alphabets(char [] array){
    //     ArrayList<Character> alphabetArray = new ArrayList<Character>();
    //     for (int i = 0; i < array.length; i++){
    //             alphabetArray.add(array[i]);
    //         }
    //         System.out.println("This is an array of alphabets: " + alphabetArray);
    //         Collections.shuffle(alphabetArray);
    //         System.out.println("This is a shuffled array: " + alphabetArray);
    //
    //         char[] firstLast = alphabetArray.toString().replaceAll(",", "").replaceAll(" ", "").toCharArray();
    //
    //     System.out.println("This is the first character: " + firstLast[1]);
    //     System.out.println("This is the last character: " + firstLast[26]);
    //
    //     char[] vowels = {'a','e','i','o','u'};
    //     for (int z =0; z< vowels.length ;z++ ) {
    //         if (firstLast[1] == vowels[z]){
    //             System.out.println("The first character is vowel: " + firstLast[1]);
    //         }
    //     }
    // }

    // public void tenRandom(){
    //     int[] array = new int[10];
    //
    //     for (int i=0;i<10 ;i++ ) {
    //         Random rand = new Random();
    //         int value = rand.nextInt(55)+46;
    //         array[i] =value;
    //     }
    //     System.out.println(Arrays.toString(array));
    // }

    // public void tenRandomPlus(){
    //     int[] array = new int[10];
    //
    //     for (int i=0;i<10 ;i++ ) {
    //         Random rand = new Random();
    //         int value = rand.nextInt(55)+46;
    //         array[i] =value;
    //     }
    //     Arrays.sort(array);
    //     System.out.println(Arrays.toString(array));
    //
    //     int max= array[0];
    //     int min = array[0];
    //     for (int j=0; j< array.length;j++){
    //         if (array[j]> max){
    //         max= array[j];
    //         }
    //         if (array[j]< min){
    //             min= array[j];
    //         }
    //     }
    //     System.out.println("This is max: " + max);
    //     System.out.println("This is min: " + min);
    // }

    // public void randString(){
    //     String uuid = UUID.randomUUID().toString();
    //     uuid = uuid.toString().replaceAll("-", "").substring(0,5);
    //
    //     System.out.println(uuid);
    // }

    public void randStringArray(){
        String[] array = new String[10];
        for (int i=0;i<10 ;i++ ) {
            String uuid = UUID.randomUUID().toString();
            uuid = uuid.toString().replaceAll("-", "").substring(0,5);
            array[i] =uuid;
        }

        System.out.println(java.util.Arrays.toString(array));
    }



}
