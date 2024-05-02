package fr.epf.speedycart.api.controller;

import fr.epf.speedycart.api.dao.ClientDao;
import fr.epf.speedycart.api.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientDao clientDao;

    //Récupérer la liste des clients
    @RequestMapping(value = "/Clients", method = RequestMethod.GET)
    public List<Client> listClients() {
        return clientDao.findAll();
    }

    //Récupérer un client par son Id
    @GetMapping(value = "/Clients/{id}")
    public Client afficherUnClient(@PathVariable int id) {
        return clientDao.findById(id);

    }
}
