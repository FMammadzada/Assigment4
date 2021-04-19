package edu.ada.service.library.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@NoArgsConstructor
@Data
@ToString
public class CommentModel {

    private String id;
    private String author_name;
    private String content;

}
