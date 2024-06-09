package br.com.danley.eventosapi.domain.model;


import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_atividade")
public class Atividade {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String nome;
   @Column(columnDefinition = "TEXT")
   private String descricao;
   private Double preco;

   @ManyToOne
   @JoinColumn(name = "categoria_id")
   private Categoria categoria;

   @OneToMany(mappedBy = "atividade", cascade = CascadeType.ALL)
   private List<Bloco> blocos;

   @ManyToMany(mappedBy = "atividades")
   private Set<Participante> participantes;
}
