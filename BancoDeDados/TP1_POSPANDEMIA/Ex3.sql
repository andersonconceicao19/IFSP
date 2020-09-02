Use dbTP_Insert_Delete_Update;
Go

Select * from usuarios
where dt_cadastro between '2008-01-25' and '2008-01-27';

Delete from usuarios
where cd_matricula = '696969';

Update usuarios
Set ic_login = SUBSTRING(nm_usuario, 1, 1) + cd_matricula + RIGHT(nm_usuario, 1)
where ic_login = 'PEDE PARA SAIR';