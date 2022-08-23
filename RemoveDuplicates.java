//Remove duplicates
//You are given an array of Integers. The task is to remove all those duplicates of elements that appears more than once in the array.
//Input: 7
// 1 2 3 2 3 1 1     
//Output: [1, 2, 3]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                continue;
            } 
            output.add(arr[i]);
            map.put(arr[i], true);
            
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> output = removeDuplicates(arr);
        System.out.println(output);
    }
}