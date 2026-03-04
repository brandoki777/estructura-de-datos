

///Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su número de cédula o ID.
//El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus datos de la manera más rápida posible (en pocos pasos).
//Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, este algoritmo permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso.
//public class ejercicio2 {

    public static String busquedaBinaria(int[] clientes, int idBuscado) {
        int inicio = 0;
        int fin = clientes.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (clientes[medio] == idBuscado) {
                return "Cliente encontrado en la posición " + medio;
            } else if (clientes[medio] < idBuscado) {
                inicio = medio + 1; 
            } else {
                fin = medio - 1; 
            }
        }
        return "Cliente no encontrado en la lista";
    }

    public static void main(String[] args) {
        
        int[] clientes = {1001, 1010, 1025, 1030, 1050, 1100, 1200};

        int idBuscado = 1050; 

        
        String resultado = busquedaBinaria(clientes, idBuscado);

        
        System.out.println(resultado);
    }
