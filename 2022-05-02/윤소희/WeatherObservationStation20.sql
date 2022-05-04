-- https://www.hackerrank.com/challenges/weather-observation-station-20/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

select round(avg(lat_n), 4)
from (select lat_n, percent_rank() over(order by lat_n) as percent
            from station) as p
where percent = 0.5;


-- oracle에서는 median이라는 함수를 사용할 수 있다.
select round(median(lat_n), 4)
from station;