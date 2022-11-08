import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /* Version with user input */
        int[][] firstMatrix = new int [2][2];
        int[][] secondMatrix = new int [2][2];
        int[][] additionMatrix = new int [2][2];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first matrix Data ");
        for (int i = 0; i < 2; i++) //rows
        {
            for (int j = 0; j < 2; j++) //columns
            {
                firstMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter second matrix Data ");
        for (int i = 0; i < 2; i++) //rows
        {
            for (int j = 0; j < 2; j++) //columns
            {
                secondMatrix[i][j] = scanner.nextInt();
            }
        }

        // prints first matrix
        System.out.print("First Matrix \n");
        for (int i = 0; i < 2; i++) //rows
        {
            for (int j = 0; j < 2; j++) //columns
            {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println("\n");
        }

        // prints second matrix
        System.out.print("Second Matrix \n");
        for (int i = 0; i < 2; i++) //rows
        {
            for (int j = 0; j < 2; j++) //columns
            {
                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println("\n");
        }

        // prints result of the addition
        System.out.print("Sum of two Matrices \n");
        for (int i = 0; i < 2; i++) //rows
        {
            for (int j = 0; j < 2; j++) //columns
            {
                additionMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                System.out.print(additionMatrix[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}