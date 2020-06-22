select*from emp;
select *from dept;
# 1. Să se selecteze deptno, enume, job și sal pentru angajatii care au sef-ul cu id-ul 7902.

#     select e.DEPTNO AS DEPARTAMENT,ENAME AS NUME, SAL AS SALARIU, JOB FROM EMP e WHERE e.MGR = 7902;

# 2. Să se selecteze numele, funcția și salariu pentru angajații care au aceași funcție.

# SELECT group_concat(ENAME separator ', '),
#        JOB,
#        group_concat(SAL separator ', ') as salaries,
#        avg(SAL)
# FROM EMP e
# where e.SAL > 1500 #actioneaza pe randuri
# group by e.JOB #actioneaza pe grupuri
# having count(e.ENAME) > 1;


# 3. Să se selecteze numele, funcția și salariul anual pentru toți angajații din același departament.

# select group_concat(ENAME, concat(':', (SAL + ifnull(COMM, 0)) * 12), concat(':', JOB) separator ',       ') employees
# from EMP e
# group by e.DEPTNO;

# 4. Să se selecteze numele, funcția și venitul lunar pentru toți angajații care au venitul lunar mai mare de 2000.
# Venitul lunar este o funcție care are formula salariu + ifnull(comision, 0)

# select ENAME, JOB, (SAL + ifnull(COMM, 0)) as venit_lunar, HIREDATE
# from EMP
# where SAL + ifnull(COMM, 0) > 2000
# order by SAL + ifnull(COMM, 0) DESC;


# 5.Să se selecteze id-ul angajatului, numele, funcția și data angajării pentru toți angajații care au aceași funcție
# și au venit în firmă după o anumită dată.

# select EMPNO, ENAME, JOB, HIREDATE
# from EMP
# where HIREDATE > '1982-12-01'
#   AND JOB = 'ANALYST';

#
# 6. Să se adauge 10 noi angajati.

# INSERT INTO EMP VALUES (10000, 'John', 'SALESMAN', 7698, '1981-02-22', 2000, 500, 30),
#                        (10001, 'Ion', 'SALESMAN', 7698, '1981-02-22', 2000, 500, 30),
#                        (10002, 'Joe', 'SALESMAN', 7698, '1981-02-22', 2000, 500, 30);

# 7. Să se calculeze o primă de 15% pentur toți angajații din departamentul 20.

# alter table EMP drop COLUMN PRIMA;
# ALTER TABLE EMP ADD COLUMN PRIMA int(4) default 0;
# update EMP e
# set e.PRIMA = e.SAL * 0.15
# where DEPTNO = 20;

# select * from EMP
# order by EMPNO asc
# limit 500; #primary key-ul


# create table tabel_Stefan(
#     id int(5) auto_increment,
#     name varchar(100) not null default 'John Doe',
#     departament int(2),
#     foreign key tabel_Stefan_DEPT_fk(departament) references DEPT(DEPTNO),
#     primary key (id)
# );


# alter table tabel_Stefan drop COLUMN id;
#
# ALTER TABLE tabel_Stefan ADD COLUMN id int(4) auto_increment primary key ;
# ALTER TABLE tabel_Stefan change departament dept int(4);

# 8. Să se selecteze id-ul și numele departamentului din tabela departamente.
select deptno, dname from dept;

# 9. Să se selecteze id-ul, numele, funcția și data angajării pentru toți angajații din firmă.
select empno as ID, ename as NAME, job, hiredate from emp;

# Ordonați descrescător în funcție de id. Concatenați id-ul cu numele.
select concat (empno, ', ', ename) from emp order by empno desc;

# 10. Să se selecteze id-ul, numele, fucția și venitul lunar pentru toți angajatii din firmă.
select empno, ename, job, sal from emp;

#  Să se adauge la select o coloană goală care să se numească semnătura. Concatenați id-ul cu numele. Ordonați după departament.
select "" as SEMNATURA, CONCAT (empno, ', ', ename) from emp order by mgr;

# 11. Să se selecteze numele și funcția angajaților.
select ename, job from emp;

# 12. Să se facă o listă cu numele departamentului și codul acestuia. Ordonați după numele departamentului.
select job, mgr from emp order by job;

# 13. Să se selecteze toți angajații care au funcția manager. Ordonați după id-ul departamentului
select ename from emp where job='manager' order by EMPNO;

# 14. Selectați toate persoanele care s-au angajat intr-o anumită perioadă aleasa de voi.
select ename from emp where hiredate between ("1982-01-01") and ("1982-01-01");

# 15. Să se listeze id-ul, numele, funcția, venitul lunar pentru angajații care au următoarele id-uri: 7499,7902, 7876
select empno, ename, job, sal from emp where empno =7499 or EMPNO= 7902 or empno = 7876;

# 16. Să se selecteze toate persoanele care au fost angajate în anul 1980
select ename from emp where HIREDATE between ("1980-01-01") and ("1980-12-12");

# 17. Să se selecteze toate persoanele al căror nume începe cu litera F și numele funcției are 7 caractere.
select e.ENAME from emp e where e.Ename like 'a%'  and length(JOB) = 5;

# 18. Să se listeze angajații din departamentul 20 care nu au primit comision.
select e.Ename from emp e where e.JOB = 'salesman' and e.comm is null  or e.COMM =0;

select e.Ename from emp e where e.JOB = 'manager' and e.comm is null or e.COMM =0;

# 19. Să se listeze angajații care au primit comision și au funcția SALESMAN
select e.ENAME from emp e
where e.JOB ='salesman'
and e.comm <>0;

# 20. Să se selecteze toți angajații care au funcția MANAGER și salariul peste 1500 și toți angajații care au funcția ANALYST.
select e.ename, e.job, e.sal  from emp e
where JOB='analyst'
 or (JOB='manager' and SAL>1500);

# 21. Selectați toți angajații care s-au angajat înainte de anul 1982 și nu au primit comision.
#select e.ename, e.HIREDATE from emp e where HIREDATE <("1982-01-01");

# 22. Selectați toți angajații care au salariul peste 3000 și nu au șefi, ordonați după departament.
select ename from emp where (JOB='president' or JOB='MANAGER') and SAL>3000 order by DEPTNO;

# 23. Selectați numele, funcția și venitul anual al angajaților care nu au funcția MANAGER pentru un departament ales de voi.
select e.ENAME, e.JOB, (SAL*12) as 'Anual Income' from emp e where e.job not like 'MANAGER';


# 24. Selectați numele, numele, data angajării și
# salariul tuturor persoanelor angajate în anul 1981
# din două departamente alese de voi.

select ename, hiredate, sal from emp
where (JOB='salesman' or JOB='manager')
AND HIREDATE between ("1981-01-01")and ("1981-12-31");

# select d.name, e.name, e.hiredate, e.salary
# from employee e
#  join department d
#     on e.department_id = d.id
# where year(e.hiredate) = 1981;

select e.name, e.department_id, d.id, d.name
from employee e
         join department d # din tabelul joinuit
              on e.department_id = d.id;


# 25. angajatii care lucreaza la dept din Chicago

select e.name
from employee e
         join department d
              on e.department_id = d.id
where d.city = 'CHICAGO';

#cu subquery necorelat echivalent
select e.name, (select city from department where id = e.department_id) as dept_city
from employee e;
# where e.department_id in (select id from department where city='CHICAGO');


# union operators --> ca un join pe verticala
select e.name as emps_then_depts
from employee e
UNION
select d.name
from department d;

select e.*, d.*
from employee e
         join department d;
# daca nu pui "ON" obtii produs cartezian

