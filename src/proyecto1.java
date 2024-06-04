import java.util.Scanner;

public class proyecto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int numEstudiantes = scanner.nextInt();
        int numeros[],Grado[],Edada[],estu1[],estud2[];
        numeros = new int[5];
         Grado=new int[5];
         Edada= new int[10];
         estu1 = new int[5];
         estud2 = new int[5];

        System.out.println("\ndigite el grado:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese el grado del estudiante " + (i + 1) + ": ");
            Grado[i] = scanner.nextInt();

        }
        System.out.println("\ndigite la edad:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese la edad del estudiante " + (i + 1) + ": ");
            Edada[i] = scanner.nextInt();

        }
        int promedioMayores =0;
        int sumaMayores = 0;
        int contMayores = 0;
        int totalmayores=0;
        int contcinco=0;
        for (float edad : numeros) {
            if (edad > 5) {
                sumaMayores += edad;
                contMayores++;
            }
        }
       if  (contMayores-contcinco>0){
        promedioMayores = totalmayores/contMayores-contcinco;
        }
        int mediaMenores =0;
        int sumaMenores = 0;
        int contMenores = 0;
        for (int edad : numeros) {
            if (edad <= 5) {
                sumaMenores +=edad;
                contMenores++;
            }
        }
        if  (mediaMenores-contcinco>0){
            mediaMenores = totalmayores/contMayores-contcinco;
        }
        int cantidadCinco = 0;
        for (int edad : numeros) {
            if ( edad==5) {
                 cantidadCinco++;
            }
        }
        int h = 0;
        for (int i = 0; i < Grado[i]; i++) {
           estu1 [h] = Grado[i];
        }
        int j = 0;
        for (int i = 0; i < Edada[i]; i++) {
            estud2 [j] = Edada[i];
        }

        System.out.println("edad" +Edada[j] + "grado"+Grado[h]);
        System.out.println("El promedio de edad de los estudiantes mayores a 5 años es: " + promedioMayores);
        System.out.println("***********************************************************************************");
        System.out.println("La media de edad de los estudiantes menores a 5 años es: " + mediaMenores);
        System.out.println("***********************************************************************************");
        System.out.println("La cantidad de estudiantes que tienen 5 años exactamente es: " + cantidadCinco);
        System.out.println("**********************************************************************************");


    }
    //float mediaMenores = 0;
    //        if (contMenores > 0) {
    //            mediaMenores = sumaMenores / contMenores;
}

