package edu.ada.service.library.service.impl;

import edu.ada.service.library.model.dto.CommentModel;
import edu.ada.service.library.model.entity.Books;
import edu.ada.service.library.model.entity.Comment;
import edu.ada.service.library.repository.CommentRepository;
import edu.ada.service.library.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;


    @Override
    public void comment(CommentModel commentModel, Books books) {
        Comment comment = new Comment();
        comment.setComment(commentModel.getContent());
        comment.setId(Integer.parseInt(commentModel.getId()));
        comment.setCommentAuthor(commentModel.getAuthor_name());
        comment.setBookId(books.getId());
        commentRepository.save(comment);


    }

    @Override
    public List<Comment> comments(int bookId) {
        return commentRepository.findAllByBookId(bookId);
    }
}
