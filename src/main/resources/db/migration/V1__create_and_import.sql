CREATE TABLE BOOK (
	ID BIGSERIAL,
	TITLE VARCHAR(64) NOT NULL,
	AUTHOR VARCHAR(64) NOT NULL,
	CONSTRAINT ID PRIMARY KEY (ID)
);

INSERT INTO BOOK (id, title, author) VALUES (100, 'Uma Breve História do Tempo', 'Stephen Hawking'); 
INSERT INTO BOOK (id, title, author) VALUES (101, 'Uma Comovente Obra de Espantoso Talento', 'Dave Eggers'); 
INSERT INTO BOOK (id, title, author) VALUES (102, 'Muito Longe de Casa', 'Ishmael Beah'); 
INSERT INTO BOOK (id, title, author) VALUES (103, 'Uma Dobra no Tempo', 'Madeleine L’Engle'); 
INSERT INTO BOOK (id, title, author) VALUES (104, 'Selected Stories, 1968-1994', 'Alice Munro'); 
INSERT INTO BOOK (id, title, author) VALUES (105, 'Abundância - o Futuro É Melhor do Que Você Imagina ', 'Kotler,Steven / Diamandis,Peter H.'); 
