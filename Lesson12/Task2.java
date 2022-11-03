// Task 2

// Распечатать матрицу размером 5 х 5 символов, заполнив ее заглавными буквами в случайном порядке.
import java.util.Random;

public class Task2 {

  public static void main(String[] args) {
    // Random r = new Random();
    // char c = (char) (r.nextInt(26) + 'A');

    // char[][] arr = new char[5][5];
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // arr[i][j] = c;
    // }
    // }
    // for (char[] anArr : arr) {
    // for (char anAnArr : anArr) {
    // System.out.print(anAnArr + " ");
    // }
    // System.out.println();

    // }

    // }
    // }

    // Распечатать матрицу размером 5 х 5 символов, заполнив ее заглавными буквами в
    // случайном порядке.
    for (int i = 0; i < 5; i++) {
      Random rand = new Random();
      int rand1 = rand.nextInt(65, 90);
      char c = (char) rand1;

      for (int j = 0; j < 4; j++) {
        Random rand3 = new Random();
        int rand2 = rand.nextInt(65, 90);
        char z = (char) rand2;
        System.out.printf("%s ", z);
      }
      System.out.printf("%s\n", c);
    }

  }
}


// public class MainHW12Task2Matrix {

// 	public static void main(String[] args) {
		
// 		char letter = 0;
				
// 		for (int i = 0; i < 5; i++) {
// 			for (int j = 0; j < 5; j++) {
				
// 				letter = (char) ((int)(Math.random()*((90-65)+1))+65); // получаем рандомное число от 65 до 90 и приводим его к Чар
// 				System.out.printf("%c ", letter);			
				
// 			}
// 			System.out.printf("\n");
// 		}
			

// 	}

// }
