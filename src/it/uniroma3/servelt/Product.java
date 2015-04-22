package it.uniroma3.servelt;

/**
 * Created by Andrea on 22/04/15.
 */
public class Product {
    private String nome;
    private String codice;
    private Double prezzo;

    public Product(String nome, String codice, Double prezzo) {
        this.nome = nome;
        this.codice = codice;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", codice='" + codice + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
