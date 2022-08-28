package gr.acmefood.controller;

import gr.acmefood.domain.Account;

public interface AccountController extends BaseController<Account>{

    Account findByEmail(String email);

    Account findByPhone(String phone);
}
