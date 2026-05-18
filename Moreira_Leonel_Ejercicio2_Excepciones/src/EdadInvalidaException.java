public class EdadInvalidaException extends Exception {
    private int edadIngresada;

    public EdadInvalidaException(int edadIngresada) {
        super("Edad inválida: " + edadIngresada + ". Debe estar entre 0 y 120 años.");
        this.edadIngresada = edadIngresada;
    }

    public int getEdadIngresada() {
        return edadIngresada;
    }
}
