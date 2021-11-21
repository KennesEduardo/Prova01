package EX2;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) throws Exception{
        
        Scanner leitor  = new Scanner(System.in);
        double [][] matriz = new double[5][5];
        double total = 0.0;
        double diagonalP = 0.0;
        int l = 0;
        int k = 0;
             

        for (int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j ++){
                System.out.println("Informe o valor: ");
                matriz[i][j] = leitor.nextInt();
                total = total + matriz[i][j];
            }
        }

        while(k < 5 && l < 5){            
            diagonalP = diagonalP + matriz[k][l];
            k++;
            l++;
        }
        
        double diagonalS = matriz[4][4]+matriz[3][3]+matriz[2][2]+matriz[1][1]+matriz[0][0];    
        double soma4 = total - diagonalP;
        double soma5 = (diagonalP + diagonalS) - +matriz[2][2];

        System.out.println("Diagonal principal: " + diagonalP);
        System.out.println("Diagonal secundaria: " + diagonalS);
        System.out.println("SOma das duas diagonais: "+ soma5);
        System.out.println("Somados restante valores: " + soma4);
            
    }
    
}