package kr.hs.dgsw.hyunjin.board.Controller;

import kr.hs.dgsw.hyunjin.board.Domain.User;
import kr.hs.dgsw.hyunjin.board.Protocol.ResponseFormat;
import kr.hs.dgsw.hyunjin.board.Protocol.ResponseType;
import kr.hs.dgsw.hyunjin.board.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/api/auth/register")
    public ResponseFormat register(@RequestBody User u) {
        return new ResponseFormat(userService.register(u));
    }

    @PostMapping(path = "/api/auth/login")
    public ResponseFormat login(@RequestBody User u) {
        User user = userService.login(u);
        boolean result = user != null;

        return new ResponseFormat(ResponseType.fromBoolean(result), user);
    }

}
