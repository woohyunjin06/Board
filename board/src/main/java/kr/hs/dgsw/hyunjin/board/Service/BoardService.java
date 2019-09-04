package kr.hs.dgsw.hyunjin.board.Service;


import kr.hs.dgsw.hyunjin.board.Domain.Board;
import kr.hs.dgsw.hyunjin.board.Domain.Category;

import java.util.List;

public interface BoardService {

    List<Board> getBoard(int page);
    Board getBoard(Long id);
    void addBoard(Board board);
    void deleteBoard(Long id);

    List<Category> getCategory();

    List<Board> getBoardByCategoryId(Long id);
}
