package model;

import java.util.HashMap;
import java.util.Map;

public class Regiao {
    private ERegiaoNome nome;
    private boolean dominada;

    public Regiao(ERegiaoNome nome) {
        this.nome = nome;
        this.dominada = false;
    }

    public ERegiaoNome getRegiaoNome() {
        return nome;
    }
    
    public void setDominada() {
    	this.dominada = true;
    }
}