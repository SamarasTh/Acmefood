package gr.acmefood.service;

import gr.acmefood.domain.Account;

public interface AccountService extends BaseService<Account> {


    Account findById(Long id);
}
