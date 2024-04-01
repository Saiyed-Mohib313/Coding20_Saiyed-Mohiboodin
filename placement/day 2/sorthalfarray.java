import java.util.Arrays;
import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class sorthalfarray {
    public static void main(String  args []){
        Scanner sc = new Scanner(System.in);
        
  System.out.println
  ("enter size of array :");
  int size = sc.nextInt();
  
int n1 = size%2==0 ? (size/2) : (size/2)+1;
int n2 = size-n1;
ArrayList<Integer> first = new ArrayList<>();
ArrayList<Integer> second = new ArrayList<>();
  System.out.println("enter the element :");

  for(int i=0 ; i<n1; i++){
      first.add(sc.nextInt());
  }
  for(int i =0;i<n2;i++){
    second.add(sc.nextInt());
  }
  Collections.sort(first);
  Collections.sort(second, Collections.reverseOrder());
  for (int i=0; i<n1;i++){
    System.out.print(first.get(i));
  }
  for(int i=0;i<n2;i++){
    System.out.print(second.get(i));
  }

    }
}


