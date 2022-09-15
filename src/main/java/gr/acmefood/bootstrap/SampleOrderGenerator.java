package gr.acmefood.bootstrap;

import gr.acmefood.base.BaseComponent;
import gr.acmefood.domain.Account;
import gr.acmefood.domain.Order;
import gr.acmefood.domain.PaymentMethod;
import gr.acmefood.domain.Product;
import gr.acmefood.service.AccountService;
import gr.acmefood.service.OrderService;
import gr.acmefood.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class SampleOrderGenerator extends BaseComponent implements CommandLineRunner {

    private final AccountService accountService;
    private final OrderService orderService;
    private final ProductService productService;

    @Override
    public void run(String... args) throws Exception {
        // Get all customers
//        accountService.findAll().forEach(a -> logger.info("{}", a));
//
//        // We don't mind if a "find" method returns a null
//        logger.info("Does Account" + " exist? {}." + "", (accountService.findByEmail("test@gmail.gr") != null));
//        logger.info("Does Account" + " exist? {}.", (accountService.findByEmail("vrailpmm@gmail.com") != null));
//
//        // Load Account and create an order by adding/updating/removing content before checking it out
//        Account firstAccount = accountService.findByEmail("vrailpmm@gmail.com");
//        Order firstOrder = orderService.startOrder(firstAccount);
//        logger.info("first order initiated : {}", firstOrder);
//
//        // Add item(s) both existing and non-existing
//        orderService.addItem(firstOrder, productService.findBySerial("SN11111100013121"), 2);
//        orderService.addItem(firstOrder, productService.findBySerial("SN11114100012"), 1);
//        orderService.addItem(firstOrder, productService.findBySerial("SN1111100013"), 1);
//        orderService.addItem(firstOrder, productService.findBySerial("SN1111100014"), 1);
//        // Update item(s)
//        orderService.addItem(firstOrder, productService.findBySerial("SN11111100013121"), 1);
//        orderService.updateItem(firstOrder, productService.findBySerial("SN1111100013"), 2);
//        // Remove item(s)
//        orderService.removeItem(firstOrder, productService.findBySerial("SN11111100013121"));
//        // Add some more item(s)
//        orderService.addItem(firstOrder, productService.findBySerial("SN11111100013121"), 2);
//        // Checkout order
//        orderService.checkout(firstOrder, PaymentMethod.CARD);
    }
}
