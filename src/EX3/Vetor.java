package EX3;

import javax.swing.JOptionPane;

public class Vetor {
    
    public static void main(String args[]) {

        String resultado="Valores que repetiram:\n ";
        int indice;
        int[] vetor = new int[10];
        int resultado2;
        
        for(int i=0;i<10;i++) {
        vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º valor:"));
        }
        
        for (int i=0;i<10;i++) {
            resultado2=vetor[i];
            indice=i;
            for (int o=0;o<10;o++) {
                if(vetor[o]==resultado2 && indice != o) {
                    resultado+=resultado2+"\n";
                }
            }    
        }
        System.out.println(resultado);
    }
    
}