package kr.hs.dgsw.hyunjin.board.Controller;

import kr.hs.dgsw.hyunjin.board.Domain.Board;
import kr.hs.dgsw.hyunjin.board.Protocol.ResponseFormat;
import kr.hs.dgsw.hyunjin.board.Protocol.ResponseType;
import kr.hs.dgsw.hyunjin.board.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/api/board")
    public ResponseFormat getAll() {
        return new ResponseFormat(ResponseType.OK);
    }

    @GetMapping("/api/category")
    public ResponseFormat getCategory() {
        return new ResponseFormat(ResponseType.OK, boardService.getCategory());
    }


    @GetMapping("/api/product/{id}")
    public ResponseFormat getBoardById(@PathVariable Long id) {
        Board found = boardService.getBoard(id);
        ResponseType result = found != null ? ResponseType.OK : ResponseType.EMPTY_DATA;
        return new ResponseFormat(result, found);
    }

    @GetMapping("/api/product/category/{id}")
    public ResponseFormat getProductByCategoryId(@PathVariable Long id) {
        return new ResponseFormat(ResponseType.OK, boardService.getBoardByCategoryId(id));
    }
}
