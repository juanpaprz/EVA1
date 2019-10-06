
public class Principal {

    public static void main(String[] args) {
        int aiMatriz[][][][][] = new int[10][5][7][12][3];
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                for (int k = 0; k < aiMatriz[i][j].length; k++) {
                    for (int l = 0; l < aiMatriz[i][j][k].length; l++) {
                        for (int m = 0; m < aiMatriz[i][j][k][l].length; m++) {
                            aiMatriz[i][j][k][l][m] = (int) (Math.random() * 1000) + 1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                for (int k = 0; k < aiMatriz[i][j].length; k++) {
                    for (int l = 0; l < aiMatriz[i][j][k].length; l++) {
                        for (int m = 0; m < aiMatriz[i][j][k][l].length; m++) {
                            System.out.print("[" + aiMatriz[i][j][k][l][m] + "]");
                        }
                        System.out.println("");
                    }
                }
            }
        }
    }
    
}
