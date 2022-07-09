package io.github.Gabrielzint.services;

import io.github.Gabrielzint.model.Cliente;
import io.github.Gabrielzint.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServices {

    private ClientRepository repository; /* Referencia variavel de instancia do services */

    @Autowired
    public  ClientServices ( ClientRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        ValidarCliente(cliente);
        this.repository = repository;
    }

    public  void ValidarCliente(Cliente cliente){

    }
}
