package gr.acmefood.controller;

import gr.acmefood.domain.StoreCategory;
import gr.acmefood.service.BaseService;
import gr.acmefood.service.StoreCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("categories")
public class StoreCategoryController extends AbstractController<StoreCategory> {

    private final StoreCategoryService storeCategoryService;

    @Override
    protected BaseService<StoreCategory> getBaseService() {
        return storeCategoryService;
    }
}
