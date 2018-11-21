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
@Entity(tableName = "MOTORISTA_TABLE")
public class Motorista {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID_MOTORISTA")
    private long idMotorista;
    private String nomeMotorista;
    private String emailMotorista;
    private String senhaMotorista;
    private Date dataNascimentoMotorista;
    private Character sexoMotorista;
    private String cpfMotorista;
    private String carteiraMotorista;
    private String veiculo;
    private Date dataCadastroMotorista;


    public Motorista() {
    }

    public Motorista(long idMotorista, String nomeMotorista, String emailMotorista, String senhaMotorista, Date dataNascimentoMotorista, Character sexoMotorista, String cpfMotorista, String carteiraMotorista, String veiculo, Date dataCadastroMotorista) {
        this.idMotorista = idMotorista;
        this.nomeMotorista = nomeMotorista;
        this.emailMotorista = emailMotorista;
        this.senhaMotorista = senhaMotorista;
        this.dataNascimentoMotorista = dataNascimentoMotorista;
        this.sexoMotorista = sexoMotorista;
        this.cpfMotorista = cpfMotorista;
        this.carteiraMotorista = carteiraMotorista;
        this.veiculo = veiculo;
        this.dataCadastroMotorista = dataCadastroMotorista;
    }

    public long getIdMotorista() {
        return idMotorista;
    }

    public void setIdMotorista(long idMotorista) {
        this.idMotorista = idMotorista;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getEmailMotorista() {
        return emailMotorista;
    }

    public void setEmailMotorista(String emailMotorista) {
        this.emailMotorista = emailMotorista;
    }

    public String getSenhaMotorista() {
        return senhaMotorista;
    }

    public void setSenhaMotorista(String senhaMotorista) {
        this.senhaMotorista = senhaMotorista;
    }

    public Date getDataNascimentoMotorista() {
        return dataNascimentoMotorista;
    }

    public void setDataNascimentoMotorista(Date dataNascimentoMotorista) {
        this.dataNascimentoMotorista = dataNascimentoMotorista;
    }

    public Character getSexoMotorista() {
        return sexoMotorista;
    }

    public void setSexoMotorista(Character sexoMotorista) {
        this.sexoMotorista = sexoMotorista;
    }

    public String getCpfMotorista() {
        return cpfMotorista;
    }

    public void setCpfMotorista(String cpfMotorista) {
        this.cpfMotorista = cpfMotorista;
    }

    public String getCarteiraMotorista() {
        return carteiraMotorista;
    }

    public void setCarteiraMotorista(String carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public Date getDataCadastroMotorista() {
        return dataCadastroMotorista;
    }

    public void setDataCadastroMotorista(Date dataCadastroMotorista) {
        this.dataCadastroMotorista = dataCadastroMotorista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorista motorista = (Motorista) o;
        return idMotorista == motorista.idMotorista &&
                Objects.equals(nomeMotorista, motorista.nomeMotorista) &&
                Objects.equals(emailMotorista, motorista.emailMotorista) &&
                Objects.equals(senhaMotorista, motorista.senhaMotorista) &&
                Objects.equals(dataNascimentoMotorista, motorista.dataNascimentoMotorista) &&
                Objects.equals(sexoMotorista, motorista.sexoMotorista) &&
                Objects.equals(cpfMotorista, motorista.cpfMotorista) &&
                Objects.equals(carteiraMotorista, motorista.carteiraMotorista) &&
                Objects.equals(veiculo, motorista.veiculo) &&
                Objects.equals(dataCadastroMotorista, motorista.dataCadastroMotorista);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idMotorista, nomeMotorista, emailMotorista, senhaMotorista, dataNascimentoMotorista, sexoMotorista, cpfMotorista, carteiraMotorista, veiculo, dataCadastroMotorista);
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "idMotorista=" + idMotorista +
                ", nomeMotorista='" + nomeMotorista + '\'' +
                ", emailMotorista='" + emailMotorista + '\'' +
                ", senhaMotorista='" + senhaMotorista + '\'' +
                ", dataNascimentoMotorista=" + dataNascimentoMotorista +
                ", sexoMotorista=" + sexoMotorista +
                ", cpfMotorista='" + cpfMotorista + '\'' +
                ", carteiraMotorista='" + carteiraMotorista + '\'' +
                ", veiculo='" + veiculo + '\'' +
                ", dataCadastroMotorista=" + dataCadastroMotorista +
                '}';
    }
}
