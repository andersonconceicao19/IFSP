USE dbTP_Insert_Delete_Update;
GO

 -- a  --
SELECT 
  *
FROM 
  CepBaixada
WHERE 
  Cidade = 'Santos'

-- b -- 
SELECT 
  *
FROM 
  CepBaixada
WHERE 
  Cidade = 'Santos' AND
  Bairro = 'Gonzaga'

-- c --
SELECT 
  *
FROM 
  CepBaixada
WHERE 
  Cidade = 'Santos' AND
  Bairro IN (
    'Gonzaga',
    'Centro',
    'Ponta da Praia',
    'Macuco'
  )

-- d --
SELECT 
  *
FROM 
  CepBaixada
WHERE 
  Cep > '11538-000' and 
  Cep < '11540-000'
ORDER BY
  Cep ASC

-- e --
SELECT 
  *
FROM 
  CepBaixada
WHERE 
  Cep BETWEEN '11538-000' and '11540-000'
ORDER BY
  Cep ASC

 --  f --
SELECT DISTINCT
  ISNULL(
    CepBaixada.tipo + '. ' + CepBaixada.Titulo + ' ' + CepBaixada.Nome,
    'Endereço incompleto'
  ) as EnderecoCompleto
FROM 
  CepBaixada
ORDER BY
  EnderecoCompleto ASC

-- g --
SELECT DISTINCT 
  Bairro, Cidade
FROM 
  CepBaixada

-- h --
SELECT 
  * 
FROM 
  CepBaixada
WHERE 
  Nome LIKE 'B%' OR
  Nome LIKE 'C%' OR
  Nome LIKE 'D%' 

-- i --
SELECT 
  * 
FROM 
  CepBaixada
WHERE 
  Nome LIKE 'B%' OR
  Nome LIKE 'E%' OR
  Nome LIKE 'F%' 

-- j --
SELECT 
  * 
FROM 
  CepBaixada
WHERE 
  Nome LIKE '_b_n%'

-- k --
SELECT 
  * 
FROM 
  CepBaixada
WHERE 
  Nome LIKE '%Campo%'

-- l --
SELECT 
  * 
FROM 
  CepBaixada
WHERE 
  Nome LIKE 'Campo%'

  -- m --
Select * from CepBaixada
where not Cidade in ('Santos', 'Cubatão', 'Cubatăo');

-- n --
Select * from CepBaixada
where Cidade in ('Santos', 'São Vicente') and Nome like '%centr%';

-- o -- 
Select GETDATE();

-- p --
Select MONTH(GETDATE());

-- q -- 
Select YEAR(GETDATE());

-- r -- 
Declare @nasc DATE;
Set @nasc = '2001-06-24';
Select (DATEDIFF(DAY, @nasc, GETDATE())) as 'Idade em dias';	

-- s --
Select (DATEDIFF(WEEK, @nasc, GETDATE())) as 'Idade em semanas';	

-- t --
Select (DATEDIFF(MINUTE, @nasc, GETDATE())) as 'Idade em minutos';

-- u -- 
Select GETDATE() - 34;

-- v -- 
Select GETDATE() + 120;

-- w --
Select DATEADD(MONTH, 4, GETDATE()) as 'Data após 4 meses';

-- x -- 
Select POWER(2,8);

-- y --
Declare @raio decimal;
Set @raio = 10;

Select (2 * PI() * @raio) as 'Circunferencia';

-- z -- 
Select POWER((Pi() * @raio), 2) as 'Area';