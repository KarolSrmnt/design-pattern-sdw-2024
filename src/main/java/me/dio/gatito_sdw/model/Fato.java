package me.dio.gatito_sdw.model;

import jakarta.persistence.*;

@Entity
@Table(name = "gatito")
public class Fato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String assunto;

    public Fato() {
    }

    public Fato(String assunto) {
        this.assunto = assunto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return assunto;
    }
}
