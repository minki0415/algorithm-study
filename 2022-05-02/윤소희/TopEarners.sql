-- https://www.hackerrank.com/challenges/earnings-of-employees/problem?isFullScreen=true

select (months * salary) as total, count(*)
from employee
group by total
order by total desc
limit 1;

-- group by와 order by의 1은 select문에 쓰인 첫 번째 열을 사용하라는 의미
select (months * salary) as total, count(*)
from employee
group by 1
order by 1 desc
limit 1;