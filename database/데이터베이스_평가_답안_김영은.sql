use empdb;

#board 테이블을 생성하시오
create database boad
create table board (
num : int, 'primary key', 'Auto Increment',
writer : varchar(10),
subject : varchar(50),
reg_date : datetime,
readcount : int, 기본값 0
)
go 

insert into empdb (num, writer, subject, reg_date, readcount)
values (1, 'empdb', '20240202')

#직원 중에서 연봉이 170000 이상인 직원들의 이름, 연봉을 조회하시오. 연봉은 급여(salary)에 12를 곱한 값입니다.
#단, 이름은 "이름", 연봉은 "월급의 12배"로 출력되도록 조회하시오
show tables;

select first_name as 이름, from employees;
select salary(salary*12) from employees;

#직원 중에서 부서id가 없는 직원의 이름과 급여를 조회하시오.
select department_id, employee_name, salary from employees;

#2004년 이전에 입사한 직원의 이름, 급여, 입사일을 조회하시오.
select Joined the company before 2004 employee_name, salary, Date of joining from employees;

# 80, 50 번 부서에 속해있으면서 급여가 13000 이상인 직원의 이름, 급여, 부서id 를 조회하시오
select Belongs to departments 80 and 50 13000 or more first_name, salary, department_id from employees;

#2005년 이후에 입사한 직원들 중에서 급여가 1300이상 20000 이하인 직원들의 이름, 급여, 부서id, 입사일을 조회하시오
select Joined the company after 2005 among employees  Salary between 1300 and 20000 employee_name, salary, department_id from employees;

#이름에 le 가 들어간 직원의 이름, 급여, 입사일을 조회하시오
select le in the name employee_name, salary, Date of joining from employees;

#직종이 clerk 군인 직원의 이름, 급여, 직종코드를 조회하시오.
#(clerk 직종은 job_id에 CLERK을 포함하거나 CLERK으로 끝난다.)