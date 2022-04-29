-- https://www.hackerrank.com/challenges/average-population/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-ch}

-- 버림
select truncate(avg(population), 0)
from city;

-- 반올림
select round(avg(population), 0)
from city;