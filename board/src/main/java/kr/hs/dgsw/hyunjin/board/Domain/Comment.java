package kr.hs.dgsw.hyunjin.board.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private Long boardId;
    private Long userId;

    private String content;

    @CreationTimestamp
    private LocalDateTime created;

    @UpdateTimestamp
    private LocalDateTime updated;

    public Comment(Comment c) {
        this.boardId = c.boardId;
        this.userId = c.userId;
        this.content = c.content;
        this.created = c.created;
        this.updated = c.updated;
    }
}
