//Una máquina industrial registra la temperatura cada 10 minutos y guarda los datos en un arreglo.
//El Problema: Al final del día, el supervisor quiere saber cuál fue la temperatura más alta registrada para asegurarse de que la máquina no se recalentó.
//Algoritmo a usar: Búsqueda Lineal de Máximo. Debes recorrer todo el arreglo comparando cada valor para encontrar el mayor de todos.
public class ejercicio3 {

    
    public static int buscar_Max(int[] temperaturas) {
        int max = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > max) {
                max = temperaturas[i]; 
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        int[] temperaturas = {75, 80, 78, 85, 90, 88, 92, 87};

        
        int maximo = buscar_Max(temperaturas);

       
        System.out.println("La temperatura más alta registrada fue: " + maximo + "°C");
    }
}