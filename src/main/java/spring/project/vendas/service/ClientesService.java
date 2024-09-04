package spring.project.vendas.service;


import spring.project.vendas.model.Cliente;
import spring.project.vendas.repository.ClientesRepository;

public class ClientesService {

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        ClientesRepository clientesRepository = new ClientesRepository();
        clientesRepository.persistir(cliente);

    }

    public void validarCliente(Cliente cliente){

    }
}
