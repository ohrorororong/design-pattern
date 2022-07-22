package structural_patterns.adapter.after.security;

// 타겟 인터페이스
public interface UserDetailsService {
    UserDetails loadUser(String username);
}
