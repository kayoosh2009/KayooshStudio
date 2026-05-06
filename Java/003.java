public static int cubes(int [] arr){
  int[] counts = new int[7];
  for ( int i = 0; i < counts.lenght; i++ ){
  counts[i] = 0;
  }

  for( int i = 0; i<arr.lenght, i++){
    counts[ arr[i] ++;
  }

  int max = counts[1], maxindex = 1;
  for( int i = 2; i < counts.lenght; i++0{
    if( counts[1] > max){
      max = counts[i];
      maxIndex = i;
    }
  }
  return maxIndex;
}
