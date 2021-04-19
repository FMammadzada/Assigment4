package edu.ada.service.library.controller.impl;

import edu.ada.service.library.controller.CommentWS;
import edu.ada.service.library.model.dto.BookModel;
import edu.ada.service.library.model.dto.CommentModel;
import edu.ada.service.library.model.entity.Books;
import edu.ada.service.library.model.entity.Comment;
import edu.ada.service.library.repository.BookLibraryRepository;
import edu.ada.service.library.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CommentWSImpl implements CommentWS {

    @Autowired
    private CommentService commentService;

    @Autowired
    private BookLibraryRepository bookLibraryRepository;


    @Override
    @RequestMapping(value = "/comment/book/{id}", method = RequestMethod.POST)
    public ResponseEntity comment(@PathVariable("id") int bookId, @RequestBody CommentModel commentModel) {
        System.out.println(bookLibraryRepository.findById(bookId).get());
        System.out.println(commentModel.toString());
        commentService.comment(commentModel, bookLibraryRepository.findById(bookId).get());
        return new ResponseEntity("Successfully commented...", HttpStatus.OK);


    }

    @Override
    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public ResponseEntity bookDetails(@PathVariable("id") int bookId) {

        Books books = bookLibraryRepository.findById(bookId).get();
        BookModel bookModel = new BookModel();
        bookModel.setUserId(books.getReserved());
        bookModel.setName(books.getName());
        List<CommentModel> commentModelList = new ArrayList<>();
        List<Comment> comments = commentService.comments(bookId);

        for (int i = 0; i < comments.size(); i++) {
            CommentModel commentModel = new CommentModel();
            commentModel.setContent(comments.get(i).getComment());
            commentModel.setAuthor_name(comments.get(i).getCommentAuthor());
            commentModelList.add(commentModel);
        }
        bookModel.setComments(commentModelList);

        return new ResponseEntity(bookModel, HttpStatus.OK);


    }
}
