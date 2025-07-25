package com.nagp.k8s.quotes.services;

import com.nagp.k8s.quotes.model.request.QuoteRequest;
import com.nagp.k8s.quotes.model.response.Quote;
import com.nagp.k8s.quotes.model.response.QuotesResponse;
import com.nagp.k8s.quotes.persistence.entity.QuoteEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuotesServiceImpl implements QuotesService {

  private final QuotesRepository quotesRepository;

  @Override
  public QuotesResponse getQuotes() {
    List<Quote> all = quotesRepository.findAll()
                                      .stream()
                                      .map(Quote::populate)
                                      .collect(Collectors.toCollection(ArrayList::new));
    return new QuotesResponse(all);
  }

  @Override
  public QuotesResponse getQuote(Long id) {
    Quote quote = quotesRepository.findById(id).map(Quote::populate).orElse(new Quote());
    return new QuotesResponse(List.of(quote));
  }

  @Override
  public QuotesResponse createQuote(QuoteRequest request) {
    QuoteEntity quoteEntity = quotesRepository.save(mapToQuoteEntity(request));
    Quote quote = new Quote().populate(quoteEntity);
    return new QuotesResponse(List.of(quote));
  }

  private static QuoteEntity mapToQuoteEntity(QuoteRequest request) {
    QuoteEntity quoteEntity = new QuoteEntity();
    quoteEntity.setQuote(request.getQuote());
    quoteEntity.setAuthor(request.getAuthor());
    return quoteEntity;
  }
}
