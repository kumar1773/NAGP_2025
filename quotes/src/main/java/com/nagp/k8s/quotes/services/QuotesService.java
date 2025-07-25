package com.nagp.k8s.quotes.services;

import com.nagp.k8s.quotes.model.request.QuoteRequest;
import com.nagp.k8s.quotes.model.response.QuotesResponse;

public interface QuotesService {

  QuotesResponse getQuotes();

  QuotesResponse getQuote(Long id);

  QuotesResponse createQuote(QuoteRequest request);
}
