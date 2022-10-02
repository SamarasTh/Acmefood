package gr.acmefood.service;

import gr.acmefood.domain.Account;
import gr.acmefood.domain.StoreCategory;
import gr.acmefood.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {
    private final AccountRepository accountRepository;


    @Override
    public Account findById(final Long id) {
        Optional<Account> account = accountRepository.findById(id);
        if (account.isPresent()) {
            return account.get();
        } else {
            throw new NoSuchElementException("Account with id: " + id + " does not exists!");
        }
    }

    @Override
    public JpaRepository<Account, Long> getRepository() {
        return accountRepository;
    }
}
