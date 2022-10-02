package gr.acmefood.bootstrap;

import gr.acmefood.base.BaseComponent;
import gr.acmefood.domain.*;
import gr.acmefood.service.AccountService;
import gr.acmefood.service.OrderService;
import gr.acmefood.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SampleOrderGenerator extends BaseComponent implements CommandLineRunner {

    private final OrderService orderService;
    private final AccountService accountService;
    private final StoreService storeService;

    @Override
    public void run(String... args) throws Exception {

        OrderItem item = OrderItem.builder()
                .productId(storeService.findById(1L).getProducts().get(0).getId())
                .quantity(1)
                .cost(storeService.findById(1L).getProducts().get(0).getPrice())
                .build();

        Order o1 = Order.builder()
                .account(accountService.get(1L))
                .paymentMethod(PaymentMethod.CASH)
                .build();

        item.setOrder(o1);
        o1.setOrderItems(List.of(item));

        orderService.checkout(o1);


    }
}
