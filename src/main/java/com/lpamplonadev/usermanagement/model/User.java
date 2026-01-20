package com.lpamplonadev.usermanagement.model;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
  @Id
  @GeneratedValue
  private UUID id;

  @NotBlank
  @Column(nullable = false)
  private String name;

  @Email
  @NotBlank
  @Column(nullable = false, unique = true)
  private String email;

  @NotBlank
  @Column(nullable = false)
  private String passwordHash;

  @Column(nullable = false, updatable = false)
  private Instant createdAt;

  @Column(nullable = false)
  private Instant updatedAt;

  @PrePersist
  protected void onCreate() {
    createdAt = Instant.now();
    updatedAt = createdAt;
  }

  @PreUpdate
  protected void onUpdate() {
    updatedAt = Instant.now();
  }
}
