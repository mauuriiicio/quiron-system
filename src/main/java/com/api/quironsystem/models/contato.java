package com.api.quironsystem.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_CONTATO")
public class contato implements Serializable {
    private static final long serialVersionVID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column ( nullable = false, unique = true, length = 30)
    private int  cont_tel;
    @Column ( nullable = false, unique = true, length = 30)
    private int  cont_clr;
    @Column ( nullable = false, unique = true, length = 50)
    private String cont_email;

    @Table(name = "TB_endereco")
    public class endereco  implements Serializable {
        private static final long serialVersionVID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID id;
        @Column (nullable = false, length = 10)
        private int numero_casa;
        @Column (nullable = false, length = 10)
        private String end_municipio;

        @Table(name = "TB_endereco")
        public class endereco  implements Serializable {
            private static final long serialVersionVID = 1L;
            @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            private UUID id;
            @Column (nullable = false, length = 10)
            private int numero_casa;
            @Column (nullable = false, length = 10)
            private String end_municipio;



        }

}

