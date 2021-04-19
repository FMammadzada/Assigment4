package edu.ada.service.library.repository;

import edu.ada.service.library.model.entity.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CommentRepository extends MongoRepository<Comment, Integer> {
List<Comment> findAllByBookId(int bookid);

}
