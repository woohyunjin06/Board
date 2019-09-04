package kr.hs.dgsw.hyunjin.board.Service;

import kr.hs.dgsw.hyunjin.board.Domain.Comment;
import kr.hs.dgsw.hyunjin.board.Domain.User;
import kr.hs.dgsw.hyunjin.board.Protocol.UsernameCommentProtocol;
import kr.hs.dgsw.hyunjin.board.Repository.CommentRepository;
import kr.hs.dgsw.hyunjin.board.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init() {
    }

    private String getUsername(Long userId)  {
        return userRepository.findById(userId)
                .map(User::getUsername)
                .orElse(null);
    }

    @Override
    public List<UsernameCommentProtocol> getCommentByBoardId(Long boardId) {
        List<UsernameCommentProtocol> list = new ArrayList<>();
        commentRepository.findAllByBoardId(boardId).forEach(comment -> {
            list.add(new UsernameCommentProtocol(comment, getUsername(comment.getUserId())));
        });

        return list;
    }

    @Override
    public void postComment(Comment comment) {

    }
}
