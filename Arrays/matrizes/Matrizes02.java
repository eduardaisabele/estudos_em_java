package Arrays.matrizes;

public class Matrizes02 {
    public static void main(String[] args) {
        double[][] notasAlunos1 = {{7,8,9,10}, {8,6,7,10}};
        for (int i = 0; i < notasAlunos1.length; i++) {
            for (int j = 0; j < notasAlunos1[i].length; j++) {
                System.out.println(notasAlunos1[i][j]);
            }
            System.out.println();
        }
    }
}
