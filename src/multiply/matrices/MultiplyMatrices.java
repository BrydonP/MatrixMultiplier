/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiply.matrices;

/**
 *
 * @author Brydon
 */
public class MultiplyMatrices{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here

        int[][] a
                = {
                    {1, 2, 3},
                    {3, 6, 2},
                    {2, 4, 3}};

        int[][] b
                = {
                    {0, 2, 1},
                    {3, 2, 4},
                    {2, 1, 1}};

        int[][] c = new int[3][3];

        int sum = 0;

        for(int k = 0; k < a[0].length; k++){
            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < b[i].length; j++){
                    sum += (a[k][j] * b[j][i]);
                    if(j == b[i].length - 1){
                        c[k][i] = sum;
                    }
                }
                sum = 0;
            }
        }

        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[i].length; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

}
