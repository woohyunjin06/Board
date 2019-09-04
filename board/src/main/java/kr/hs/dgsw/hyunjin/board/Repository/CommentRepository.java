package kr.hs.dgsw.hyunjin.board.Repository;

import kr.hs.dgsw.hyunjin.board.Domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByBoardId(Long boardId);
}
