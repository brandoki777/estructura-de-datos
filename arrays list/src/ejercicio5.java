public class ejercicio5 {
    public static void main(String[] args) {
        double[] notas = {3.0, 4.0, 3.0, 4.0, 3.6, 2.0, 3.5, 4.7, 1.0, 3.2,
                          4.2, 5.0, 2.3, 4.0, 2.1, 2.0, 3.9, 3.3, 2.5, 4.0,
                          3.6, 4.9, 5.0, 2.6, 3.8, 4.2, 5.0, 3.4, 4.7, 5.0};

        int contador = 0; 

    
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == 5.0) {
                contador++;
            }
        }

        System.out.println("Número de estudiantes con nota 5.0: " + contador);
    }
}
