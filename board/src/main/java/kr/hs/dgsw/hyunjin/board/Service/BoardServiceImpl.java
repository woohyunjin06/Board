package kr.hs.dgsw.hyunjin.board.Service;

import kr.hs.dgsw.hyunjin.board.Domain.Board;
import kr.hs.dgsw.hyunjin.board.Domain.Category;
import kr.hs.dgsw.hyunjin.board.Repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @PostConstruct
    public void init() {

    }

    @Override
    public List<Board> getBoard(int page) {
        return boardRepository.findAll();
    }

    @Override
    public void addBoard(Board board) {
        boardRepository.save(board);
    }

    @Override
    public void deleteBoard(Long id) {
        boardRepository.deleteById(id);
    }


    @Override
    public Board getBoard(Long id) {
        return null;
    }


    @Override
    public List<Category> getCategory() {
        return null;
    }

    @Override
    public List<Board> getBoardByCategoryId(Long id) {
        return null;
    }
}
