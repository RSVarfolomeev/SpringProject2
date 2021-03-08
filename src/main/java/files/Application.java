package files;

import files.product.Cart;
import files.product.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(ProductRepository.class, Cart.class);
        ProductRepository productList = context.getBean(ProductRepository.class);
        System.out.println(productList.getProductList());
        System.out.println(productList.getProductListById(2));
        Cart cart = context.getBean(Cart.class);
        cart.addProduct(1);
        cart.addProduct(2);
        cart.addProduct(3);
        System.out.println(cart.getCartList());
        cart.deleteCartListById(2);
        System.out.println(cart.getCartList());
    }

}