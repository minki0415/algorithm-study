-- https://www.hackerrank.com/challenges/weather-observation-station-5/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

select city, length(city)
from station
order by length(city), city
limit 1;

select city, length(city)
from station
order by length(city) desc, city
limit 1;