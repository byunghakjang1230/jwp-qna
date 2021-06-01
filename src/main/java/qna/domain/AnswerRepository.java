package qna.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> findByQuestionIdAndDeletedFalse(Long questionId);

    Optional<Answer> findByIdAndDeletedFalse(Long id);

    List<Answer> findByQuestionIdAndContentsContaining(Long questionId, String contents);

    List<Answer> findByQuestionIdIsNotNull();

    List<Answer> findByWriterIdAndQuestionId(Long writerId, Long questionId);
}
