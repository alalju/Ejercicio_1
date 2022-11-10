import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num=0,suma=0;
        int cont2 = 0,cont4=0,contVeces=0, anterior=0;

        Scanner scanner=new Scanner(System.in);


        while (suma<100){
            System.out.println("Ingres numero a sumar");
            procesar(scanner);
            num=scanner.nextInt();
            if ((cont2<=3 && num==2) || (cont4<=5 && num==4) || (contVeces<=9 && num==anterior)){
                suma=suma+num;
                System.out.println(suma);
                if(num==2){
                    cont2++;
                } else if (num==4) {
                    cont4++;
                } else if (contVeces==anterior){
                    contVeces++;
                }

            }else if (num!=2 || num!=4 || num!=anterior){
                suma=suma+num;
                System.out.println(suma);
            }else if((cont2==2 && num==2) || (cont4==4 && num==4) || (contVeces==8 && num==anterior)){
                if(num==2){
                    num=0;
                    suma=suma+num;
                } else if (num==4) {
                    num=0;
                    suma=suma+num;
                } else if (contVeces==anterior){
                    num=0;
                    suma=suma+num;
                }
            }
        }


    }
    public static void procesar(Scanner ec) {
        try {
            int num=ec.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("No es un numero entero");

        }
    }
}