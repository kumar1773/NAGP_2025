package com.nagp.k8s.quotes.services;

import com.nagp.k8s.quotes.persistence.entity.QuoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuotesRepository extends JpaRepository<QuoteEntity, Long> {

}
