package kata;

public class KarateChop {

    public int chop(final int x, final int[] array) {

        int ini = 0;
        int fin = array.length - 1;

        if (fin == -1 || x < array[0] || x > array[fin]) {
            return -1;
        }

        while (true) {
            if (ini == fin) {
                return (x == array[ini]) ? ini : -1;
            } else if (x == array[ini + ((fin - ini) / 2)]) {
                return ini + (fin - ini) / 2;
            } else if (x > array[ini + ((fin - ini) / 2)]) {
                ini = ini + (fin - ini) / 2 + 1;
            } else {
                fin = fin - (fin - ini) / 2 - 1;
            }
        }
    }
}
