public static int func ( int x, int y ){
  return x+y;
}

----- main(){
  int [] arr = {1,2,3};
  System.out.println(func(5,7));
  arr = func2 (arr);
}

public static int [] func2 (int[]arr){
  for (int i = 0; i < arr.lenght ; i++ ){
    arr[i] = 2 * arr [i];
    return arr;
  }
}
