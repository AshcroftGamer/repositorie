package com.rains.repositorie.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "marca")
public class MarcaModel {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nome")
    private String nome;

    @OneToOne
    @JoinColumn(name ="id_pk_marca_detalhe")
    private DetalheMarcaModel detalhe2;


}
