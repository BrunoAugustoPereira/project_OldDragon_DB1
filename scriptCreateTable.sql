CREATE SEQUENCE public.jogador_id_seq;

ALTER SEQUENCE public.jogador_id_seq
    OWNER TO postgres;
    
CREATE SEQUENCE public.mestre_id_seq;

ALTER SEQUENCE public.mestre_id_seq
    OWNER TO postgres;
    
CREATE SEQUENCE public.classe_id_seq;

ALTER SEQUENCE public.classe_id_seq
    OWNER TO postgres;
	
CREATE SEQUENCE public.idioma_id_seq;

ALTER SEQUENCE public.idioma_id_seq
    OWNER TO postgres;
	
CREATE SEQUENCE public.raca_id_seq;

ALTER SEQUENCE public.raca_id_seq
    OWNER TO postgres;
	
CREATE SEQUENCE public.arma_id_seq;

ALTER SEQUENCE public.arma_id_seq
    OWNER TO postgres;
	
CREATE SEQUENCE public.personagem_id_seq;

ALTER SEQUENCE public.personagem_id_seq
    OWNER TO postgres;

-- Table: public.jogador

-- DROP TABLE public.jogador;

CREATE TABLE public.jogador
(
    id integer NOT NULL DEFAULT nextval('jogador_id_seq'::regclass),
    nome character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "Jogador_pkey" PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.jogador
    OWNER to postgres;


-- Table: public.mestre

-- DROP TABLE public.mestre;

CREATE TABLE public.mestre
(
    id integer NOT NULL DEFAULT nextval('mestre_id_seq'::regclass),
    nome character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT mestre_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.mestre
    OWNER to postgres;
	
-- Table: public.classe

-- DROP TABLE public.classe;

CREATE TABLE public.classe
(
    id integer NOT NULL DEFAULT nextval('classe_id_seq'::regclass),
    nome character varying COLLATE pg_catalog."default" NOT NULL,
    dado_de_vida character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT classe_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.classe
    OWNER to postgres;

-- Table: public.idioma

-- DROP TABLE public.idioma;

CREATE TABLE public.idioma
(
    id integer NOT NULL DEFAULT nextval('idioma_id_seq'::regclass),
    nome character varying COLLATE pg_catalog."default",
    CONSTRAINT idioma_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.idioma
    OWNER to postgres;


-- Table: public.raca

-- DROP TABLE public.raca;

CREATE TABLE public.raca
(
    id integer NOT NULL DEFAULT nextval('raca_id_seq'::regclass),
    nome character varying COLLATE pg_catalog."default" NOT NULL,
    tamanho_usual integer,
    idade_maturidade integer,
    expectativa_de_vida character varying COLLATE pg_catalog."default",
    movimentacao_base integer NOT NULL,
    id_idioma integer NOT NULL,
    CONSTRAINT raca_pkey PRIMARY KEY (id),
    CONSTRAINT "raca_id_idioma_FK" FOREIGN KEY (id_idioma)
        REFERENCES public.idioma (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.raca
    OWNER to postgres;


-- Table: public.arma

-- DROP TABLE public.arma;

CREATE TABLE public.arma
(
    id integer NOT NULL DEFAULT nextval('arma_id_seq'::regclass),
    nome character varying COLLATE pg_catalog."default" NOT NULL,
    tipo_de_dano character varying COLLATE pg_catalog."default",
    tamanho character varying COLLATE pg_catalog."default",
    alcance character varying COLLATE pg_catalog."default",
    preco integer,
    dano character varying COLLATE pg_catalog."default",
    peso integer,
    chance_de_critico integer,
    CONSTRAINT arma_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.arma
    OWNER to postgres;


-- Table: public.personagem

-- DROP TABLE public.personagem;

CREATE TABLE public.personagem
(
    id integer NOT NULL DEFAULT nextval('personagem_id_seq'::regclass),
    nome character varying COLLATE pg_catalog."default" NOT NULL,
    nivel integer NOT NULL,
    alinhamento character varying COLLATE pg_catalog."default",
    idade integer,
    tamanho integer,
    forca integer NOT NULL,
    destreza integer NOT NULL,
    constituicao integer NOT NULL,
    sabedoria integer NOT NULL,
    carisma integer NOT NULL,
    inteligencia integer NOT NULL,
    raca integer NOT NULL,
    classe integer NOT NULL,
    jogador integer,
    mestre integer NOT NULL,
    CONSTRAINT personagem_pkey PRIMARY KEY (id),
    CONSTRAINT personagem_id_classe FOREIGN KEY (classe)
        REFERENCES public.classe (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT personagem_id_jogador_fk FOREIGN KEY (jogador)
        REFERENCES public.jogador (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT personagem_id_mestre_fk FOREIGN KEY (mestre)
        REFERENCES public.mestre (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT personagem_id_raca_fk FOREIGN KEY (raca)
        REFERENCES public.raca (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.personagem
    OWNER to postgres;


-- Table: public.arsenal_personagem

-- DROP TABLE public.arsenal_personagem;

CREATE TABLE public.arsenal_personagem
(
    id_personagem integer NOT NULL,
    arma integer NOT NULL,
    CONSTRAINT arsenal_personagem_pkey PRIMARY KEY (id_personagem, arma),
    CONSTRAINT arma_id_arma_fk FOREIGN KEY (arma)
        REFERENCES public.arma (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT id_personagem_id_personagem_fk FOREIGN KEY (id_personagem)
        REFERENCES public.personagem (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.arsenal_personagem
    OWNER to postgres;


-- Table: public.idioma_personagem

-- DROP TABLE public.idioma_personagem;

CREATE TABLE public.idioma_personagem
(
    id_personagem integer NOT NULL,
    id_idioma integer NOT NULL,
    CONSTRAINT idioma_personagem_pkey PRIMARY KEY (id_personagem, id_idioma),
    CONSTRAINT id_personagem_id_personagem_fk FOREIGN KEY (id_personagem)
        REFERENCES public.personagem (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT idioma_id_idioma_fk FOREIGN KEY (id_idioma)
        REFERENCES public.idioma (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.idioma_personagem
    OWNER to postgres;

