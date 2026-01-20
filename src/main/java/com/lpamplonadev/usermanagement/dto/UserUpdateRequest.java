package com.lpamplonadev.usermanagement.dto;

import jakarta.validation.constraints.Size;

public record UserUpdateRequest(
  String name,

  @Size(min = 8, message ="Password must be at least 8 characters long")
  String password
){}
