

///Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su número de cédula o ID.
//El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus datos de la manera más rápida posible (en pocos pasos).
//Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, este algoritmo permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso.
//public class ejercicio2 {

    public static String busqueda_Binaria(int[] clientes, int id) {
        int inicio = 0;
        int fin = clientes.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (clientes[medio] == id) {
                return " EL cliente ha sido encontrado en la posición N° " + medio;
            } else if (clientes[medio] < id) {
                inicio = medio + 1; 
            } else {
                fin = medio - 1; 
            }
        }
        return "Cliente no se ha encontrado";
    }

    public static void main(String[] args) {
        
        int[] clientes = {1001, 1010, 1025, 1030, 1050, 1100, 1200};

        int id = 1050; 

        
        String resultado = busqueda_Binaria(clientes, id);

        
        System.out.println(resultado);
    }
