package gr.acmefood.controller;

import gr.acmefood.domain.Account;
import gr.acmefood.service.AccountService;
import gr.acmefood.service.BaseService;
import gr.acmefood.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@RestController
@RequestMapping("accounts")
public class AccountController extends AbstractController<Account> {

    private final AccountService accountService;

    @Override
    protected BaseService<Account> getBaseService() {
        return accountService;
    }
    @GetMapping(params = "email")
    public ResponseEntity<ApiResponse<Account>> findByEmail(@Email  @RequestParam String email){
        final Account accountFoundByEmail = accountService.findByEmail(email);
        if (accountFoundByEmail == null){
            throw new NoSuchElementException("Account not found");
        }
        return ResponseEntity.ok(ApiResponse.<Account>builder().data(accountFoundByEmail).build());
    }

    @GetMapping(params = "phone")
    public ResponseEntity<ApiResponse<Account>> findByPhone(@RequestParam String phone){
        final Account accountFoundByPhone = accountService.findByPhone(phone);
        if (accountFoundByPhone == null){
            throw new NoSuchElementException("Account not found");
        }
        return ResponseEntity.ok(ApiResponse.<Account>builder().data(accountFoundByPhone).build());
    }



}


