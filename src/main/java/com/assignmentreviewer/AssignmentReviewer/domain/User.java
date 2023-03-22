package com.assignmentreviewer.AssignmentReviewer.domain;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private LocalDate cohortStartDate;
  private String password;
  private String username;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDate getCohortStartDate() {
    return cohortStartDate;
  }

  public void setCohortStartDate(LocalDate cohortStartDate) {
    this.cohortStartDate = cohortStartDate;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

}
