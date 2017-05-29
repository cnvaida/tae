package catalin.vaida.TAE.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import catalin.vaida.TAE.model.Quote;
import catalin.vaida.TAE.repository.QuoteRepository;

@Service
@Transactional
public class QuoteService {
	@Autowired
	private QuoteRepository repository;
	
	@Transactional
	public void add(Quote quote) {
		repository.saveAndFlush(quote);
	}
	
	@Transactional
	public void update(Quote quote) {
		repository.saveAndFlush(quote);
	}
	
	@Transactional
	public void delete(Quote quote) {
		repository.delete(quote);
	}
	
	public List<Quote> getAll() {
		return repository.findAll();
	}
	
	public Quote getById(Integer id) {
		return repository.findOne(id);
	}
	
	@Transactional
	public void create(catalin.vaida.TAE.model.rest.Quote quote) {
		Quote q = new Quote(quote.getValue().getQuote());
		repository.saveAndFlush(q);
	}
}
