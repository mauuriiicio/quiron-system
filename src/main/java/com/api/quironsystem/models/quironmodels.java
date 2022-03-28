package com.api.quironsystem.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table( name = "TB_QUIRONSYSTEM")
public class quironmodels implements Serializable {
    private static  final long serialVersionVID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true , length = 50  )
    private String nomedopaciente;
    @Column(nullable = false, unique = true , length =  50  )
    private String datanascimento;
    @Column( nullable = false , length = 15)
    private  String tiposang;




}
