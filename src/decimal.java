import java.util.Scanner;

public class decimal {
    Scanner ingreso = new Scanner(System.in);
    double real, decimal;
    int realEnt;

    public void partereal() {


        System.out.print("Ingresa un nro. real: ");
        real = ingreso.nextDouble();
        realEnt = (int)real;
        decimal = real - realEnt;

        System.out.printf("La parte decimal es: %f\n", decimal);

    }
}



