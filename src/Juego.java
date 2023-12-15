import java.util.Random;
import java.util.Scanner;

public class Juego {


    Scanner sc = new Scanner(System.in);
    float nombre = sc.nextFloat();

    int intentosMax=2;
    int rondas=10;
    /**
     * iniciamos la ronda 1
     */
    do while(rondas>0){
        int numero=Math.random()*10 + 1;
        int intentos=0;
        /**
         * inicio del primer intento
         */
        do while(intentos<2){
            System.out.println("Introduzca su respuesta");

            int respuesta=sc.nextInt();
            if (respuesta=numero)
            /**
             * respuesta correcta
             */
                System.out.println("Correcto,lo hiciste en "+rondas+"rondas y ");
                 System.out.println("Introduzca su alias");
                 float alias = sc.nextFloat();
                 int record= intentos
                         float aliasRecord= alias + record;
             else if (respuesta!=numero)
            /**
             * respuesta incorrecta
             */
                intentos ++
            System.out.println("Introduzca su respuesta");

            int respuesta=sc.nextInt();

     rondas-1
    }


}

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public float getNombre() {
        return nombre;
    }

    public void setNombre(float nombre) {
        this.nombre = nombre;
    }

    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }
