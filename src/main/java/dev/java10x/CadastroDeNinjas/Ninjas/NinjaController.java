package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa e minha primeira mensagem nessa rota -- Hello World";
    }

    //Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado!";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Todos Ninjas Criados!";
    }

    //Mostrar ninja por id (READ)
    @GetMapping("/todosId")
    public String mostrarTodosOsNinjasPorId() {
        return "Todos Ninjas Criados por ID!";
    }

    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarId")
    public String alterarNinjaPorId(){
        return "Alterar Ninja Por ID!";
    }
    //Deletar Ninjas (DELETE)
    @DeleteMapping("/deletarId")
    public String deletarNinjaPorId(){
        return "Deletar Ninja por ID!";
    }
}
