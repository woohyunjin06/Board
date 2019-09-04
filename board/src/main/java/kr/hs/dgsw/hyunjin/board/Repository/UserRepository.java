package kr.hs.dgsw.hyunjin.board.Repository;

import kr.hs.dgsw.hyunjin.board.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
