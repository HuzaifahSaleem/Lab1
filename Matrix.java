
import java.util.*;


public class Matrix {               /*A class Matrix which creates an object with a name and a matrix*/

     String name;
     int rownum;
     int colnum;
     int[][] data = new int[10][10];

    public Matrix() {        //Constructor which calls the two setter functions
        Setname();
        SetData();
    }

    public final void Setname() {                 //Setter function which sets the name for the matrix
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the matrix: ");
        name = in.next();
    }

    public final void SetData() {                      //setter function which sets the values of the matrix
        Scanner in1 = new Scanner(System.in);
        System.out.println("Enter the no. of rows in the matrix: ");
        rownum = in1.nextInt();
        System.out.println("Enter the no. of cols in the Matrix: ");
        colnum = in1.nextInt();
        Random rand = new Random();
        for (int i = 0; i < rownum; i++) {
            for (int j = 0; j < colnum; j++) {
                data[i][j] = rand.nextInt(5) + 1;
            }
        }
        System.out.println("Matrix " + name);
        for(int i=0;i<rownum;i++)
          {
              for(int j=0; j<colnum;j++)
              {
                  System.out.printf("%d \t", data[i][j]);
              }
              System.out.println("\n");
          }
    }
     public final void MatrixAddition(Matrix B) //function to do addition
    {
         int[][] C = new int[this.rownum][this.colnum];
          for (int i=0; i<this.rownum;i++)
          {
              for(int j=0; j<this.colnum; j++)
              {
                  C[i][j]=this.data[i][j]+B.data[i][j];
              }
          }
      
         
          System.out.println("This is the sum of matrixes: ");
          for(int i=0;i<this.rownum;i++)
          {
              for(int j=0; j<this.colnum;j++)
              {
                  System.out.printf("%d \t",C[i][j]);
              }
              System.out.println("\n");
          }
      
      
    }
    
     public void MatrixSubtraction(Matrix B) //function to do Subtraction
    {
     int[][] C = new int[this.rownum][this.colnum];
          for (int i=0; i<this.rownum;i++)
          {
              for(int j=0; j<this.colnum; j++)
              {
                  C[i][j]=this.data[i][j]+B.data[i][j];
              }
          }
      
         
          System.out.println("This is the difference of Matrixes: ");
          for(int i=0;i<this.rownum;i++)
          {
              for(int j=0; j<this.colnum;j++)
              {
                  System.out.printf("%d \t",C[i][j]);
              }
              System.out.println("\n");
          }
    }
    public Matrix MatrixTranspose(Matrix A){       //function to take transpose of the matrix
    Matrix transposedMatrix = new Matrix();
    for (int i=0;i<transposedMatrix.rownum;i++) {
        for (int j=0;j<transposedMatrix.colnum;j++) {
            transposedMatrix.data[i][j] = A.data[j][i];
        }
    }
    System.out.println("This is the transpose of Matrix: " + A.name);
    for(int i=0;i<transposedMatrix.rownum;i++)
          {
              for(int j=0; j<transposedMatrix.colnum;j++)
              {
                  System.out.printf("%d \t",transposedMatrix.data[i][j]);
              }
              System.out.println("\n");
          }
    return transposedMatrix;
    

    }
        
    public void MatrixTimes(Matrix B) {               //function for the matrix multiplication
        int[][] sum = new int[this.rownum][this.colnum];
        if (this.rownum != B.colnum ) throw new RuntimeException("Illegal matrix dimensions.");
        for (int i = 0; i < this.rownum; i++)
            for (int j = 0; j < this.colnum; j++)
                for (int k = 0; k < this.rownum; k++)
                    sum[i][j] += (this.data[i][k] * B.data[k][j]);
        System.out.println("This is the product of Matrix: " + (this.name) + "&" + (B.name));
    for(int i=0;i<this.rownum;i++)
          {
              for(int j=0; j<this.colnum;j++)
              {
                  System.out.printf("%d \t",sum[i][j]);
              }
              System.out.println("\n");
          }
    }
     
    
    
}
