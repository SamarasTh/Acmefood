package gr.acmefood.controller;

import gr.acmefood.domain.*;
import gr.acmefood.service.BaseService;
import gr.acmefood.service.OrderService;
import gr.acmefood.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequiredArgsConstructor
@RequestMapping("orders")

public class OrderController extends AbstractController<Order> {
    private final OrderService orderService;

    @Override
    public BaseService<Order> getBaseService() {
        return orderService;
    }

    @PostMapping("start")
    public ResponseEntity<ApiResponse<Order>> startOrder(@RequestBody Account account) {
        final Order startingOrder = orderService.startOrder(account);
        return ResponseEntity.ok(ApiResponse.<Order>builder().data(startingOrder).build());
    }

    @GetMapping(params = "submitDate")
    public ResponseEntity<ApiResponse<List<Order>>> findBySubmitDate(@RequestParam Date submitDate) {
        final List<Order> bySubmitDate = orderService.findBySubmitDate(submitDate);
        if (bySubmitDate == null) {
            throw new NoSuchElementException("Order not found");
        }
        return ResponseEntity.ok(ApiResponse.<List<Order>>builder().data(bySubmitDate).build());
    }

    @GetMapping("allOrders")
    public ResponseEntity<ApiResponse<List<Order>>> retrieveAllPlacedOrders() {
        List<Order> retrievingAllPlacedOrders = orderService.findAll();
        logger.info(String.valueOf(orderService));
        if (retrievingAllPlacedOrders == null) {
            throw new NoSuchElementException("Placed orders not found");
        }
        return ResponseEntity.ok(ApiResponse.<List<Order>>builder().data(retrievingAllPlacedOrders).build());
    }

//    @PutMapping
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void update (@Valid @RequestBody final List<OrderItem> orderItems) {getBaseService().update((Order) orderItems);}

//    @GetMapping(params = "addItemsInOrder")
//    public ResponseEntity<ApiResponse<List<OrderItem>>> addItemsInOrder(@RequestParam Order order,@RequestParam Product product, @RequestParam int quantity) {
//        List<OrderItem> addingItemsInOrder = orderService.addItem(order,product, quantity);
//        logger.info(String.valueOf(orderService));
//        if (addingItemsInOrder == null) {
//            throw new NoSuchElementException("Items not found");
//        }
//        return ResponseEntity.ok(ApiResponse.<List<OrderItem>>builder().data(addingItemsInOrder).build());
//    }
}
