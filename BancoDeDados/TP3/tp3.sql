CREATE DATABASE TP_03;
GO

USE TP_03;
GO

-- 1) Crie uma tabela chamada notas com a seguinte estrutura:

CREATE TABLE notas (
  matricula char(6) NOT NULL,
  cd_disciplina INTEGER NOT NULL,
  media FLOAT NULL
)

-- 2) Adicione uma restrição de maneira que só possam ser inseridas médias na faixa de 0 a 10

ALTER TABLE 
  notas
ADD CONSTRAINT ck_notas
  CHECK(media BETWEEN 0 AND 10) 


-- 3) Tente inserir uma linha com as seguintes informações (‘416969’,1,11) O que aconteceu? Por quê?

INSERT INTO notas (matricula, cd_disciplina, media)
VALUES ('416969', 1, 11)

/* 
  Isto retorna o erro: 
    The INSERT statement conflicted with the CHECK constraint "ck_notas". 
    The conflict occurred in database "TP_03", table "dbo.notas", column 'media'.
  Explicação: 
    Isto ocorre devido a existência da constraint "check", 
    ela impede que sejam inseridos valores que extrapolem a faixa de
    valores permitidos para o campo, neste caso: 0 - 10 
*/

-- 4) Exclua a restrição criada no item 2

ALTER TABLE 
  notas
DROP CONSTRAINT ck_notas

-- 5) Tente novamente o item 3

INSERT INTO notas (matricula, cd_disciplina, media)
VALUES ('416969', 1, 11)

-- 6) Adicione novamente a restrição do item 2. O que aconteceu? Por quê?

ALTER TABLE 
  notas
ADD CONSTRAINT ck_notas
  CHECK(media BETWEEN 0 AND 10) 

/* 
  Isto retorna o erro: 
    The ALTER TABLE statement conflicted with the CHECK constraint "ck_notas". 
    The conflict occurred in database "TP_03", table "dbo.notas", column 'media'.
  Explicação: 
    Isto ocorre devido a existência da tuplas com valores que não atendem 
    a validação da constraint a ser inserida, esta  trava impede que a 
    constraint seja adicionada enquanto existirem estes registros, 
    para garantir a integridade da tabela.
*/

-- 7) Exclua e recrie a tabela notas estabelecendo a restrição do valor da nota (0 a 10) no momento da criação

DROP TABLE notas;
GO

CREATE TABLE notas (
  matricula char(6) NOT NULL,
  cd_disciplina INTEGER NOT NULL,
  media FLOAT NULL,

  CONSTRAINT pk_notas 
  PRIMARY KEY(matricula),
  
  CONSTRAINT ck_notas 
  CHECK(media BETWEEN 0 AND 10) 
)

-- 8) Tente inserir uma linha com as seguintes informações (‘416969’,1,null) O que aconteceu? Por quê?

INSERT INTO notas (matricula, cd_disciplina, media)
VALUES ('416969', 1, 11)

/* 
  Isto retorna o erro: 
    The INSERT statement conflicted with the CHECK constraint "ck_notas". 
    The conflict occurred in database "TP_03", table "dbo.notas", column 'media'.
  Explicação: 
    Semelhante a execução no item 3, a constraint check já está presente na tabela
    afetando a coluna media, logo, a inserção será impedida, a fim de garantir 
    a integridade da tabela.
*/

-- 9) Crie uma tabela chamada funcionario com a seguinte estrutura:

CREATE TABLE funcionario(
  cd_funcionario INTEGER NOT NULL IDENTITY,
  nm_funcionario VARCHAR(50),
  sexo CHAR(1),
  dt_nascimento SMALLDATETIME,
  dt_admissao SMALLDATETIME, 
  vl_salario DECIMAL(19,4),

  CONSTRAINT pk_funcionario PRIMARY KEY(cd_funcionario)
)

-- 10) Garanta a integridade da tabela de funcionários estabelecendo as seguintes restrições:

-- a. O sexo só pode ser F ou M
-- b. A data de nascimento tem que ser anterior a data de admissão
-- c. O valor do salário deve ser um numero positivo

ALTER TABLE funcionario
ADD 
  CONSTRAINT ck_sexo CHECK(sexo in ('F', 'M')),
  CONSTRAINT ck_dt_nascimento CHECK(dt_nascimento < dt_admissao),
  CONSTRAINT ck_salario CHECK(vl_salario > 0)

-- 11) Verifique se suas restrições estão funcionando tentando inserir linhas com valores inválidos.

INSERT INTO funcionario (
  nm_funcionario, sexo, dt_nascimento, dt_admissao, vl_salario
)
VALUES
  ('nome_01', 'X', '20001231 00:00:00', '20201001 00:00:00', 4000),
  ('nome_02', 'X', '20301001 00:00:00', '20201001 00:00:00', 4000),
  ('nome_03', 'X', '20211001 00:00:00', '20201001 00:00:00', -200),
  ('nome_04', 'X', '20001231 00:00:00', '20201001 00:00:00', 0),
  ('nome_05', 'M', '20201101 00:00:00', '20201001 00:00:00', 4000),
  ('nome_06', 'F', '20780101 00:00:00', '20201001 00:00:00', -210),
  ('nome_07', 'F', '20001231 00:00:00', '20201001 00:00:00', -9001)