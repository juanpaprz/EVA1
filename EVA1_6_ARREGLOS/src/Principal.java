
public class Principal {

    public static void main(String[] args) {
        
        //DECLARACIÓN
        int aiDatos[],a, b;
        int[] aiDatos2, x, y;
        //
        int aiCopia[];
        //INICIACIÓN DEL ARREGLO
        aiDatos = new int[100];
        //LLENAR CON VALORES ALEATORIOS
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 100) + 1;
        }
        //SON OBJETOS
        //LA MEMORIA ES CONSECUTIVA
        //SON DE ACCESO ALEATORIO
        aiDatos[4] = 5000;
        aiDatos[69] = 500;
        //SON MUY RÁPIDOS
        //SON INMUTABLES
        
        
    }
    
}
