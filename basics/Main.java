import java.util.Random;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
  public static void main(String[] args) {
    flipNHeads(1); 
      clock();

  }

  public static String pluralize(String word, int number) {
    if (number == 0 || number > 1){
      return word + "s";
    } else {
      return word; 
    }
  } 

//Flips a coin until n number of heads in a row, random number between 0 and 1, < 0.5 is tails
  public static void flipNHeads(int n){
    int flips = 0;
    int headsInARow = 0;
    Random random = new Random();

    while (headsInARow < n) {
      double flip = random.nextDouble();
      flips++;
      if (flip >= 0.5) {
        System.out.println("Heads");
        headsInARow++;
    } else {
        System.out.println("Tails");
        headsInARow = 0;
    }
    System.out.printf("It took %d flips to flip %d heads in a row.%n", flips, n);
  }
}


// public static void clock() {
//   LocalDateTime previousTime = null;
//   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

//   while (true) {
//       LocalDateTime currentTime = LocalDateTime.now();

//       if (previousTime == null || currentTime.isAfter(previousTime)) {
//           String formattedTime = currentTime.format(formatter);
//           System.out.println(formattedTime);
//           previousTime = currentTime;
//       }
//   }
// }

//Code Review solution below
public static void clock() {
  System.out.println("Enter Ctr+C to stop the counter.");
  String previousTime = "";

  while(true){
    LocalDateTime now = LocalDateTime.now();
    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    if(!time.equals(previousTime)){
      System.out.println(time);
      previousTime = time;
    }
  }
}

}
  

//ChatGPT Help