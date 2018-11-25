import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
    public static int[] insertionSort(char[] array){
        for (int i = 0; i < array.length; i++) {
            int key =array[i];
            int initialposition = i;

//            while ( initialposition > 0 && key > array[i-1] ){
//
//            }

            for (int j = i-1; j >=0 && array[j] > key ; j--) {
                    array[j+1] = array[j];
                initialposition = initialposition -1;
            array[initialposition] = key;
        }
        }
        return array;
    }

//    public int[] recursive(int n, int[] array) {
//
//        if (n <= 0) {
//            return array;
//        } else {
//
//
//
//        }

//    }
//    public int[] rec(int i,int[] array){
//        if (i==0){
////            System.out.println(i);
////            return
//        }
//        else {
//
//            for (int j = i-1; j > 0 && value >  array[i+1]  ; j++) {
//
//                rec(i,array);
//            }
//        }
//        return array;
//    }
//
//

    public int[] removeDuplicates(int[] array){
ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i <array.length; i++) {
            if (array[i]== array[i+1]){
//                System.out.println(array[i]);
//                a.remove(array[i]);
                a.remove(array[i]);

            }
            else {
                System.out.println(array[i]);
            }
        }
        return array;
    }
    public int[] removeDuplicate(int []s){
        int [] k = new int[s.length];
        k[0]=s[0];
        int m =1;
        for(int i=1;i<s.length;++i){
            if(s[i]!=s[i-1]){
                k[m]=s[i];
                ++m;
//                int le = s.length--;
            }//endIF
        }//endFori
        return k;
    }//endMet

//    public void

    public int[] selectionSort(int[] array){
        int minimum_Element,k;
        for (int i = 0; i <array.length ; i++) {

            minimum_Element=k;
            for (int j = i; j <array.length ; j++) {
//        for (int i = 0; i <arr.length ; i++) {
////            if ()
//        }
//    }           int value = array[i];
////                array[j+1] = array[j];
////                j=j-1;
////
////                array[i] = value;
                if (array[j]<array[minimum_Element]){
                    minimum_Element=j;
                }
            }
            k=array[minimum_Element];
            array[minimum_Element]=array[i];
            array[i] = k;
        }
return array;
    }
//    public void skip(int[] arr){

}