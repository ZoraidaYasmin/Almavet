package com.example.Almavet.Service.impl;

import com.example.Almavet.Entity.Cliente;
import com.example.Almavet.Entity.Pet;
import com.example.Almavet.Repository.ClienteRepository;
import com.example.Almavet.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<Cliente> listCliente() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public Cliente createCliente(Cliente cliente) {
        cliente.setName(cliente.getName());
        cliente.setLastName(cliente.getLastName());
        cliente.setCellphone(cliente.getCellphone());
        cliente.setEmail(cliente.getEmail());
        cliente.setDni(cliente.getDni());
        return this.clienteRepository.save(cliente);
    }

    @Override
    public Cliente modifyCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public Cliente findCliente(String dni) {
        return this.clienteRepository.findByDni(dni);
    }

    @Override
    public void deleteCliente(int id) {
        this.clienteRepository.deleteById(id);
    }

    @Override
    public List<String> listPetbyDni(String dni) {
        return this.clienteRepository.listPetbyDni(dni);
    }
}
