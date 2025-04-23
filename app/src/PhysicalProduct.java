public class PhysicalProduct extends Product {
    public Double weight;

    public PhysicalProduct(String name, Double price,Double weight){
        super(name,price);
        this.weight = weight;
    }

    @Override
    public void displayInfo(){
        System.out.println("name : "+this.get_name() + " price : "+this.get_price()+ " file size : "+ this.weight);
    }
}