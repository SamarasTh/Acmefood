package gr.acmefood.controller;

import gr.acmefood.domain.*;
import gr.acmefood.service.BaseService;
import gr.acmefood.service.OrderService;
import gr.acmefood.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("allOrders")
    public ResponseEntity<ApiResponse<List<Order>>> retrieveAllPlacedOrders() {
        List<Order> retrievingAllPlacedOrders = orderService.findAll();
        logger.info(String.valueOf(orderService));
        if (retrievingAllPlacedOrders == null) {
            throw new NoSuchElementException("Placed orders not found");
        }
        return ResponseEntity.ok(ApiResponse.<List<Order>>builder().data(retrievingAllPlacedOrders).build());
    }

    @Override
    @PostMapping("checkout")
    public ResponseEntity<ApiResponse<Order>> create(@RequestBody Order order) {
        logger.info("{}", order);
        return ResponseEntity.ok(ApiResponse.<Order>builder().data(
                orderService.checkout(order)
        ).build());
    }
}
