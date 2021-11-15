package Modelo;

public class Livro {
    private String tituloLivro;
    private Integer numeroPagina;
    private String autorLivro;
    private Integer codigoLivro;

    public Livro(String tituloLivro, Integer numeroPagina, String autorLivro, Integer codigoLivro) {
        this.tituloLivro = tituloLivro;
        this.numeroPagina = numeroPagina;
        this.autorLivro = autorLivro;
        this.codigoLivro = codigoLivro;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public Integer getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(Integer numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public Integer getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(Integer codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    @Override
    public String toString() {
        return "Livro [autorLivro=" + autorLivro + ", codigoLivro=" + codigoLivro + ", numeroPagina=" + numeroPagina
                + ", tituloLivro=" + tituloLivro + "]";
    }

}
