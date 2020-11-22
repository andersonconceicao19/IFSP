use crm;

-- Filtro Where
select * from cliente
where codigo_pais = 'BR';

-- Filtro com AND
select 
	a.primeiro_nome,
	a.ultimo_nome,
	a.etnia
from cliente as a
where a.etnia= 'Eskimo' and a.sexo = 'female';

-- Fitro com Between - Usando datas
select 
	c.primeiro_nome,
	c.ultimo_nome,
	c.nascimento
from cliente as c
where c.nascimento between '2004-01-01' and '2004-12-31';

-- Filtro utilizando IN - Trás todos os registros que contenha o valor especificado no in
select 
	c.primeiro_nome,
	c.ultimo_nome,
	c.id_profissao
from cliente as c
where c.id_profissao in ('12','91');


-- Filtro utilizando NOT IN- Trás todos os registros que não contenha o valor especificado no in
select 
	c.primeiro_nome,
	c.ultimo_nome,
	c.id_profissao
from cliente as c
where c.id_profissao not in ('12','91');

