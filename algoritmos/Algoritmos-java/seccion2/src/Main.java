public class Main {
    public static void main(String[] args) {


        int resultado =divAlg(25,2);
        float resultado2 =dividir(25,2);
        int resultado3 =factorial(5);
        boolean resultado4 = esPrimo(7);
        boolean resultado5 = esPerfecto(6);
        boolean resultado6 = esAmigo(220, 284);
        boolean resultado7 = esGuay(6);
        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println(resultado5);
        System.out.println(resultado6);
        System.out.println(resultado7);
    }

    public static int resta(int numero1, int numero2) {
        int resultado =0;

        for (int i = numero2; i<numero1; i++ ) {
            resultado++;
        }


        return resultado;
    }

    public static float dividir(float dividando, int dividor) {
        float resultado =0;

        while(dividando >= dividor) {
            resultado++;


            dividando = dividando - dividor;

        }
        return resultado;
    }

    public static int multiplicar(int multiplicando, int multiplicador) {
        int resultado =0;

        for (int i =0; i<multiplicador; i++ ) {
            resultado += multiplicando;
        }
        return resultado;
    }

    public static int divAlg(int a, int b) {
        int value = 0;
        int count = 0;
        do {
            count++;
            value += b;
        } while ((value + b) <= a);

        return count;
    }

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    public static boolean esPrimo(int a){
        for (int i = 2; i < a; i++) {
            if (a%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean esPerfecto(int a){
        int resultado = 0;
        for (int i = 1; i < a; i++) {
            if (a%i==0){
                resultado = resultado+i;
            }
        }
        return resultado == a ;
    }

    public  static boolean esAmigo(int a, int b){
        int divisoresA = 0;
        int divisoresB = 0;

        for (int i = 1; i < a; i++) {
            if (a%i==0){
                divisoresA = divisoresA+i;
            }
        }
        for (int i = 1; i < b; i++) {
            if (b%i==0){
                divisoresB = divisoresB+i;
            }
        }

        return divisoresA == b && divisoresB == a;
    }

    public static boolean esGuay(int a){
        int suma = 0;
        for (int i = 1; i < a; i++) {
            suma += i;
            if (suma == a) { return true; }
        }
        return false;
    }
}