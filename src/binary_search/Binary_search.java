/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_search;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bhatd
 */
public class Binary_search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int c, first, last, middle, n, search, array[];
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter " + n + " integers");


        for (c = 0; c < n; c++)
          array[c] = in.nextInt();

        System.out.println("Enter value to find");
        search = in.nextInt();

        first  = 0;
        last   = n - 1;
        middle = (first + last)/2;
 
        while( first <= last )
        {
          if ( array[middle] < search )
            first = middle + 1;    
          else if ( array[middle] == search )
          {
            System.out.println(search + " found at location " + (middle + 1) + ".");
            break;
          }
          else
             last = middle - 1;

          middle = (first + last)/2;
        }
        if (first > last)
           System.out.println(search + " isn't present in the list.\n");
		} 
    
    
}
