package com.perito.arquetipo.java.avancado.service;

import com.perito.arquetipo.java.avancado.model.Venda;
import com.perito.arquetipo.java.avancado.util.Repository;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class VendaService extends AbstractCrudService<Venda> {

    @Inject
    private Repository<Venda> repository;

    @Override
    protected Repository<Venda> getRepository() {
        return repository;
    }
}
