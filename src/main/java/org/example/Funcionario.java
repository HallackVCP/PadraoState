package org.example;

public class Funcionario {

    private String nome;

    private FuncionarioState funcionarioState;

    public Funcionario(FuncionarioState funcionarioState) {
        this.funcionarioState = funcionarioState;
    }
    public Funcionario() {
        this.funcionarioState = FuncionarioStateAlocado.getInstance();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioState getFuncionarioState() {
        return funcionarioState;
    }

    public void setFuncionarioState(FuncionarioState funcionarioState) {
        this.funcionarioState = funcionarioState;
    }

    public boolean alocar(){
        return this.funcionarioState.alocar(this);
    }

    public boolean iniciarFerias(){
        return this.funcionarioState.iniciarFerias(this);
    }

    public boolean folgar(){
        return this.funcionarioState.folgar(this);
    }

    public boolean desligar(){
        return this.funcionarioState.desligar(this);
    }

    public boolean ocioso(){
        return this.funcionarioState.ocioso(this);
    }
}
