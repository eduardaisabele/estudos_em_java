package exercicios.curso_loiane.exercicios19;

public class Exercicio03 {
    public static void main(String[] args) {
        
        int[] vetorA = new int[]{10,15,1,2,3,4,5,6,7,8,9,2,6,9,7};
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}
