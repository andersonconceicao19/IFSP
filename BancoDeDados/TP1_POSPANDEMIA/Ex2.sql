Use dbTP_Insert_Delete_Update;
Go

-- a --
Select * from notas
where nm_aluno like 'Jose%';

-- b --
Select * from notas
where nm_aluno like '%Silva%';

-- c --
Update notas
Set media = (p1 + p2) / 2;

-- d --
Update notas
Set ds_status = 'aprovado'
where media > 5;

-- e -- 
Update notas
Set ds_status = 'recuperação'
where media between 3 and 5;

-- f --
Update notas
Set ds_status = 'reprovado'
where media < 3;

-- g --
Delete from notas
where cd_matricula = '999999'