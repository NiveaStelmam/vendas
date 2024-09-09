package spring.project.vendas.service;


import org.springframework.stereotype.Service;
import spring.project.vendas.model.Cliente;
import spring.project.vendas.repository.ClientesRepository;

@Service
public class ClientesService {

    //  declarando variavel do tipo ClientesRepository
    private final ClientesRepository clientesRepository;

    // injeção de dependencia usando construtor
    public ClientesService(ClientesRepository clientesRepository){
        this.clientesRepository = clientesRepository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        clientesRepository.persistir(cliente);

    }

    public void validarCliente(Cliente cliente){

    }
}
