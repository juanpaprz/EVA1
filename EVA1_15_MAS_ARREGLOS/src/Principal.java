
public class Principal {

    public static void main(String[] args) {
        int iNume = 10;
        System.out.println("Valor = " + iNume);
        incremento(iNume);
        System.out.println("Valor = " + iNume);
        Prueba obj = new Prueba();
        obj.iVal = 10;
        System.out.println("Valor = " + obj.iVal);
        incrementoObj(obj);
        System.out.println("Valor = " + obj.iVal);
        
    }
    
    public static void incremento(int iVal){
        iVal++;
    }
    
    public static void incrementoObj(Prueba obj){
        obj.iVal++;
    }
    
}

class Prueba{
    int iVal;
}
