public class Principal {
    public static void main(String[] args) {

        try {
            Estudiante e1 = new Estudiante("Juan", 20, 8.5);
            e1.mostrarDatos();

            Estudiante e2 = new Estudiante("María", -5, 9.0); // edad inválida
            e2.mostrarDatos();

            Estudiante e3 = new Estudiante("Carlos", 25, 7.8);
            e3.mostrarDatos();

        } catch (EdadInvalidaException e) {
            System.out.println("Error al crear estudiante: " + e.getMessage());
        }
    }
}