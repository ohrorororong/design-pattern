package structural_patterns.adapter.after;

import structural_patterns.adapter.after.security.LoginHandler;
import structural_patterns.adapter.after.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetails = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetails);
        String login = loginHandler.login("donghun", "donghun");
        System.out.println(login);
    }
}
