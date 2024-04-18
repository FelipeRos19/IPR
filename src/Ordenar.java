public class Ordenar {
    public static void main(String[] args) {
        int n1 = 13;
        int n2 = 4;
        int n3 = 5;

        if (n1 > n2) {
            int aux = n2;
            n2 = n1;
            n1 = aux;
        }

        if (n2 > n3) {
            int aux = n3;
            n3 = n2;
            n2 = aux;
        }

        if (n1 > n2) {
            int aux = n2;
            n2 = n1;
            n1 = aux;
        }

        System.out.println("Ordem: ");
        System.out.println("N1: " + n1);
        System.out.println("N2: " + n2);
        System.out.println("N3: " + n3);
    }
}
