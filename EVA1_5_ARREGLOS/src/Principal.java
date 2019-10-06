
public class Principal {

    public static void main(String[] args) {
        int aiDatos[] = new int[10];
        System.out.println(aiDatos);
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("For normal");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println(aiDatos[i]);
        }
        System.out.println("For Each");
        for (int x : aiDatos) {
            System.out.println(x);
        }
    }
    
}
