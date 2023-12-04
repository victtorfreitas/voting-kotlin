-- liquibase formatted sql
-- changeset myname:'create-multiple-tables' splitStatements:true endDelimiter:;

CREATE TABLE tb_associates
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    name       VARCHAR(255) NOT NULL,
    identifier VARCHAR(255) NOT NULL,
    type       VARCHAR(4)   NOT NULL
);


CREATE TABLE tb_guidelines
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(255) NULL,
    date_create  DATETIME     NOT NULL
);

CREATE TABLE tb_sessions
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    date_create   DATETIME NOT NULL,
    time_open     INT      NOT NULL,
    guidelines_id INT      NOT NULL,
    CONSTRAINT FK_TB_VOTE_SESSIONS_ON_GUIDELINES FOREIGN KEY (guidelines_id) REFERENCES tb_guidelines (id)
);

CREATE TABLE tb_votes
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    date         DATETIME NOT NULL,
    favorable    BIT(1)   NOT NULL,
    associate_id INT      NOT NULL,
    session_id   INT      NOT NULL,
    CONSTRAINT FK_TB_VOTE_SESSIONS_ON_ASSOCIATE FOREIGN KEY (associate_id) REFERENCES tb_associates (id),
    CONSTRAINT FK_TB_VOTE_SESSIONS_ON_SESSIONS FOREIGN KEY (session_id) REFERENCES tb_sessions (id)
);

CREATE TABLE tb_results
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    approved    BIT(1) NOT NULL,
    sessions_id INT    NOT NULL,
    CONSTRAINT FK_TB_RESULT_ON_SESSIONS FOREIGN KEY (sessions_id) REFERENCES tb_sessions (id)
);