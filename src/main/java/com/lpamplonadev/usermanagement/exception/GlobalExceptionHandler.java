package com.lpamplonadev.usermanagement.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<ApiError> handleNotFound(ResourceNotFoundException ex, HttpServletRequest request) {
    HttpStatus status = HttpStatus.NOT_FOUND;

    ApiError body = new ApiError(
        Instant.now(),
        status.value(),
        status.getReasonPhrase(),
        ex.getMessage(),
        request.getRequestURI());

    return ResponseEntity.status(status).body(body);
  }

  @ExceptionHandler(DuplicateResourceException.class)
  public ResponseEntity<ApiError> handleDuplicate(DuplicateResourceException ex, HttpServletRequest request) {
    HttpStatus status = HttpStatus.CONFLICT;

    ApiError body = new ApiError(
        Instant.now(),
        status.value(),
        status.getReasonPhrase(),
        ex.getMessage(),
        request.getRequestURI());

    return ResponseEntity.status(status).body(body);
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ApiError> handleValidation(MethodArgumentNotValidException ex, HttpServletRequest request) {
    HttpStatus status = HttpStatus.BAD_REQUEST;

    String message = ex.getBindingResult().getFieldErrors().isEmpty()
        ? "Validation failed"
        : ex.getBindingResult().getFieldErrors().get(0).getDefaultMessage();

    ApiError body = new ApiError(
        Instant.now(),
        status.value(),
        status.getReasonPhrase(),
        message,
        request.getRequestURI());

    return ResponseEntity.status(status).body(body);
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ApiError> handleGeneric(Exception ex, HttpServletRequest request) {
    HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

    ApiError body = new ApiError(
        Instant.now(),
        status.value(),
        status.getReasonPhrase(),
        "An unexpected error occurred",
        request.getRequestURI());
    return ResponseEntity.status(status).body(body);

  }

}
