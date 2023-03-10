/*

    Test Database
    Stored on pgAdmin 4
    User : rulebook
    Database : See
    application.properties

 */
ALTER USER rulebook WITH PASSWORD 'password';

DROP TABLE IF EXISTS RELEASE_ CASCADE;
DROP TABLE IF EXISTS STRUCTURE_VERSION CASCADE;

/*-----------------------------------------------------------------------------------------------*/
CREATE TABLE IF NOT EXISTS RELEASE_
(
    RELEASE_ID                VARCHAR(36) NOT NULL,
    DATA_                     TEXT, /* CLOB eq. in postgres dialect */
    STARTING_DATE             TIMESTAMP   NOT NULL,
    RULEBOOK_COMPILED_BY      VARCHAR(10) NOT NULL,
    RULEBOOK_COMPILED_TIME    TIMESTAMP   NOT NULL,
    RULEBOOK_VALIDATED_BY     VARCHAR(10),
    RULEBOOK_VALIDATED_TIME   TIMESTAMP,
    START_DATE_MODIFIED_BY    VARCHAR(10) NOT NULL,
    START_DATE_MODIFIED_TIME  TIMESTAMP   NOT NULL,
    START_DATE_VALIDATED_BY   VARCHAR(10),
    START_DATE_VALIDATED_TIME TIMESTAMP,
    MADE_ACTIVE_BY            VARCHAR(10),
    MADE_ACTIVE_TIME          TIMESTAMP,
    PUT_IN_HISTORIC_BY        VARCHAR(10),
    PUT_IN_HISTORIC_TIME      TIMESTAMP,
    STRUCTURE_VERSION         INTEGER     NOT NULL
);
/*-----------CONSTRAINT-----------------
CONSTRAINT PK_RELEASE_ID PRIMARY KEY (RELEASE_ID)
--------------------------------------*/

/*-----------------------------CONSTRAINT TO EXECUTE AFTER ALL THE REST----------------------------
ALTER TABLE RELEASE_
ADD CONSTRAINT FK_STRUCTURE_VERSION FOREIGN KEY (STRUCTURE_VERSION) REFERENCES STRUCTURE_VERSION (STRUCTURE_ID);
-------------------------------------------------------------------------------------------------*/

/*-----------------------------------------------------------------------------------------------*/
CREATE TABLE IF NOT EXISTS STRUCTURE_VERSION
(
    STRUCTURE_ID   INTEGER NOT NULL,
    DATA_          TEXT,
    ACTUAL_RELEASE VARCHAR(36)
);
    /* FUTURE_RELEASE VARCHAR(36), */
    /*-----------CONSTRAINT-----------------
    CONSTRAINT PK_STRUCTURE_ID PRIMARY KEY (STRUCTURE_ID),
    CONSTRAINT FK_ACTUAL FOREIGN KEY (ACTUAL_RELEASE) REFERENCES RELEASE_ (RELEASE_ID)
--------------------------------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------------------------*/

INSERT INTO RELEASE_ (RELEASE_ID, DATA_, STARTING_DATE, RULEBOOK_COMPILED_BY, RULEBOOK_COMPILED_TIME,
                      START_DATE_MODIFIED_BY, START_DATE_MODIFIED_TIME, STRUCTURE_VERSION)
VALUES ('1', 'This is some test data in a CLOB field IN RELEASE TABLE.', now(), 'user', now(), 'user', now(), 1);

INSERT INTO RELEASE_ (RELEASE_ID, DATA_, STARTING_DATE, RULEBOOK_COMPILED_BY, RULEBOOK_COMPILED_TIME,
                      START_DATE_MODIFIED_BY, START_DATE_MODIFIED_TIME, STRUCTURE_VERSION)
VALUES ('2', 'It didnt make sense unless you had the power to eat colors. Peter found road kill an excellent way to save money on dinner.', now(), 'user', now(), 'user', now(), 1);

INSERT INTO RELEASE_ (RELEASE_ID, DATA_, STARTING_DATE, RULEBOOK_COMPILED_BY, RULEBOOK_COMPILED_TIME,
                      START_DATE_MODIFIED_BY, START_DATE_MODIFIED_TIME, STRUCTURE_VERSION)
VALUES ('3', 'She was too short to see over the fence. We have a lot of rain in June.', now(), 'user', now(), 'user', now(), 1);

INSERT INTO RELEASE_ (RELEASE_ID, DATA_, STARTING_DATE, RULEBOOK_COMPILED_BY, RULEBOOK_COMPILED_TIME,
                      START_DATE_MODIFIED_BY, START_DATE_MODIFIED_TIME, STRUCTURE_VERSION)
VALUES ('4', 'It took him a while to realize that everything he decided not to change, he was actually choosing. She wanted to be rescued, but only if it was Tuesday and raining.', now(), 'user', now(), 'user', now(), 2);

INSERT INTO RELEASE_ (RELEASE_ID, DATA_, STARTING_DATE, RULEBOOK_COMPILED_BY, RULEBOOK_COMPILED_TIME,
                      START_DATE_MODIFIED_BY, START_DATE_MODIFIED_TIME, STRUCTURE_VERSION)
VALUES ('5', 'There are no heroes in a punk rock band.', now(), 'user', now(), 'user', now(), 2);

/*-----------------------------------------------------------------------------------------------*/

INSERT INTO STRUCTURE_VERSION (STRUCTURE_ID, DATA_, ACTUAL_RELEASE)
VALUES (1, 'This is some test data in a TEXT field.', '3');

INSERT INTO STRUCTURE_VERSION (STRUCTURE_ID, DATA_)
VALUES (2, 'This is second test data in a TEXT field.');

INSERT INTO STRUCTURE_VERSION (STRUCTURE_ID, DATA_)
VALUES (3, 'This is third test data in a TEXT field.');

