package com.landix.ldxps;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class Vendedor extends Object implements Serializable, Comparable<UUID> {

    private UUID codigoVendedor;
    private String nomeVendedor;
    private Integer tabelaPrecosPadrao;
    private Date dataNascimentoVendedor;

    @Override
    public int compareTo(UUID o) {
        return 0;
    }

    public Vendedor(String nomeVendedor, Integer tabelaPrecosPadrao, Date dataNascimentoVendedor) { //
        this.codigoVendedor = UUID.randomUUID();
        this.nomeVendedor = nomeVendedor;
        this.tabelaPrecosPadrao = tabelaPrecosPadrao;
        this.dataNascimentoVendedor = dataNascimentoVendedor;
    }

    public UUID getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(UUID codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public Integer getTabelaPrecosPadrao() {
        return tabelaPrecosPadrao;
    }

    public void setTabelaPrecosPadrao(Integer tabelaPrecosPadrao) {
        this.tabelaPrecosPadrao = tabelaPrecosPadrao;
    }

    public Date getDataNascimentoVendedor() {
        return dataNascimentoVendedor;
    }

    public void setDataNascimentoVendedor(Date dataNascimentoVendedor) {
        this.dataNascimentoVendedor = dataNascimentoVendedor;
    }

    @Override
    public String toString() {
        return nomeVendedor;
    }
}
