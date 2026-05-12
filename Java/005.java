public static int mofa(int[]arr){
  int count = 0;
  boolean flag = false
  for (int i = 0; i < arr.length && !flag; i++){
    while(arr[i] < 0){
      count++;
      i++
    }
    if(count != 0 ){
      flag = true;
    }
    return count;
  }
}

// - - - - - - - - - - - 

import java.util.Scanner;
public static void main (String [] Args){
  Scanner scan = new Scanner (System.in);
  int [] arr = new int [83];

  for(int i = 0; i < 672; i++){
    for( int j = 0; j < arr.length; j++){
      arr [j] = scan.nextInt();
    }
  }
}
  
