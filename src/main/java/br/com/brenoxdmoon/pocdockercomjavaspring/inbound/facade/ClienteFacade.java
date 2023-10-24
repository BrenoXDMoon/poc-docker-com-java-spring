package br.com.brenoxdmoon.pocdockercomjavaspring.inbound.facade;

import br.com.brenoxdmoon.pocdockercomjavaspring.core.command.CadastrarClienteCommand;
import br.com.brenoxdmoon.pocdockercomjavaspring.core.dto.ClienteDTO;

public interface ClienteFacade {
    ClienteDTO cadastrar(CadastrarClienteCommand command);
}
