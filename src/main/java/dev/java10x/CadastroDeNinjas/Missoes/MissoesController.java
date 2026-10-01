package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    //GET - Mandar uma requisicao para mostrar as missoes
    @GetMapping
    public String listarMissoes(){
        return "Listar Missoes!";
    }

    //POST - Mandar uma requisicao para criar uma missao
    @PostMapping("/criar")
    public String criarMissao(){
        return "Criando Missao!";
    }

    //PUT - Mandar uma requisicao para alterar uma missao
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Alterando Missao!";
    }

    //DELETE - Mandar uma requisicao para apagar uma missao
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Deletando Missao!";
    }
}
