package com.nagp.k8s.quotes.model.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class QuoteRequest {
  @NotNull(message = "Please provide a valid quote")
  private String quote;
  private String author;
}
