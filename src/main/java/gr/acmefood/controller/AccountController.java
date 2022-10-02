package gr.acmefood.controller;

import gr.acmefood.domain.Account;
import gr.acmefood.domain.Store;
import gr.acmefood.service.AccountService;
import gr.acmefood.service.BaseService;
import gr.acmefood.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;


@RequiredArgsConstructor
@RestController
@RequestMapping("accounts")
@CrossOrigin(origins = "*")
public class AccountController extends AbstractController<Account> {

    private final AccountService accountService;

    @Override
    protected BaseService<Account> getBaseService() {
        return accountService;
    }

    @GetMapping(params = "accountId", value = "/account-by-accountId")
    public ResponseEntity<ApiResponse<Account>> getAccountById(@RequestParam Long accountId) {
        final Account account = accountService.findById(accountId);
        if (account == null) {
            throw new NoSuchElementException("Account for this Account_id not found");
        }
        return ResponseEntity.ok(ApiResponse.<Account>builder().data(account).build());
    }

}


