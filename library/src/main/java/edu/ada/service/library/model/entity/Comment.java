package edu.ada.service.library.model.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "comments")
public class Comment {

    @Id
    private int id;

    private String comment;

    private int bookId;


    private String commentAuthor;


    public Comment() {
    }


    public Comment(int id, String comment, int bookId, String commentAuthor) {
        this.id = id;
        this.comment = comment;
        this.bookId = bookId;
        this.commentAuthor = commentAuthor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(String commentAuthor) {
        this.commentAuthor = commentAuthor;
    }
}
