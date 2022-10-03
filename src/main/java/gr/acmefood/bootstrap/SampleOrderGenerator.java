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

//        ORDER 1
        OrderItem item1 = OrderItem.builder()
                .productId(storeService.findById(1L).getProducts().get(0).getId())
                .quantity(1)
                .cost(storeService.findById(1L).getProducts().get(0).getPrice())
                .build();

        Order o1 = Order.builder()
                .account(accountService.get(1L))
                .paymentMethod(PaymentMethod.CASH)
                .selectedAddressId(accountService.get(1L).getAddressList().get(0).getId())
                .storeId(storeService.findById(1L).getId())
                .build();

        item1.setOrder(o1);
        o1.setOrderItems(List.of(item1));

        orderService.checkout(o1);

        //        ORDER 2
        OrderItem item2 = OrderItem.builder()
                .productId(storeService.findById(2L).getProducts().get(0).getId())
                .quantity(1)
                .cost(storeService.findById(2L).getProducts().get(0).getPrice())
                .build();

        Order o2 = Order.builder()
                .account(accountService.get(1L))
                .paymentMethod(PaymentMethod.CASH)
                .selectedAddressId(accountService.get(1L).getAddressList().get(0).getId())
                .storeId(storeService.findById(3L).getId())
                .build();

        item2.setOrder(o2);
        o2.setOrderItems(List.of(item2));

        orderService.checkout(o2);


        //        ORDER 3
        OrderItem item3 = OrderItem.builder()
                .productId(storeService.findById(3L).getProducts().get(0).getId())
                .quantity(1)
                .cost(storeService.findById(3L).getProducts().get(0).getPrice())
                .build();

        Order o3 = Order.builder()
                .account(accountService.get(3L))
                .paymentMethod(PaymentMethod.CASH)
                .selectedAddressId(accountService.get(1L).getAddressList().get(0).getId())
                .storeId(storeService.findById(3L).getId())
                .build();

        item3.setOrder(o3);
        o3.setOrderItems(List.of(item3));

        orderService.checkout(o3);


    }
}
