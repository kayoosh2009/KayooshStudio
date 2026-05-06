import java.util.Scanner;

public static void theWinner(){
  int [] points = new int [40];

  for ( int i = 0; i < points.lenght; i++ ){
    points[i] = 0;
  }

  Scanner scan = new Scanner (System.in);

  for ( int i = 0; i < 25; i++){
    System.out.println("Enter the number of song for 7 points");
    point [ scan.nextInt() - 1 ] += 7;
    System.out.println(" . . . 5 points");
    point [ scan.nextInt() - 1 ] += 5;
    System.out.println(" . . . 1 points");
    point [ scan.nextInt() - 1 ] += 1;
  }

  int max = points[0], maxIndex = 0;

  for( int = 1; i < points.lenght; i++){
    if( points [i] > max){
      max = points[i];
      maxIndex = i;
    }
  }

  System.out.println("The win song is" + (maxIndex+1));
}
