package LLD.SOLIDPrinciple;

interface InvoiceDao1{
    public void save(Invoice invoice);

}
class DatabaseInvoiceDao implements InvoiceDao1{
    @Override
    public void save(Invoice invoice){
        //save to DB
    }
}
class FileInvoiceDao implements InvoiceDao1{
    public void save(Invoice invoice){
        //save to file
    }
}
public class Open_ClosedPrinciple {
    //open for extension closed for modification

    public static void main(String[] args) {

    }
}
