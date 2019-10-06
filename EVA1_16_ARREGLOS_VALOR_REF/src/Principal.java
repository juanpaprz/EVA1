
public class Principal {

    public static void main(String[] args) {
        int aiArreglo[] = new int[10];
        System.out.println(aiArreglo);
        llenarArreglo(aiArreglo);
        madrearArreglo(aiArreglo);
        System.out.println(aiArreglo);
        imprimirArreglo(aiArreglo);
    }
    
    public static void llenarArreglo(int aiArray[]){
        for (int i = 0; i < aiArray.length; i++) {
            aiArray[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(aiArray);
    }
    
    public static void madrearArreglo(int aiArray[]){
        aiArray = new int[100];
        System.out.println(aiArray);
    }
    
    public static void imprimirArreglo(int aiArray[]){
        for (int i = 0; i < aiArray.length; i++) {
            System.out.print("[" + aiArray[i] + "]");
        }
        System.out.println("");
    }
    
}
