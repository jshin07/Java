import java.util.ArrayList;


class Basics {
    // public void print1To255(){
    //     for (int i = 0; i < 256; i++){
    //         System.out.println(i);
    //     }
    // }
    //
    // public void printOdd1To255(){
    //     for (int i = 0; i < 256; i++){
    //         if(i % 2 != 0){
    //         System.out.println(i);
    //         }
    //     }
    // }
    //
    // public void sum(){
    // int sum=0;
    //     for (int i = 0; i < 256; i++){
    //         sum=i+sum;
    //         String result = "New Number: "+i +" Sum: " + sum;
    //         System.out.println(result);
    //     }
    // }
    //
    // public void iterateArray(int[] array){
    //     for (int i = 0; i < array.length; i++){
    //         System.out.println(array[i]);
    //     }
    // }
    //
    // public void findMax(int[] array){
    // int max = array[0];
    //     for (int i = 1; i < array.length; i++){
    //         if (array[i]> max){
    //             max= array[i];
    //         }
    //     }
    // System.out.println(max);
    // }
    //
    // public void getAverage(int[] array){
    //     int sum=0;
    //     for (int i = 0; i < array.length; i++){
    //         sum= sum+array[i];
    //     }
    //     System.out.println(sum/(array.length));
    // }
    //
    // public void oddNumbers(){
    //     ArrayList<Integer> y = new ArrayList<>();
    //     for (int i = 0; i < 256; i++){
    //         if(i % 2 != 0){
    //             y.add(i);
    //         }
    //     }
    //     System.out.println(y);
    // }

    // public int greaterThanY(int[] array, int y){
    //     int count= 0;
    //     for (int i =0; i < array.length; i++){
    //         if (array[i]> y){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // public void squareValue(int[] array){
    //     ArrayList<Integer> y = new ArrayList<>();
    //     for (int i=0; i< array.length;i++){
    //         y.add(array[i]*array[i]);
    //     }
    //     System.out.println(y);
    // }

    // public void eliminateNegNumbers(int[] array){
    //     ArrayList<Integer> x = new ArrayList<>();
    //     for (int i=0; i<array.length; i++){
    //         if(array[i]<0){
    //             array[i]=0;
    //         }
    //         x.add(array[i]);
    //     }
    //     System.out.println(x);
    // }

    // public void maxMinAverage(int[] array){
    //     int max = array[0];
    //     int min = array[0];
    //     int sum = 0;
    //     for (int i=1; i< array.length; i++){
    //         if(array[i]>max){
    //             max= array[i];
    //         }
    //         if(array[i]<min){
    //             min= array[i];
    //         }
    //         sum += array[i];
    //     }
    //     int[] result;
    //     result= new int[3];
    //     result[0]=max;
    //     result[1]=min;
    //     result[2]=sum;
    //     System.out.println(java.util.Arrays.toString(result));
    // }

    public void shiftValues(int[] array){
        for (int i=1; i< array.length; i++){
            try{
            array[i]= array[i+1];
            }
            catch(ArrayIndexOutOfBoundsException x) {
                array[i]=0;
            }
        }

        System.out.println(java.util.Arrays.toString(array));
    }

}
