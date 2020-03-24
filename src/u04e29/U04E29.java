
package u04e29;

import java.util.Scanner;
public class U04E29 {
    public static void main(String args[]) {
        Scanner entrada=new Scanner(System.in);
        int num1, num2;
        String a="Ingrese el", b=" numero: ";
        do{
            System.out.print(a+" primer"+b);
            num1=entrada.nextInt();
            System.out.print(a+" segundo"+b);
            num2=entrada.nextInt();
                if(((num1)!=0)&&((num2)!=0)){
                     System.out.println("La suma de ambos numeros es "+(num1+num2));
                }
        }while(num1!=0&&num2!=0);
        System.out.print("El programa finalizo");
    }
}