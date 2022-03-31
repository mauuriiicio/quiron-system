package com.api.quironsystem.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table( name = "TB_PACIENTE")
public class quironmodels implements Serializable {
    private static final long serialVersionVID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 50)
    private String nomedopaciente;
    @Column(nullable = false, unique = true, length = 50)
    private String datanascimento;
    @Column(nullable = false, length = 15)
    private String tiposang;
    @Column(nullable = false, length = 200)
    private String endereco;
    @Column(nullable = false, length = 15)
    private String contato;
    @Column(nullable = false, length = 50)
    private String cns;

    @Table(name = "TB_CONTATO")
    public class contato implements Serializable {
        private static final long serialVersionVID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID id;
        @Column(nullable = false, unique = true, length = 30)
        private int cont_tel;
        @Column(nullable = false, unique = true, length = 30)
        private int cont_clr;
        @Column(nullable = false, unique = true, length = 50)
        private String cont_email;

    }
    @Table(name = "TB_endereco")
    public class endereco  implements Serializable {
        private static final long serialVersionVID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID id;
        @Column(nullable = false, length = 10)
        private int numero_casa;
        @Column(nullable = false, length = 10)
        private String end_municipio;

    }
    @Table(name = "TB_HISTcomorb")
    public class histcomorbi  implements Serializable {
        private static final long serialVersionVID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID id;
        @Column(nullable = false, length = 500)
        private String hist_comorb;
        @Column(nullable = false, length = 100)
        private String uso_de_medica;
        @Column(nullable = false, length = 100)
        private String alergia;
    }
    @Table(name = "TB_ENTRADAMED")
    public class entradamed  implements Serializable {
        private static final long serialVersionVID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID id;
        @Column(nullable = false, length = 15)
        private String data;
        @Column(nullable = false, length = 10)
        private String presccricao;
        @Column(nullable = false, length = 20)
        private String horario;
        @Column(nullable = false, length = 500)
        private String evolucao_med;

    }
}



