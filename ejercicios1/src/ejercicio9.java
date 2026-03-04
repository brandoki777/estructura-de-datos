package ejercicios1.src;

public class ejercicio9 {
    public static void main(String[] args) {
        double [] docente ={1.5,2.5,3.8,4.9};
        double [] Coordinador=docente;
        
        System.out.println("NOTAS DEL PROFESOR");
        for (int i = 0; i< docente.length; i++) {
            System.out.println("Estudiante: "+i+" Notas del profesor "+docente[i]);
        }
        Coordinador[1]=3.0;
        System.out.println("NOTAS DEL COORDINADOR");
        for (int i = 0; i< Coordinador.length; i++) {
            System.out.println("Estudiante: "+i+" Notas del coordinador "+Coordinador[i]);
       
        }
    }
}