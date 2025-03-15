package br.com.alura.screensound.model;

import jakarta.persistence.*;

import java.util.Optional;

@Entity
@Table(name = "musicas")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String titulo;

    @ManyToOne
    private Artista artista;

    public  Musica() {}

    public Musica(String titulo) {
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", artista=" + artista.getNome();
    }
}
