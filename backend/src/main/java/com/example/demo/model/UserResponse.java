package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "responses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private char sexo;
    private String dataNascimento;
    private String ocupacao;

    @Override
    public String toString() {
        return "UserResponse{" +
                "Parabens, seu cadastro foi realizado com sucesso!" + '\'' +
                "Segue abaixo os dados cadastrados: " + '\'' +
                ", Nome: '" + nome + '\'' +
                ", CPF: '" + cpf + '\'' +
                ", Telefone: '" + telefone + '\'' +
                ", Email: '" + email + '\'' +
                ", Sexo: " + sexo +
                ", Data de Nascimento: '" + dataNascimento + '\'' +
                ", Ocupacao: '" + ocupacao + '\'' +
                '}';
    }
}
