public class Main {

    public static void main(String[] args) {


        Datos dato1 = Datos.getInstance();
        Datos dato2 = Datos.getInstance();

        dato2.setNumero(5);

        System.out.println(dato1.getNumero());
        System.out.println(dato2.getNumero());
    }
}
