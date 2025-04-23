public abstract class Product implements IDiscountable{
    public static int counter;
    private String name;
    private double price;

    public Product(String name, Double price){    //singleton?
        this.name = name;
        this.price = price;
        Product.counter ++;  
    }

    public Product(String name){
        this.name = name;
        this.price = 0.0;
    }

    public void set_name(String username){
        this.name = username;
    }

    public String get_name(){
        return this.name;
    }

    public void set_price(Double userPrice){
        this.price = userPrice;
    }

    public Double get_price(){
        return this.price;
    }

    // ---------------------------------------------

    public static void get_count(){
        System.out.println(Product.counter);
    }

    @Override
    public void apply_discount(int percent){
        System.out.println(this.price - (this.price * percent));
    }

    // @Override
    public abstract void displayInfo();
}