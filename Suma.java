public class Suma {

    public static int sumarConBucle(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Suma con bucle de los primeros " + n + " números: " + sumarConBucle(n));
    }
}
