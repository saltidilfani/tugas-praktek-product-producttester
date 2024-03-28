/*
nama : salti dilfani
nim  : 2301093007
kelas: MI.1C
 */
package inventory_22032024;

/**
 *
 * @author SALTI DILFANI
 */
public class product {
    //private 
    private int itemnumber;
    private String name;
    private int quantityinstock;
    private double price;
          

public product()
{

}
public product (int number,String name,int qty,double price)
{
    this.itemnumber=number;
    this.name=name;
    this.quantityinstock=qty;
    this.price=price;
}
public int getitemNumber (){
    return itemnumber;
}
public void setitemNumber(int number){
    this.itemnumber=number;
}
public String getName(){
    return name;
}
public void setname(String name)
{
    this.name=name;
}
public int quantitystinstock()
{
     return quantityinstock;
}
public void setquantityinstock (int qty){
    this.quantityinstock=qty;
}
public double price()
{
    return price;
}
public void setprice(double price)
{
     this.price=price;
}
    @Override
    public String toString(){
    return "\n product code "+this.itemnumber+
           "\n product name "+this.name+
           "\n product stock"+this.quantityinstock+
           "\n product price"+this.price;
    }
}
