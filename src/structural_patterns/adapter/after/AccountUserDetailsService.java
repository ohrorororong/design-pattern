package structural_patterns.adapter.after;

import structural_patterns.adapter.after.security.UserDetails;
import structural_patterns.adapter.after.security.UserDetailsService;

// Adapter
public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        return new AccountUserDetails(accountByUsername);
    }
}
