package files.runner;

import files.product.Cart;
import files.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private Cart cart;

    public Runner(ProductRepository productRepository,
                  Cart cart) {
        this.productRepository = productRepository;
        this.cart = cart;
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String cmd = sc.nextLine();
            System.out.println(cmd);

            //Пример ввода: getProductList()
            if (cmd.equals("getProductList()")) {
                System.out.println(productRepository.getProductList());

                //Пример ввода: getProductListById(1)
            } else if (cmd.startsWith("getProductListById")) {
                String idString = cmd.replace("getProductListById", "");
                idString = idString.replace("(", "");
                idString = idString.replace(")", "");
                int id = Integer.parseInt(idString);
                System.out.println(productRepository.getProductListById(id));

                //Пример ввода: cart.getCartList()
            } else if (cmd.equals("cart.getCartList()")) {
                System.out.println(cart.getCartList());

                //Пример ввода: cart.addProduct(1)
            } else if (cmd.startsWith("cart.addProduct")) {
                String idString = cmd.replace("cart.addProduct", "");
                idString = idString.replace("(", "");
                idString = idString.replace(")", "");
                int id = Integer.parseInt(idString);
                cart.addProduct(id);
                System.out.println("Product №" + id + " добавлен.");

                //Пример ввода: cart.deleteCartListById(1)
            } else if (cmd.startsWith("cart.deleteCartListById")) {
                String idString = cmd.replace("cart.deleteCartListById", "");
                idString = idString.replace("(", "");
                idString = idString.replace(")", "");
                int id = Integer.parseInt(idString);
                cart.deleteCartListById(id);
                System.out.println("Product id=" + id + " удален.");
            }
        }
    }
}
