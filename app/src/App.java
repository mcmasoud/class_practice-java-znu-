public class App {
    public static void main(String[] args) throws Exception {
        // Product p1 = new Product("phone1",1000000.0);  //چون نمیشه از گلاس انتزاعی شی ایجاد کرد کامنت شدن
        // Product p2 = new Product("phone2",2000000.0);
        DigitalProduct dp3 = new DigitalProduct("phone2",2000000.0,128.0);

        // System.out.println("name of product1 : " + p1.get_name());
        // p1.displayInfo();
        System.out.println("count of products : "+Product.counter);
        System.out.println("size of product1 : " +((DigitalProduct)dp3).fileSize);
        // ((DigitalProduct)dp3).displayInfo();
        //
        dp3.displayInfo();


        //  یک ش ی از نوع PhysicalProduct بسازید و آن را به صورت Product نگه دارید (upcasting(
        Product p4 = new PhysicalProduct("phonepp1", 1000000.0, 12.0);
        p4.displayInfo();
        PhysicalProduct pp4 = (PhysicalProduct) p4;
        pp4.displayInfo();

        // array of objects
        System.out.println("________ final ________");
        Product[] arrayOfProduct = new Product[2];
        arrayOfProduct[0] = (Product) dp3;
        arrayOfProduct[1] = (Product) pp4;
        for(int i = 0; i<2;i++){
            arrayOfProduct[i].displayInfo();
        }
    }
}