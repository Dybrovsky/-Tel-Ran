// Task 1

// Сделать дополнения к игре Sapper:
// - запрос размерности игрового поля

// - проверка вводимых значений координат на непревышение заданной размерности

// - запрос количества попыток, после достижения которых игра считается выигранной

// - предупреждение читерства (ввод одних и тех же координат)

import java.util.*;

public class Sapper {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rage ");
        int a, b, inputAttempt;
        a = scan.nextInt();
        b = scan.nextInt();

        System.out.println("Enter attempt ");
        inputAttempt = scan.nextInt();

        int[][] field = new int[a][b];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = (char) (Math.random() * 2);
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }

        int x = 0, y = 0;

        while (inputAttempt != 0) { // while attempt != 0 do that ->

            System.out.println(" Please enter x, y ");
            x = scan.nextInt();
            y = scan.nextInt();


            while (!(x <= a && y <= b)) { // while not in range do that ->

                System.out.println("Enter number in range ");
                System.out.println("Attempts  " + inputAttempt);
                x = scan.nextInt();
                y = scan.nextInt();

            }

            if (field[x][y] == 1) {
                
                System.out.println("Boom!!!");
                
                inputAttempt = 0;
            } else if (field[x][y] == 0){
                
                System.out.println("Try again!");
                field[x][y] = 2;
                inputAttempt--;
                System.out.println("Attempts  " + inputAttempt);
            } else if (field[x][y] == 2){
                System.out.println("3333");
        }
        System.out.println("End of the game");

        scan.close();
    }
}
