-- https://www.hackerrank.com/challenges/harry-potter-and-wands/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

select w.id, p.age, w.coins_needed, w.power
from wands as w
inner join wands_property as p
on w.code = p.code
where p.is_evil = 0 and 
        w.coins_needed = (select min(coins_needed)
                            from wands as ww
                            inner join wands_property as pp
                            on ww.code = pp.code
                            where w.power = ww.power and p.age = pp.age)
order by w.power desc, p.age desc;