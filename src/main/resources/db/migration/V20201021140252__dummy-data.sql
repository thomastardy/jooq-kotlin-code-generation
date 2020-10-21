CREATE TABLE dummy_data
(
    id                 BIGSERIAL                              NOT NULL,
    numbers            BIGINT[],
    strings            VARCHAR[],
    deleted            BOOLEAN                  DEFAULT false NOT NULL,
    created_by         VARCHAR(200)                           NOT NULL,
    created_date       TIMESTAMP WITH TIME ZONE DEFAULT now() NOT NULL,
    last_modified_by   VARCHAR(200),
    last_modified_date TIMESTAMP WITH TIME ZONE DEFAULT now(),
    PRIMARY KEY (id)
);
