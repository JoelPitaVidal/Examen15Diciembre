public class Datos {
    /**
     * puntuacion record
     */
    private int puntuacionRecord;
    /**
     *  nombre del que consiguio el record
     */
    private String aliasRecord;
    /**
     * rondas jugadas en la partida
     */
    private int rondasPartida;
    /**
     * ronda actual
     */
    private int rondaActual;
    /**
     * numero generado para adivinar
     */
    private int numero;
    /**
     * numero introduccido por el usuario
     */
    private int numeroAdivinado;
    /**
     * numero de intentos maximos
     */
    private int intentosMax;
    /**
     * contador de los intentos restantes
     */
    private int contadorIntentos;
    /**
     * numero de aciertos por partida
     */
    private int aciertos;
    /**
     * alias del jugador
     */
    private String alias;
    /**
     * numero de fallos
     */
    private int fallos;
    private Datos() {

    }

    static Datos dato = new Datos();
    public static Datos getInstance(){
        return dato;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }
    public void setNumeroAdivinado(int numeroAdivinado) {
        this.numeroAdivinado = numeroAdivinado;
    }
    public void setContadorIntentos(int contadorIntentos) {
        this.contadorIntentos = contadorIntentos;
    }
    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public int getNumero() {
        return numero;
    }
    public int getNumeroAdivinado() {
        return numeroAdivinado;
    }
    public int getIntentosMax() {
        return intentosMax;
    }
    public int getContadorIntentos() {
        return contadorIntentos;
    }
    public int getAciertos() {
        return aciertos;
    }
    public String getAlias() {
        return alias;
    }
    public int getFallos() {
        return fallos;
    }
}
