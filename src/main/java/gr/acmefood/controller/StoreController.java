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

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequiredArgsConstructor
@RequestMapping("stores")
public class StoreController extends AbstractController<Store> {
    private final StoreService storeService;

    @Override
    public BaseService<Store> getBaseService() {
        return storeService;
    }

    @GetMapping(params = "storeCategory")
    public ResponseEntity<ApiResponse<List<Store>>> findByStoreCategory(@RequestParam StoreCategory storeCategory) {
        final List<Store> byStoreCategory = storeService.findByStoreCategory(storeCategory);
        logger.info(String.valueOf(storeCategory));
        if (byStoreCategory == null) {
            throw new NoSuchElementException("Stores not found");
        }
        return ResponseEntity.ok(ApiResponse.<List<Store>>builder().data(byStoreCategory).build());
    }

    @GetMapping(params = "storeName")
    public ResponseEntity<ApiResponse<Store>> findByName(@RequestParam String storeName) {
        final Store byStoreName = storeService.findByName(storeName);
        if (byStoreName == null) {
            throw new NoSuchElementException("Store not found");
        }
        return ResponseEntity.ok(ApiResponse.<Store>builder().data(byStoreName).build());
    }

//    @GetMapping("/getByStatus")
//    public ResponseEntity<ApiResponse<List<Parent>>> findByMaritalStatus(@RequestParam("status") MaritalStatus maritalStatus) {
//        logger.info(String.valueOf(maritalStatus));
//        //MaritalStatus maritalStatus
//        final List<Parent> byMaritalStatus = parentService.findByMaritalStatus(maritalStatus);
//        if (byMaritalStatus == null) {
//            throw new NoSuchElementException("Element not found");
//        }
//        return ResponseEntity.ok(ApiResponse.<List<Parent>>builder().data(byMaritalStatus).build());
//    }

}
