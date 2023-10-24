package br.com.brenoxdmoon.pocdockercomjavaspring.inbound.controller;

import br.com.brenoxdmoon.pocdockercomjavaspring.core.command.CadastrarClienteCommand;
import br.com.brenoxdmoon.pocdockercomjavaspring.core.dto.ClienteDTO;
import br.com.brenoxdmoon.pocdockercomjavaspring.inbound.facade.ClienteFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    //TODO: encontrar uma forma de fazer com que minha aplicação encontre o banco de dados
    private final ClienteFacade facade;

    public ClienteController(ClienteFacade facade) {
        this.facade = facade;
    }

    @PostMapping
    public ResponseEntity<ClienteDTO> cadastrarCliente(CadastrarClienteCommand command){
        return ResponseEntity.ok().body(facade.cadastrar(command));
    }

}
