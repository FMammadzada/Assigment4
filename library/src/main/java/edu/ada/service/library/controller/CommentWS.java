package edu.ada.service.library.controller;

import edu.ada.service.library.model.dto.CommentModel;
import org.springframework.http.ResponseEntity;

public interface CommentWS {
    ResponseEntity comment(int bookId, CommentModel commentModel);
    ResponseEntity bookDetails(int bookId);


}
