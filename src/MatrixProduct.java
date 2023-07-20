import java.util.Scanner;

public class MatrixProduct {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter row size");
        int row_size=scanner.nextInt();
        System.out.println("enter column size");
        int column_size=scanner.nextInt();
        int array[][]=new int[row_size][column_size];
        for(int i=0;i<row_size;i++)
        {
            for(int j=0;j<column_size;j++)
            {
                array[i][j]=scanner.nextInt();
            }
            System.out.println();
        }
        System.out.println("enter a number");
        int number=scanner.nextInt();
        findMatrixProduct(array,row_size,column_size,number);
        for(int i=0;i<row_size;i++)
        {
            for(int j=0;j<column_size;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void findMatrixProduct(int array[][],int row_size,int column_size,int number)
    {
        for(int i=0;i<row_size;i++)
        {
            for(int j=0;j<column_size;j++)
            {
                array[i][j]=array[i][j]*number;
            }
        }
    }
}
