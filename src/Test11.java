public class Test11 {
    public static void main(String[] args) {
        int segundos = 60;
        int minutos = 60;
        int horas = 24;

        segundos++;

        if (segundos >= 60) {
            segundos = 0;
            minutos++;
        }

        if (minutos >= 60) {
            minutos = 0;
            horas++;
        }

        if (horas >= 24) {
            horas = 0;
        }

        System.out.println(horas);
        System.out.println(minutos);
        System.out.println(segundos);
    }
}
