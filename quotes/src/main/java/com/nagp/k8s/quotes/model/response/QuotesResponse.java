package com.nagp.k8s.quotes.model.response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class QuotesResponse {
  private List<Quote> quotes;
}
