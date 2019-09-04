package kr.hs.dgsw.hyunjin.board.Service;


import kr.hs.dgsw.hyunjin.board.Domain.User;
import kr.hs.dgsw.hyunjin.board.Protocol.ResponseType;

public interface UserService {
    ResponseType register(User u);
    User login(User u);
}
