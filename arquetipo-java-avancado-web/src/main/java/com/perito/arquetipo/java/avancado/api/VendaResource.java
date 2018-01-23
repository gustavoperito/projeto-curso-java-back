package com.perito.arquetipo.java.avancado.api;

import com.perito.arquetipo.java.avancado.model.Venda;
import com.perito.arquetipo.java.avancado.service.AbstractCrudService;
import com.perito.arquetipo.java.avancado.service.VendaService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("vendas")
public class VendaResource extends AbstractCrudResource<Venda> {

    @Inject
    private VendaService service;

    @Override
    protected AbstractCrudService<Venda> getService() {
        return service;
    }
}
