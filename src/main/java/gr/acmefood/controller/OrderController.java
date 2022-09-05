package gr.acmefood.controller;

import gr.acmefood.domain.Account;
import gr.acmefood.domain.Order;
import gr.acmefood.domain.Product;
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

public class OrderController extends AbstractController<Order>{
    private final OrderService orderService;
    @Override
    public BaseService<Order> getBaseService() {return orderService;}

    @PostMapping
    public ResponseEntity<ApiResponse<Order>>startOrder(@RequestParam Account account) {
        final Order startingOrder = orderService.startOrder(account);
        return ResponseEntity.ok(ApiResponse.<Order>builder().data(startingOrder).build());
    }

    @DeleteMapping(params = "deleteItem")
    public ResponseEntity<ApiResponse<Order>>removeItem(@RequestParam Order order, @RequestParam Product product) {
        final Order removingItem = orderService.removeItem(order, product);
        return ResponseEntity.ok(ApiResponse.<Order>builder().data(removingItem).build());
    }

    @GetMapping(params = "submitDate")
    public ResponseEntity<ApiResponse<List<Order>>> findBySubmitDate(@RequestParam Date submitDate) {
        final List<Order> bySubmitDate = orderService.findBySubmitDate(submitDate);
        if (bySubmitDate == null) {
            throw new NoSuchElementException("Order not found");
        }
        return ResponseEntity.ok(ApiResponse.<List<Order>>builder().data(bySubmitDate).build());
    }


}
