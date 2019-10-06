
public class Principal {

    public static void main(String[] args) {
        int aiMatriz[][] = new int[3][5];
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                aiMatriz[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                System.out.print("[" + aiMatriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
