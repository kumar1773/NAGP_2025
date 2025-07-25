package com.nagp.k8s.quotes.controller;

import com.nagp.k8s.quotes.model.request.QuoteRequest;
import com.nagp.k8s.quotes.model.response.QuotesResponse;
import com.nagp.k8s.quotes.services.QuotesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotes")
@RequiredArgsConstructor
public class QuotesController {
  private final QuotesService quotesService;
  @GetMapping
  public QuotesResponse getQuotes(){
    return quotesService.getQuotes();
  }

  @GetMapping("/{id}")
  public QuotesResponse getQuote(@PathVariable(name = "id") Long id){
    return quotesService.getQuote(id);
  }

  @PostMapping
  public QuotesResponse createQuote(@Valid @RequestBody QuoteRequest request){
    return quotesService.createQuote(request);
  }
}
