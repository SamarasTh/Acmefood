package gr.acmefood.controller;

import gr.acmefood.domain.Account;
import gr.acmefood.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@RestController
@RequestMapping("accounts")
public class AccountControllerImpl extends BaseControllerImpl<Account> implements AccountController{
    private final AccountService accountService;

    @Override
    @PostMapping
    public Account create(@RequestBody Account account) {
        return accountService.create(account);
    }

    @Override
    @PostMapping
    public List<Account> createAll(@RequestBody Account... accounts) {
        return accountService.createAll();
    }

//    @Override
//    public List createAll(@RequestBody List<Account> accounts) {
//        return accountService.createAll();
//    }

    @Override
    @PutMapping
    public void update(@RequestBody Account account) {
        accountService.update(account);
    }

    @Override
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        accountService.deleteById(id);
    }


//    @Override
//    public boolean exists(Account account) {
//        return accountService.exists(account);
//    }

    @Override
    @GetMapping
    public Account get(@RequestBody Long id) {
        return accountService.get(id);
    }

    @Override
    @GetMapping
    public List<Account> findAll() {
        return accountService.findAll();
    }

    @Override
    @GetMapping(params = "email")
    public Account findByEmail(@RequestParam String email) {
        final Account byAccount = accountService.findByEmail(email);
        if (byAccount==null){
            throw new NoSuchElementException("There is no account that matches the email provided");
        }
//        TO DO TRANSFER CLASS
        return null;
    }

    @Override
    public Account findByPhone(String phone) {
        return null;
    }
}
