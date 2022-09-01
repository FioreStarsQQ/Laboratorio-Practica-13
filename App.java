public class App {

    public static void main(String[] args) {
        final int COLUMNA = 17;
        final int FILA = 17;
        siguiente: 
        for (int f = 1; f <= FILA; f++) {
            System.out.println();
            for (int c = 1; c <= COLUMNA; c++) {
                if (c > f)
                    continue siguiente;
                System.out.print('*');
            }
        }
    }
}