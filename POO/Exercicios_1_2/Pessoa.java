package POO.Exercicios_1_2;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private int numeroFavorito;
    private boolean temCarteiraMotorista;
    private LocalDate dataNascimento;

    public static void main(String[] args) {
        Pessoa Ericlis = new Pessoa(
                "Ericlis",
                "123456789-70",
                "ericlis.goncalves@auditeste.com.br",
                17,
                true,
                LocalDate.of(1995,  11, 05)

        );
        System.out.println(Ericlis.toString());
    }
    public Pessoa(String nome, String cpf, String email, int numeroFavorito, boolean temCarteiraMotorista, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.numeroFavorito = numeroFavorito;
        this.temCarteiraMotorista = temCarteiraMotorista;
        this.dataNascimento = dataNascimento;
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", numeroFavorito=" + numeroFavorito +
                ", temCarteiraMotorista=" + temCarteiraMotorista +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getNumeroFavorito() {
        return numeroFavorito;
    }
    public void setNumeroFavorito(int numeroFavorito) {
        this.numeroFavorito = numeroFavorito;
    }
    public boolean isTemCarteiraMotorista() {
        return temCarteiraMotorista;
    }
    public void setTemCarteiraMotorista(boolean temCarteiraMotorista) {
        this.temCarteiraMotorista = temCarteiraMotorista;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}