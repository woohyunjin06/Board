package kr.hs.dgsw.hyunjin.board.Service;


import kr.hs.dgsw.hyunjin.board.Domain.Comment;
import kr.hs.dgsw.hyunjin.board.Protocol.UsernameCommentProtocol;

import java.util.List;

public interface CommentService {
    List<UsernameCommentProtocol> getCommentByBoardId(Long boardId);
    void postComment(Comment comment);
}
