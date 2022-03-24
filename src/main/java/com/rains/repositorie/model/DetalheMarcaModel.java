package com.rains.repositorie.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity

@Table(name = "detalhe")
public class DetalheMarcaModel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_detalhe;

    @Column(name = "fundador")
    private String fundador;
    @Column(name = "pais_origem")
    private String paisOrigem;


//   @OneToOne(mappedBy = "detalhe2",cascade = CascadeType.ALL)
//   private MarcaModel marca;


}
