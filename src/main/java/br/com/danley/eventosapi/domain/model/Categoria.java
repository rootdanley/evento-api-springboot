package br.com.danley.eventosapi.domain.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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
}
