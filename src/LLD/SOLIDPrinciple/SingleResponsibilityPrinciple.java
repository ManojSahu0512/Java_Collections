package LLD.SOLIDPrinciple;
class Marker{
    String name;
    String color;
    int price;
    int year;

    public Marker(String name, String color, int price, int year) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }
}
class Invoice{
    private  Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        //Reason 1: here I can change when JST comes
        int price=(marker.price)*quantity;
        return price;
    }
    public void printInvoice(){
        //print the  invoice

    }
    public void saveToDB(){
        //save the data into db
        //Reason 2: Here I can change when I want to store in file
    }
}

class InvoiceDao{
    Invoice invoice;
    public InvoiceDao(Invoice invoice){
        this.invoice=invoice;
    }
}
class InvoicePrinter{
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }
    public void print(){
        //print the invoice
    }
}
public class SingleResponsibilityPrinciple {
    //A class should have one reason to change

    public static void main(String[] args) {

    }
}
