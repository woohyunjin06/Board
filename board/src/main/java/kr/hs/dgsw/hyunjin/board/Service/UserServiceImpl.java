package kr.hs.dgsw.hyunjin.board.Service;

import kr.hs.dgsw.hyunjin.board.Domain.User;
import kr.hs.dgsw.hyunjin.board.Protocol.ResponseType;
import kr.hs.dgsw.hyunjin.board.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init() {
    }

    @Override
    public ResponseType register(User u) {
        boolean usernameExist = this.userRepository.findByUsername(u.getUsername()).isPresent();

        if(u.hasEmpty())
            return ResponseType.EMPTY_DATA;
        if(usernameExist)
            return ResponseType.USER_DUPLICATE_USERNAME;

        userRepository.save(u);
        return ResponseType.OK;
    }

    @Override
    public User login(User u) {
        return this.userRepository.findByUsername(u.getUsername())
                .map(found -> {
                    if (found.getPassword().equals(u.getPassword())) {
                        return found;
                    }
                    return null;
                }).orElse(null);
    }

}
