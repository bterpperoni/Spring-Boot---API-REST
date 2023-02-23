/*

    Test Database
    Stored on pgAdmin 4
    User : rulebook
    Database : See application.properties

 */
ALTER USER rulebook WITH PASSWORD 'password';

DROP TABLE IF EXISTS RELEASE_ CASCADE ;
DROP TABLE IF EXISTS STRUCTURE_VERSION CASCADE ;

CREATE TABLE IF NOT EXISTS RELEASE_(
        RELEASE_ID VARCHAR(36) NOT NULL,
        DATA_ TEXT, /* CLOB eq. in postgres dialect */
        STARTING_DATE TIMESTAMP,
        RULEBOOK_COMPILED_BY VARCHAR(10),
        RULEBOOK_COMPILED_TIME TIMESTAMP, 
        RULEBOOK_VALIDATED_BY VARCHAR(10),
        RULEBOOK_VALIDATED_TIME TIMESTAMP,
        START_DATE_MODIFIED_BY VARCHAR(10) NOT NULL,
        START_DATE_MODIFIED_TIME TIMESTAMP NOT NULL,   
        START_DATE_VALIDATED_BY VARCHAR(10) NOT NULL,
        START_DATE_VALIDATED_TIME TIMESTAMP NOT NULL,
        MADE_ACTIVE_BY VARCHAR(10) NOT NULL,
        MADE_ACTIVE_TIME TIMESTAMP NOT NULL,
        PUT_IN_HISTORIC_BY VARCHAR(10) NOT NULL,
        PUT_IN_HISTORIC_TIME TIMESTAMP NOT NULL,
        STRUCTURE_VERSION INTEGER NOT NULL,
        /*-----------CONSTRAINT-----------------*/
        CONSTRAINT PK_RELEASE_ID PRIMARY KEY (RELEASE_ID)
        /*--------------------------------------*/
    );
        
/*-----------------------------------------------------------------------------------------------*/
CREATE TABLE IF NOT EXISTS STRUCTURE_VERSION(
    STRUCTURE_ID INTEGER NOT NULL,
    DATA_ TEXT,
    ACTUAL_RELEASE VARCHAR(36),
    /* FUTURE_RELEASE VARCHAR(36), */
    /*-----------CONSTRAINT-----------------*/
    CONSTRAINT PK_STRUCTURE_ID PRIMARY KEY (STRUCTURE_ID),
    CONSTRAINT FK_ACTUAL FOREIGN KEY (ACTUAL_RELEASE) REFERENCES RELEASE_(RELEASE_ID)
    /*--------------------------------------*/
    );

/*--------------------------------NonNull data to delete for the actual release /!\---------------------------------------------------------------*/

INSERT INTO RELEASE_ (RELEASE_ID, DATA_, STARTING_DATE, RULEBOOK_COMPILED_BY, RULEBOOK_COMPILED_TIME, RULEBOOK_VALIDATED_BY,
                      RULEBOOK_VALIDATED_TIME, START_DATE_MODIFIED_BY, START_DATE_MODIFIED_TIME, START_DATE_VALIDATED_BY,
                      START_DATE_VALIDATED_TIME, MADE_ACTIVE_BY, MADE_ACTIVE_TIME, PUT_IN_HISTORIC_BY, PUT_IN_HISTORIC_TIME,
                      STRUCTURE_VERSION)
VALUES ('1234', 'This is some test data in a CLOB field.', '2023-02-20 09:00:00', 'user1', '2023-02-19 12:34:56', 'user2',
        '2023-02-19 13:45:00', 'user3', '2023-02-20 08:30:00', 'user4', '2023-02-20 08:45:00', 'user5', '2023-02-20 09:15:00',
        'user6', '2023-02-20 10:00:00', 1);

/*-----------------------------------------------------------------------------------------------*/

INSERT INTO STRUCTURE_VERSION (STRUCTURE_ID, DATA_, ACTUAL_RELEASE)
VALUES (1, 'This is some test data in a TEXT field.', '1234');

INSERT INTO STRUCTURE_VERSION (STRUCTURE_ID, DATA_)
VALUES (2, 'This is second test data in a TEXT field.');

/*-----------------------------------------------------------------------------------------------*/
ALTER TABLE RELEASE_ ADD CONSTRAINT FK_STRUCTURE_VERSION FOREIGN KEY (STRUCTURE_VERSION) REFERENCES STRUCTURE_VERSION(STRUCTURE_ID) ;
/*-----------------------------------------------------------------------------------------------*/