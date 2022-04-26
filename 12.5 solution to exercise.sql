insert into posts (ID, USER_ID, BODY)
values (4, 4, "post without sense");

update posts
set BODY = "To delete"
where ID = 4;

delete from posts
where ID = 4;
commit;