package kr.hs.dgsw.hyunjin.board.Repository;

import kr.hs.dgsw.hyunjin.board.Domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
