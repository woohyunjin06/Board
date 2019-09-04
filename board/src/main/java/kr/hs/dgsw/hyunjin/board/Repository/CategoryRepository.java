package kr.hs.dgsw.hyunjin.board.Repository;

import kr.hs.dgsw.hyunjin.board.Domain.Board;
import kr.hs.dgsw.hyunjin.board.Domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
