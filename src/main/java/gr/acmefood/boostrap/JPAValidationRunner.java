package gr.acmefood.boostrap;

import gr.acmefood.base.BaseComponent;
import gr.acmefood.domain.Account;
import gr.acmefood.service.AccountService;
import gr.acmefood.service.ProductCategoryService;
import gr.acmefood.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Profile("jpa-runner")
@RequiredArgsConstructor
public class JPAValidationRunner extends BaseComponent implements CommandLineRunner {
    private final ProductService productService;
    private final ProductCategoryService productCategoryService;
    private final AccountService accountService;

    @Override
    public void run(String... args) throws Exception {
        List<Account> accounts = accountService.createAll(
                Account.builder().email("test@gmail.com")
                        .username("test12")
                        .password("1234as")
                        .phone("6912986710").build());

        //@formatter:on
    }
}
