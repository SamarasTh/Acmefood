package gr.acmefood.controller;

import gr.acmefood.domain.Store;
import gr.acmefood.domain.StoreCategory;
import gr.acmefood.service.BaseService;
import gr.acmefood.service.StoreService;
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
@RequestMapping("stores")
public class StoreController extends AbstractController<Store>{
    private final StoreService storeService;
    @Override
    public BaseService<Store> getBaseService() {return storeService;}

    @GetMapping(params = "storeCategory")
    public ResponseEntity<ApiResponse<Store>> findStoreByStoreCategory(@RequestParam StoreCategory storeCategory) {
        final Store byStoreCategory = storeService.findStoreByStoreCategory(storeCategory);
        if (byStoreCategory == null) {
            throw new NoSuchElementException("Store not found");
        }
        return ResponseEntity.ok(ApiResponse.<Store>builder().data(byStoreCategory).build());
    }

    @GetMapping(params = "storeName")
    public ResponseEntity<ApiResponse<Store>> findStoreByName(@RequestParam String name) {
        final Store byStoreName = storeService.findStoreByName(name);
        if (byStoreName == null) {
            throw new NoSuchElementException("Store not found");
        }
        return ResponseEntity.ok(ApiResponse.<Store>builder().data(byStoreName).build());
    }

}
