package gr.acmefood.controller;

import gr.acmefood.domain.ProductCategory;
import gr.acmefood.domain.Store;
import gr.acmefood.service.BaseService;
import gr.acmefood.service.ProductCategoryService;
import gr.acmefood.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Email;
import java.util.NoSuchElementException;

@RestController
@RequiredArgsConstructor
@RequestMapping("productCategories")
public class ProductCategoryController extends AbstractController<ProductCategory> {

    private final ProductCategoryService productCategoryService;

    @Override
    public BaseService<ProductCategory> getBaseService() {
        return productCategoryService;
    }

//    @GetMapping(params = "productCategoryName")
//    public ResponseEntity<ApiResponse<ProductCategory>> findByName(@RequestParam String name) {
//        final ProductCategory byProductCategoryName = productCategoryService.findByName(name);
//        if (byProductCategoryName == null) {
//            throw new NoSuchElementException("Product category not found");
//        }
//        return ResponseEntity.ok(ApiResponse.<ProductCategory>builder().data(byProductCategoryName).build());
//    }

}
