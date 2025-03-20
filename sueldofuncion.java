import java.util.Scanner;

/*Un vendedor recibe un sueldo base, más un 10% extra por comisiones de sus ventas. El vendedor
desea saber cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realizó en
el mes y el total que recibirá tomando en cuenta su sueldo base y sus comisiones. */

public class sueldofuncion {

    public static int comisiones(int venta1 , int venta2 , int venta3 ){
        int totalventas = venta1 + venta2 + venta3;
        int sueldo_base = 1400000;
        
        return ((totalventas *10)/100) + sueldo_base;

    }

    public static void main(String[] args) {
        
    
       int sueldo_total;
        int v1 , v2 , v3;
        

        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de la venta 1 :");
        v1 = entrada.nextInt();

        System.out.println("Ingrese el valor de la venta 2 :");
        v2 = entrada.nextInt();

        System.out.println("Ingrese el valor de la venta 3 :");
        v3 = entrada.nextInt();
        
       
        sueldo_total = comisiones(v1, v2, v3);
        


        System.out.println("Generas una total en sueldo y 1 comision por ventas de:" + comisiones(v1, v2, v3));



         
    }
}
