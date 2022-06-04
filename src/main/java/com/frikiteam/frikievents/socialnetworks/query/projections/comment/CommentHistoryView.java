package com.frikiteam.frikievents.socialnetworks.query.projections.comment;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class CommentHistoryView {
  @Id @GeneratedValue
  private Long commentHistoryId;

  private String commentId;

  private String content;

  public CommentHistoryView() {
  }

  public CommentHistoryView(String commentId, String content) {
    this.commentId = commentId;
    this.content = content;
  }

  public CommentHistoryView(CommentHistoryView commentHistoryView) {
    this.commentId = commentHistoryView.getCommentId();
    this.content = commentHistoryView.getContent();
  }
}
