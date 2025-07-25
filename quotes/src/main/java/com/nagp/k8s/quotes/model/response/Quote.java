package com.nagp.k8s.quotes.model.response;

import com.nagp.k8s.quotes.persistence.entity.QuoteEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quote {
  private long id;
  private String quote;
  private String author;

  public static Quote populate(QuoteEntity quoteEntity) {
    Quote quote = new Quote();
    quote.setId(quoteEntity.getId());
    quote.setQuote(quoteEntity.getQuote());
    quote.setAuthor(quoteEntity.getAuthor());
    return quote;
  }
}
