package gr.acmefood.service;

import gr.acmefood.domain.Account;

public interface AccountService extends BaseService<Account> {

    Account findByEmail(String email);

    Account findByPhone(String phone);

    Account findById(Long id);
}
