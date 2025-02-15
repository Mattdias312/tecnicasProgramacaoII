
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) 
VALUES (1, 'Jo�o da Silva', 'Rua das Palmeiras, 10', '10', 'Apto 101', 'Centro', 'S�o Paulo', 'SP', '01010000', '(11)9999-9999', '12345678909', '20-05-1985 00:00:00.000', NULL);

INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) 
VALUES (2, 'Maria Oliveira', 'Avenida Brasil, 20', '20', NULL, 'Jardim S�o Paulo', 'S�o Paulo', 'SP', '02020000', '(11)8888-8888', '98765432100', '15-03-1990 00:00:00', NULL);

INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) 
VALUES (3, 'Carlos Pereira', 'Rua do Lago, 30', '30', 'Casa 5', 'Vila das Flores', 'S�o Paulo', 'SP', '03030000', '(11)7777-7777', '45678912300', '10-12-1988 00:00:00', NULL);

INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) 
VALUES (4, 'Ana Costa', 'Avenida das �rvores, 40', '40', 'Bloco A', 'Vila Mariana', 'S�o Paulo', 'SP', '04040000', '(11)6666-6666', '32132132100', '25-07-1995 00:00:00', NULL);

INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) 
VALUES (5, 'Fernando Santos', 'Rua do Sol, 50', '50', NULL, 'Pinheiros', 'S�o Paulo', 'SP', '05050000', '(11)5555-5555', '65498712300', '05-11-1982 00:00:00', NULL);


INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) 
VALUES (101, 'Ag�ncia Central', 'Av. Paulista, 100', '100', 'Sala 2', 'Centro', 'S�o Paulo', 'SP', '01311000', '(11)1234-5678');

INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) 
VALUES (102, 'Ag�ncia Norte', 'Rua da Esperan�a, 200', '200', NULL, 'Vila Nova', 'S�o Paulo', 'SP', '02222000', '(11)2345-6789');

INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) 
VALUES (103, 'Ag�ncia Sul', 'Rua do Sol, 300', '300', 'Pr�ximo ao parque', 'Jardim das Flores', 'S�o Paulo', 'SP', '03333000', '(11)3456-7890');

INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) 
VALUES (104, 'Ag�ncia Leste', 'Av. dos Estados, 400', '400', 'Bloco 1', 'S�o Miguel', 'S�o Paulo', 'SP', '04444000', '(11)4567-8901');

INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) 
VALUES (105, 'Ag�ncia Oeste', 'Rua do Com�rcio, 500', '500', NULL, 'Pinheiros', 'S�o Paulo', 'SP', '05555000', '(11)5678-9012');


INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES (1, 'Abertura de Conta');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES (2, 'Dep�sito');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES (3, 'Saque');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES (4, 'Transfer�ncia');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES (5, 'Fechamento de Conta');

INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES (101, 1000000001, 1, 1500.00);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES (102, 1000000002, 2, 2500.50);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES (103, 1000000003, 3, 3200.75);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES (104, 1000000004, 4, 400.00);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES (105, 1000000005, 5, 9000.00);


INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES ('usuario1', 'senha123', 101, 1000000001);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES ('usuario2', 'senha456', 102, 1000000002);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES ('usuario3', 'senha789', 103, 1000000003);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES ('usuario4', 'senha101', 104, 1000000004);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES ('usuario5', 'senha202', 105, 1000000005);