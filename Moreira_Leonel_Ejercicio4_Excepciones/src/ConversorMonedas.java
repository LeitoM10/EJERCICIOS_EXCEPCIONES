public class ConversorMonedas {

    public static double convertir(String monedaOrigen, String monedaDestino, double cantidad)
            throws MonedaNoSoportadaException {

        monedaOrigen = monedaOrigen.toUpperCase();
        monedaDestino = monedaDestino.toUpperCase();

        if (!(monedaOrigen.equals("USD") || monedaOrigen.equals("EUR")) ||
                !(monedaDestino.equals("USD") || monedaDestino.equals("EUR"))) {

            throw new MonedaNoSoportadaException(
                    "Moneda no soportada. Solo se permiten USD y EUR."
            );
        }

        double tasa = 0;

        if (monedaOrigen.equals("USD") && monedaDestino.equals("EUR")) {
            tasa = 0.92;
        } else if (monedaOrigen.equals("EUR") && monedaDestino.equals("USD")) {
            tasa = 1.09;
        } else {
            tasa = 1;
        }

        return cantidad * tasa;
    }
}
