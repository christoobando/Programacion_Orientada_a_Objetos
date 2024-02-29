package ejercicio_resuelto_n4;
public class Ejercicio_resuelto_N4 {
    public static void main(String[] args) {
        int Edad_Juan, Edad_Alberto, Edad_Ana, Edad_Mama;
        Edad_Juan = 9;
        Edad_Alberto = 2*(Edad_Juan/3);
        Edad_Ana = 4*Edad_Juan/3;
        Edad_Mama = Edad_Juan + Edad_Alberto + Edad_Ana;
        System.out.println("Las edades son : ");
        System.out.println("Alberto : " + Edad_Alberto);
        System.out.println("Juan : " + Edad_Juan);
        System.out.println("Ana : " + Edad_Ana);
        System.out.println("Mamá : " + Edad_Mama);
    }
    
}
