package Modelo;

import java.time.LocalDate;

public class Locação {
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private Integer cpfCliente;
    private Integer codigoLivro;
    private Boolean statusDevolucao;
    public Locação(LocalDate dataLocacao, LocalDate dataDevolucao, Integer cpfCliente, Integer codigoLivro,
            Boolean statusDevolucao) {
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.cpfCliente = cpfCliente;
        this.codigoLivro = codigoLivro;
        this.statusDevolucao = statusDevolucao;
    }
    public LocalDate getDataLocacao() {
        return dataLocacao;
    }
    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public Integer getCpfCliente() {
        return cpfCliente;
    }
    public void setCpfCliente(Integer cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    public Integer getCodigoLivro() {
        return codigoLivro;
    }
    public void setCodigoLivro(Integer codigoLivro) {
        this.codigoLivro = codigoLivro;
    }
    public Boolean getStatusDevolucao() {
        return statusDevolucao;
    }
    public void setStatusDevolucao(Boolean statusDevolucao) {
        this.statusDevolucao = statusDevolucao;
    }
    @Override
    public String toString() {
        return "Locação [codigoLivro=" + codigoLivro + ", cpfCliente=" + cpfCliente + ", dataDevolucao=" + dataDevolucao
                + ", dataLocacao=" + dataLocacao + ", statusDevolucao=" + statusDevolucao + "]";
    }
    
}
