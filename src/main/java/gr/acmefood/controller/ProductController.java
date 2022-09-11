package gr.acmefood.controller;

import gr.acmefood.domain.Product;
import gr.acmefood.service.BaseService;
import gr.acmefood.service.ProductService;
import gr.acmefood.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequiredArgsConstructor
@RequestMapping("products")
public class ProductController extends AbstractController<Product> {

    private final ProductService productService;

    @Override
    public BaseService<Product> getBaseService() {
        return productService;
    }

    @GetMapping(params = "serial")
    public ResponseEntity<ApiResponse<Product>> findBySerial(@RequestParam String serial) {
        final Product bySerial = productService.findBySerial(serial);
        if (bySerial == null) {
            throw new NoSuchElementException("Product not found");
        }
        return ResponseEntity.ok(ApiResponse.<Product>builder().data(bySerial).build());
    }

    @GetMapping("all")
    public ResponseEntity<ApiResponse<List<Product>>> getAllProducts() {
        final List<Product> productList = productService.findAll();
        return ResponseEntity.ok(ApiResponse.<List<Product>>builder().data(productList).build());
    }
}
