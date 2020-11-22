

 -- LIKE - Que contenha a palavra 'or' especifica em qlqr lugar da query  = '%or%'	
	select * from cliente
	where primeiro_nome like '%or%';

  -- LIKE - Contendo a letra especificada na posição espeficicada
	select a.primeiro_nome
	from cliente as a
	where primeiro_nome like '_ran%'

  -- LIKE - que comece com x letra e que conhenha 3 caracter
  		select a.primeiro_nome
		from cliente as a
		where primeiro_nome like 'a_%_%'

   -- LIKE - Começa com um valor e termina com outro
     	select a.primeiro_nome
		from cliente as a
		where primeiro_nome like 'a%o'

		-- LIKE - TODOS QUE NAO COMEÇAM COM A
		  	select a.primeiro_nome
			from cliente as a
			where primeiro_nome not like 'a%'

		-- LIKE - COM OPERADOR CORINGA []
		  	select a.primeiro_nome,
					a.ultimo_nome
			from cliente as a
			where primeiro_nome like '[cs]he%';
			
			select a.primeiro_nome,
				a.ultimo_nome
			from cliente as a
			where primeiro_nome like 'he[cs]%';

use curso;

-- OPERADOR OR
SELECT * from senso as a
where a.populacao < 1000000
and ( UF='SP' or UF='PE')
and a.nome_mun like 'cub%'

use AdventureWorks2017;

--FILTRO COM EXISTS - Comumente usado em sub-selects
-- fazendo a comparacação para ve se são iguais
	SELECT a.FirstName, a.LastName
	FROM Person.Person as a
	where EXISTS 
	(
		Select * from HumanResources.Employee as b 
		where a.BusinessEntityID = b.BusinessEntityID
		and a.LastName = 'Johnson'
	);

-- Filtro usando any

	Select Distinct  s.name
	from Sales.Store as s
	where s.Name = any
	(
		Select v.name
		from Purchasing.Vendor as v
	);

use curso;

-- FILTRO HAVING 
	Select a.uf,
		Count(a.cod_mun) as quantidade_Municipio -- 
		from senso as a
		group by a.uf having count(a.cod_mun) > 100
		order by 2 desc;


