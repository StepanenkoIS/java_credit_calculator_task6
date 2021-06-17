-- Table: public.userentity

-- DROP TABLE public.userentity;

CREATE TABLE public.userentity
(
    login       text COLLATE pg_catalog."default" NOT NULL,
    password    text COLLATE pg_catalog."default" NOT NULL,
    role        text COLLATE pg_catalog."default" NOT NULL,
    second_name text COLLATE pg_catalog."default" NOT NULL,
    first_name  text COLLATE pg_catalog."default" NOT NULL,
    middle_name text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT userentity_pkey PRIMARY KEY (login)
)
    TABLESPACE pg_default;

ALTER TABLE public.userentity OWNER to postgres;

COMMENT ON TABLE public.userentity
    IS 'Содержит логины и пароли пользователей';