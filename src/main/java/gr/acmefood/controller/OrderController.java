package gr.acmefood.controller;

import gr.acmefood.domain.*;
import gr.acmefood.service.BaseService;
import gr.acmefood.service.OrderService;
import gr.acmefood.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(params = "allPlacedOrders")
    public ResponseEntity<ApiResponse<List<Order>>> retrieveAllPlacedOrders(@RequestParam String email) {
        List<Order> retrievingAllPlacedOrders = orderService.retrieveAllPlacedOrders(email);
        logger.info(String.valueOf(orderService));
        if (retrievingAllPlacedOrders == null) {
            throw new NoSuchElementException("Placed orders not found");
        }
        return ResponseEntity.ok(ApiResponse.<List<Order>>builder().data(retrievingAllPlacedOrders).build());
    }
}
