package com.example.Almavet.Service;

import com.example.Almavet.Entity.Cliente;

import java.util.List;

public interface ClienteService {

    public List<Cliente> listCliente();

    public Cliente createCliente(Cliente cliente);

    public Cliente modifyCliente(Cliente cliente);

    public Cliente findCliente(String dni);

    public void deleteCliente(int id);

    public List<String> listPetbyDni (String dni);

}
