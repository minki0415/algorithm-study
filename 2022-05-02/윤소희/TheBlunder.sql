-- https://www.hackerrank.com/challenges/the-blunder/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

-- string과 number 계산시 자동으로 숫자 형변환
select ceil(avg(e.salary) - avg(s.salary))
from employees as e, 
(select replace(convert(salary, char), '0', '') as salary
    from employees
    ) as s;

-- convert 사용 형변환
select ceil(avg(e.salary) - avg(s.salary))
from employees as e, 
    (select convert(replace(convert(salary, char), '0', ''), unsigned) as salary
    from employees
    ) as s;