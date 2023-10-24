package br.com.brenoxdmoon.pocdockercomjavaspring.inbound.facade.impl;

import br.com.brenoxdmoon.pocdockercomjavaspring.core.command.CadastrarClienteCommand;
import br.com.brenoxdmoon.pocdockercomjavaspring.core.dto.ClienteDTO;
import br.com.brenoxdmoon.pocdockercomjavaspring.inbound.facade.ClienteFacade;
import org.springframework.stereotype.Component;

@Component
public class ClienteFacadeImpl implements ClienteFacade {
    @Override
    public ClienteDTO cadastrar(CadastrarClienteCommand command) {
        return null;
    }
}
