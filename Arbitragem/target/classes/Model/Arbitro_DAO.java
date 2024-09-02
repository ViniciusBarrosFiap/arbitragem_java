/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author vinic
 */
public class Arbitro_DAO {
    private String nome;
    private String especialidade;
    private String ranking;
    
    private static List<Arbitro_DAO> arbitros = new ArrayList<>();
    
    public Arbitro_DAO(String nome, String especialidade, String ranking) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.ranking = ranking;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
    public static void adicionarArbitro(Arbitro_DAO arbitro) {
        arbitros.add(arbitro);
    }
    public static List<Arbitro_DAO> getArbitros() {
        return arbitros;
    }
    
   public static List<Arbitro_DAO> filtrarArbitros(String filtroValor) {
    return arbitros.stream()
            .filter(arbitro -> arbitro.getRanking().equalsIgnoreCase(filtroValor))
            .collect(Collectors.toList());
}

    @Override
    public String toString() {
        return nome + " - " + ranking;
    }
}
