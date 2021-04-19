package edu.ada.service.library.service;

import edu.ada.service.library.model.dto.CommentModel;
import edu.ada.service.library.model.entity.Books;
import edu.ada.service.library.model.entity.Comment;

import java.util.List;

public interface CommentService {


    void comment(CommentModel commentModel, Books books);
    List<Comment> comments(int bookId);


}
