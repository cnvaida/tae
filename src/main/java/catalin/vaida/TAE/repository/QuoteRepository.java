package catalin.vaida.TAE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import catalin.vaida.TAE.model.Quote;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Integer> {

}
