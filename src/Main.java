import java.util.Scanner;

public class Main {
    public static void almacenarTemperaturas(double[] array, Scanner input) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Agrega la temperatura " + (i+1)+": ");
            array[i] = input.nextDouble();
            System.out.println();
        }
    }

    public static double promedio(double[] array) {
        double a = 0;
        for (double n : array) {
            a += n;
        }
        return a/array.length;
    }

    public static double maxValor(double[] array) {
        double max = 0;
        for (int i=0;i<array.length;i++) {
            if(i==0){
                max = array[i];
            }
            else if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double minValor(double[] array) {
        double min = 0;
        for (int i=0;i<array.length;i++) {
            if(i==0){
                min = array[i];
            }
            else if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void calurosos(double[] array){
            for (double n : array){
                if (n>=30) {
                    System.out.print(n);
                }
            }
    }

    public static void frios(double[] array){
            for (double n : array){
                if (n<27) {
                    System.out.print(n+" ");
                }
            }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] tempDiasSemana = new double[7];
        String opcion;
        boolean fin = false;
        almacenarTemperaturas(tempDiasSemana,input);

        while (!fin) {
            System.out.println("Registro de temperaturas" +
                    "\n mostrar - muestra todos los registros" +
                    "\n promedio - muestra el promedio" +
                    "\n maximo - muestra el dia mas caluroso" +
                    "\n minimo - muestra el dia mas frio" +
                    "\n frios - muestra los dias frios" +
                    "\n calurosos - muestra los dias calurosos" +
                    "\n escoje una opcion: ");
            opcion = input.next();
            switch (opcion.toLowerCase()) {
                case "promedio":
                    System.out.println("la temperatura promedio es: " + promedio(tempDiasSemana));
                    break;
                case "maximo":
                    System.out.println("la temperatura maxima es: " + maxValor(tempDiasSemana));
                    break;
                case "minimo":
                    System.out.println("la temperatura minima es: " + minValor(tempDiasSemana));
                    break;
                case "frios":
                    System.out.print("los dias mas frios fueron: ");
                    frios(tempDiasSemana);
                    System.out.println();
                    break;
                case "calurosos":
                    System.out.print("los dias mas calurosos fueron: ");
                    calurosos(tempDiasSemana);
                    System.out.println();
                    break;
                case "mostrar":
                    System.out.print("los dias registrados fueron: ");
                    for (double c: tempDiasSemana) {
                        System.out.print(c+" ");
                    }
                    System.out.println();
                    break;
                default :
                    System.out.println("entrada invalida");
                    break;
            }
            input.nextLine();
            System.out.print("quieres salir si/no (poner otra cosa significa no): ");
            opcion = input.next();
            if (opcion.toLowerCase().equals("si")){
                fin = true;
            }
        }
    }
}