package com.phsabreu.desafioCRUDdeClientes.dtos;

import com.phsabreu.desafioCRUDdeClientes.Entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;

    @NotBlank(message = "Campo de preenchimento obrigatório.")
    @Size(min = 3, max = 100, message = "Nome precisa possuir de 3 a 100 caracteres.")
    private String name;

    @NotBlank(message = "Campo de preenchimento obrigatório.")
    @Size(min = 10, max = 10, message = "Campo deve conter 10 caracteres.")
    private String cpf;

    @Positive(message = "Renda deve ser positiva.")
    @NotBlank(message = "Campo de preenchimeto obrigatório")
    private Double income;

    @NotBlank(message = "Campo de preenchimeto obrigatório")
    private LocalDate birthDay;

    @NotBlank(message = "Campo de preenchimeto obrigatório")
    private Integer children;

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDay, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDay = birthDay;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.cpf = entity.getCpf();
        this.income = entity.getIncome();
        this.birthDay = entity.getBirthDay();
        this.children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }
}
