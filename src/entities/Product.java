package entities;
import application.Program;

import java.util.Objects;

public class Product {

    private String candidato;
    private Integer votos;

    public Product(String candidato, Integer votos) {
        this.candidato = candidato;
        this.votos = votos;
    }

    public Product(Integer votos) {
        this.votos = votos;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }


    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return candidato.equals(product.candidato) && votos.equals(product.votos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candidato, votos);
    }
}
