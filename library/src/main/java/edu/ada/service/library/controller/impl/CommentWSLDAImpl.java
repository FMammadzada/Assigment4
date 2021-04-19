package edu.ada.service.library.controller.impl;

import edu.ada.service.library.controller.CommentWS;
import edu.ada.service.library.model.dto.CommentModel;
import org.springframework.http.ResponseEntity;

public class CommentWSLDAImpl implements CommentWS {
    @Override
    public ResponseEntity comment(int bookId, CommentModel commentModel) {
        return null;
    }

    @Override
    public ResponseEntity bookDetails(int bookId) {
        return null;
    }
}
