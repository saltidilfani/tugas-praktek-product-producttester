/*
nama : salti dilfani
nim  : 2301093007
kelas: MI.1C
 */
package inventory2_220032024;

import java.util.Scanner;

/**
 *
 * @author SALTI DILFANI
 */
public class producttester2 {
    public static void main (String[]args)
    {
        Scanner in=new Scanner(System.in);
        int tempnumber;
        String tempname;
        int tempqty;
        double tempprice;
        
        
        System.out.print("\n enter product code=");
        tempnumber=in.nextInt();
        in.nextLine();
        System.out.print("\n enter product name=");
        tempname=in.nextLine();
        System.out.print("\n enter product stock=");
        tempqty=in.nextInt();
        System.out.print("\n enter product price=");
        tempprice=in.nextDouble();
        
        product2 p1=new product2(tempnumber,tempname,tempqty,tempprice);
        
        System.out.print("\n enter product code=");
        tempnumber=in.nextInt();
        in.nextLine();
        System.out.print("\n enter product name=");
        tempname=in.nextLine();
        System.out.print("\n enter product stock=");
        tempqty=in.nextInt();
        System.out.print("\n enter product price=");
        tempprice=in.nextDouble();
        
        
        product2 p2=new product2(tempnumber,tempname,tempqty,tempprice);
         
        product2 p3= new product2(3,"Rinso 1.8kg",10,48500.00);
        product2 p4= new product2(4,"indomie ayam",15,4500.00);
        product2 p5= new product2(5,"sarimi isi 5",54,6000.00);
        product2 p6= new product2(6,"lifeboy 1kg",70,5500.00); 
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
    }
}
