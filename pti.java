import java.util.Scanner;

public class pti{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      
    
        System.out.println("Qual é a quantidade de elementos desejada?");
        int elementos = input.nextInt();
        
        int [] vetor = new int[elementos];
        
        for(int i=0; i<elementos; i++){ 
            vetor[i] = (int)Math.round((Math.random()*20)-3);
            System.out.println("\n"+ vetor[i]+"\n");
        } 
        System.out.println(crescente(vetor));
        System.out.println(maiorDiferenca(vetor));
    }

    
    public static boolean crescente(int vetor[]){
        for (int i=1; i<vetor.length; i++){
            if(vetor[i] < vetor[i-1]){
                return false;
            }
        
        }
        return true;
    }

    public static int maiorDiferenca(int vetor[]){
        int maior = vetor[0];
        int menor = vetor[0];

        for (int i=1; i<vetor.length; i++){
            if(vetor[i]>maior){
                maior = vetor[i];
            }    
            if(vetor[i]<menor){
                menor = vetor[i];
            }
        
        }
		return maior - menor;

    }
}
