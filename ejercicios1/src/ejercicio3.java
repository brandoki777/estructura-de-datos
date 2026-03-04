package ejercicios1.src;

public class ejercicio3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        double Temperatura = 81.0;
        String Sensor = "DH111";
        int numerolecturas = 5;
        boolean alarma = false;

        if (Temperatura>80){
            alarma = true;
        }
        System.out.println("-------------------Datos del sensor de temperatura-------------------" );
        System.out.println("Temperatura: " + Temperatura);
        System.out.println("Sensor: " + Sensor);
        System.out.println("Numero de lecturas: " + numerolecturas);
        System.out.println("Alarma activada: " + alarma);


    }

}