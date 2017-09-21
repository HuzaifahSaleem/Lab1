
import java.util.*;

public class Matrixes {

    public static void main(String[] args) {      //main class
        Matrix mat = new Matrix();               //two objects of matrixes with their unique names created
        Matrix mat1 = new Matrix();
        Map<String, Matrix> m = new HashMap<>(); //a hashmap for storing matrixes with their names
        m.put(mat.name,mat);
        m.put(mat1.name,mat);                 //two matrixes stored in a hashmap
        String equation;                                                     
        System.out.println("Enter The Equation using the matrixes (A+B): ");
        Scanner eq = new Scanner(System.in);               
        equation = eq.nextLine();                      //equation stored which is given by user
        String[] expr = equation.split("");           //equation splitted by empty character
        
       /*Keeping in mind the equations where Transpose can only taken for the first one
        Examples:
        A+B
        A-B
        A*B
        A^+B
        A^*B
        A^-B
        B+A
        B-A
        B*A
        B^+A
        B^-A
        B^*A
        There is no function yet for the inverse of the matrix.
        */
        
        if ((mat.name).equals(expr[0]))               //if A is the first matrix
        {
            if("^".equals(expr[1]))                               //if A^ is the first matrix
            { 
                if("+".equals(expr[2]))                             //does addition with B
                {
                    (mat.MatrixTranspose(mat)).MatrixAddition(mat1);           
                }
                else if("-".equals(expr[2]))                           //does multiplication with B
                {
                    (mat.MatrixTranspose(mat)).MatrixSubtraction(mat1);
                }
                else if("*".equals(expr[2]))                            //does multiplication with B
                {
                    mat.MatrixTimes(mat1);
                }
                else
                {
                    System.out.println("Cant Perform Operation on a single matrix");      
                }
            }
            else
            {
                 if("+".equals(expr[1]))                            //does A+B
                {
                    (mat).MatrixAddition(mat1);
                }
                else if("-".equals(expr[1]))                            //does A-B
                {
                    (mat).MatrixSubtraction(mat1);
                }
                else if("*".equals(expr[1]))                        //does A*B
                {
                    mat.MatrixTimes(mat1);
                }
                else
                {
                    System.out.println("Cant Perform Operation on a single matrix");
                }
            }
           
        }
        else if (expr[0].equals(mat1.name))                 //if B is the first matrix
        {
            if ("^".equals(expr[1]))                         //if B^ is the first matrix
            {
                if("+".equals(expr[2]))                     //does B^+A
                {
                    (mat1.MatrixTranspose(mat1)).MatrixAddition(mat);
                }
                else if("-".equals(expr[2]))                   //does B^-A
                {
                    (mat1.MatrixTranspose(mat1)).MatrixSubtraction(mat);
                }
                else if("*".equals(expr[2]))                    //does B^*A
                {
                    mat1.MatrixTimes(mat);
                }
                else
                {
                    System.out.println("Cant Perform Operation on a single matrix");
                }
            }
            else
            {
                if("+".equals(expr[1]))                            //does B+A
                {
                    (mat1.MatrixTranspose(mat1)).MatrixAddition(mat);
                }
                else if("-".equals(expr[1]))                        //does B-A
                {
                    (mat1.MatrixTranspose(mat1)).MatrixSubtraction(mat);
                }
                else if("*".equals(expr[1]))                            //does B*A
                {
                    mat1.MatrixTimes(mat);
                }
                else
                {
                    System.out.println("Cant Perform Operation on a single matrix");
                }
            }
        }
        else
        {
            System.out.println("Wrong Equation Entered");
        }
       
    }
}
