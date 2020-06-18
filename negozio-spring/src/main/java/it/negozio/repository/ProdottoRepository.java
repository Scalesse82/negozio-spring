package it.negozio.repository;

import org.springframework.data.repository.CrudRepository;

import it.negozio.model.Prodotto;


public interface ProdottoRepository  extends CrudRepository<Prodotto, Long> {


}
