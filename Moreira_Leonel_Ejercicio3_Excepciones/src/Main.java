public class Main {
    public static void main(String[] args) {

        System.out.println("=== PARTE A: Conversión Implícita ===");

        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println("\n=== PARTE B: Casting Explícito ===");

        double valor = 45.89;

        float f2 = (float) valor;
        int i2 = (int) valor;
        short s2 = (short) valor;
        byte b2 = (byte) valor;

        System.out.println("double: " + valor);
        System.out.println("float: " + f2);
        System.out.println("int: " + i2);
        System.out.println("short: " + s2);
        System.out.println("byte: " + b2);

        System.out.println("\n=== PARTE C: Conversión con Strings ===");

        String strInt = "2024";
        String strDouble = "98.6";
        String strBool = "false";

        int numInt = Integer.parseInt(strInt);
        double numDouble = Double.parseDouble(strDouble);
        boolean numBool = Boolean.parseBoolean(strBool);

        System.out.println("int: " + numInt);
        System.out.println("double: " + numDouble);
        System.out.println("boolean: " + numBool);

        String s1 = String.valueOf(numInt);
        String s2_str = Double.toString(numDouble);
        String s3 = numBool + "";

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2_str);
        System.out.println("String 3: " + s3);


        System.out.println("\n=== PARTE D: Casting de Objetos ===");

        Animal animal = new Perro();

        animal.hacerSonido();

        if (animal instanceof Perro) {
            Perro perro = (Perro) animal; 
            perro.ladrar();
        }
    }
}
