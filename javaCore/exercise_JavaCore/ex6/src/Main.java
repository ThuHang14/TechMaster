public class Main {
    public static void main(String[] args) {
        productService service = new productService();
        Product[] products = service.forProduct(3);
        service.show(products);
    }
}
