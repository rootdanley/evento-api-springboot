package br.com.danley.eventosapi.domain.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_categoria")
public class Categoria {


   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   @Column(columnDefinition = "TEXT")
   private String descricao;

   @OneToMany(mappedBy = "categoria")
   List<Atividade> atividades = new ArrayList<>();

   public Categoria(Integer id, String descricao) {
      this.id = id;
      this.descricao = descricao;
   }

   public Categoria() { }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public List<Atividade> getAtividades() {
      return atividades;
   }


   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Categoria categoria)) return false;

      return Objects.equals(id, categoria.id);
   }

   @Override
   public int hashCode() {
      return id != null ? id.hashCode() : 0;
   }
}
