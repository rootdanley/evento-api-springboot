package br.com.danley.eventosys.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

   private Integer id;
   private String descricao;


}
