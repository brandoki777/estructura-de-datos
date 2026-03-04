package ejercicios1.src;

public class ejercicio7 {
    public static void main(String[] args) {
        int [] Almacen = {10,25,32,48,51};
        int [] Reportes= Almacen;
        Reportes[2] = Reportes[2] - 10;
        System.out.println("Stock desde stockAlmacen:");
        for (int i = 0; i < Almacen.length; i++) {
            System.out.println("Producto " + i + ": " + Almacen[i]);
        }
        System.out.println("\nStock desde stockReportes:");
        for (int i = 0; i < Reportes.length; i++) {
            System.out.println("Producto " + i + ": " + Reportes[i]);
        }

    }
    
}