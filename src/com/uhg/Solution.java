package com.uhg;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'countNonUnique' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static int countNonUnique(List<Integer> numbers) {
   
    StringBuilder str = null;
    Object[] arr=numbers.toArray();
    int c=0;
      for (int i = 0; i <numbers.size(); i++)  
        { 
            for (int j = i + 1; j < numbers.size(); j++)  
            { 
                if (arr[i] == arr[j])  
               // str.append(arr[i]+" ");
                  //  System.out.print(arr[i] + " "); 
                	c++;
            } 
        } 
      return c/*Integer.valueOf(str.toString())*/;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < numbersCount; i++) {
            int numbersItem = Integer.parseInt(bufferedReader.readLine().trim());
            numbers.add(numbersItem);
        }

        int result = Result.countNonUnique(numbers);
        
        System.out.println("re:::  "+result);

      //  bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
