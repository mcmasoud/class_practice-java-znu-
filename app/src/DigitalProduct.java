public class DigitalProduct extends Product {

    public Double fileSize;

    public DigitalProduct(String name, Double price,Double fileSize){
        super(name,price);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo(){
        System.out.println("name : "+this.get_name() + " price : "+this.get_price()+ " file size : "+ this.fileSize );
    }
}