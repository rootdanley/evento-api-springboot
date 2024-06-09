package br.com.danley.eventosapi.domain.model;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tb_participante")
public class Participante {


   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String nome;

   @Column(unique = true)
   private String email;

   @ManyToMany
   @JoinTable(
       name = "participante_atividade",
       joinColumns = @JoinColumn(name = "participante_id"),
       inverseJoinColumns = @JoinColumn(name = "atividade_id")
   )
   private Set<Atividade> atividades;
}
