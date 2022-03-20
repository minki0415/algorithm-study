-- 문제 : https://programmers.co.kr/learn/courses/30/lessons/59412

SELECT HOUR(DATETIME) AS HOUR, COUNT(DATETIME) AS COUNT
FROM ANIMAL_OUTS
WHERE HOUR(DATETIME) >=9 AND HOUR(DATETIME)<20
GROUP BY HOUR(DATETIME)
ORDER BY HOUR(DATETIME)

select HOUR(datetime) as HOUR, count(*) as COUNT
from animal_outs
where HOUR(datetime) between 9 and 19
group by HOUR(datetime)
order by HOUR(datetime);