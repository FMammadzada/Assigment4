package edu.ada.service.library.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@NoArgsConstructor
@Data
public class BookModel implements Serializable {
    private String name;
    private int userId;

    private List<CommentModel> comments;

}
