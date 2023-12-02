-- liquibase formatted sql
-- changeset myname:'create-multiple-tables' splitStatements:true endDelimiter:;

CREATE TABLE TB_ASSOCIATES
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    name       VARCHAR(255) NULL,
    identifier VARCHAR(255) NULL,
    type       SMALLINT     NULL
);


CREATE TABLE TB_GUIDELINES
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(255) NULL,
    dateCreate  DATETIME     NOT NULL
);

CREATE TABLE TB_VOTE_SESSIONS
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    date_create   DATETIME NOT NULL,
    time_open     INT      NOT NULL,
    favorable     BIT(1)   NOT NULL,
    associate_id  INT      NOT NULL,
    guidelines_id INT      NOT NULL,
    CONSTRAINT FK_TB_VOTE_SESSIONS_ON_ASSOCIATE FOREIGN KEY (associate_id) REFERENCES TB_ASSOCIATES (id),
    CONSTRAINT FK_TB_VOTE_SESSIONS_ON_GUIDELINES FOREIGN KEY (guidelines_id) REFERENCES TB_GUIDELINES (id)
);

CREATE TABLE TB_RESULT
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    approved     BIT(1) NOT NULL,
    guideline_id INT    NOT NULL,
    CONSTRAINT FK_TB_RESULT_ON_GUIDELINE FOREIGN KEY (guideline_id) REFERENCES TB_GUIDELINES (id)
);

