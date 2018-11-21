package com.example.shootingstars.transporteparticularapp.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;
import java.util.Objects;

/**
 * Created by Pablo H.
 * on 20/11/2018.
 */
@Entity(tableName = "VIAGEM_TABLE")
public class Viagem {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID_MOTORISTA")
    private long idViagem;
    private String enderecoSaida;
    private String enderecoChegada;
    private Date dataSaida;
    private Date dataChegada;
    private Float valorViagem;

    public Viagem() {
    }

    public Viagem(long idViagem, String enderecoSaida, String enderecoChegada, Date dataSaida, Date dataChegada, Float valorViagem) {
        this.idViagem = idViagem;
        this.enderecoSaida = enderecoSaida;
        this.enderecoChegada = enderecoChegada;
        this.dataSaida = dataSaida;
        this.dataChegada = dataChegada;
        this.valorViagem = valorViagem;
    }

    public long getIdViagem(){
        return idViagem;
    }

    public void setIdViagem(long idViagem) {
        this.idViagem = idViagem;
    }

    public String getEnderecoSaida() {
        return enderecoSaida;
    }

    public void setEnderecoSaida(String enderecoSaida) {
        this.enderecoSaida = enderecoSaida;
    }

    public String getEnderecoChegada() {
        return enderecoChegada;
    }

    public void setEnderecoChegada(String enderecoChegada) {
        this.enderecoChegada = enderecoChegada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public Float getValorViagem() {
        return valorViagem;
    }

    public void setValorViagem(Float valorViagem) {
        this.valorViagem = valorViagem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viagem viagem = (Viagem) o;
        return idViagem == viagem.idViagem &&
                Objects.equals(enderecoSaida, viagem.enderecoSaida) &&
                Objects.equals(enderecoChegada, viagem.enderecoChegada) &&
                Objects.equals(dataSaida, viagem.dataSaida) &&
                Objects.equals(dataChegada, viagem.dataChegada) &&
                Objects.equals(valorViagem, viagem.valorViagem);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idViagem, enderecoSaida, enderecoChegada, dataSaida, dataChegada, valorViagem);
    }

    @Override
    public String toString() {
        return "Viagem{" +
                "idViagem=" + idViagem +
                ", enderecoSaida='" + enderecoSaida + '\'' +
                ", enderecoChegada='" + enderecoChegada + '\'' +
                ", dataSaida=" + dataSaida +
                ", dataChegada=" + dataChegada +
                ", valorViagem=" + valorViagem +
                '}';
    }
}


