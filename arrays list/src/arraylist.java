//Un cajero escanea un producto con el código de barras 770123. El sistema tiene un arreglo desordenado con los códigos de los productos disponibles en la estantería actual.
//El Problema: Debes recorrer la lista para verificar si el producto existe y en qué posición de la estantería se encuentra.
//Algoritmo a usar: Búsqueda Lineal. Es el ideal porque los productos en la estantería no tienen un orden numérico específico.

public class arraylist {

    public static String busquedaLineal(int[] estanteria, int codigoBuscado) {
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] == codigoBuscado) {
                return "Producto encontrado en la posición " + i;
            }
        }
        return "Producto no encontrado en la estantería";
    }

    public static void main(String[] args) {
        // Ejemplo de arreglo desordenado con códigos de productos
        int[] estanteria = {123456, 555666, 770123, 888999, 444555};

        int codigo = 770123; // Código que escanea el cajero

        // Llamada al método de búsqueda
        String resultado = busquedaLineal(estanteria, codigo);

        // Mostrar resultado
        System.out.println(resultado);
    }
}
