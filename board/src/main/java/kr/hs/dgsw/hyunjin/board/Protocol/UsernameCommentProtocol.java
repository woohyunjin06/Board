package kr.hs.dgsw.hyunjin.board.Protocol;

import kr.hs.dgsw.hyunjin.board.Domain.Comment;
import lombok.Data;

@Data
public class UsernameCommentProtocol extends Comment {

    private String username;

    public UsernameCommentProtocol(Comment comment, String username) {
        super(comment);
        this.username = username;
    }
}
