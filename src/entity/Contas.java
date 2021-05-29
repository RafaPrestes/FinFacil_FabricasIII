/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Usuário
 */
@Entity
public class Contas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "dataVencimento")
    private String dataVenc;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "valor")
    private float valor;
    @ManyToOne
    @JoinColumn(name = "categoriaContas_id")
    private Categoria categoriaContas;

    public Contas() {
    }

    public Contas(int id, String tipo, String dataVenc, String descricao, float valor, Categoria categoriaContas) {
        this.id = id;
        this.tipo = tipo;
        this.dataVenc = dataVenc;
        this.descricao = descricao;
        this.valor = valor;
        this.categoriaContas = categoriaContas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(String dataVenc) {
        this.dataVenc = dataVenc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Categoria getCategoriaContas() {
        return categoriaContas;
    }

    public void setCategoriaContas(Categoria categoriaContas) {
        this.categoriaContas = categoriaContas;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contas)) {
            return false;
        }
        Contas other = (Contas) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Contas[ id=" + id + " ]";
    }
    
}
