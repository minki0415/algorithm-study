-- https://www.hackerrank.com/challenges/the-report/problem?isFullScreen=true

select if (g.grade > 7, s.name, 'NULL'), g.grade, s.marks
from students as s
join grades as g
on g.min_mark <= s.marks and s.marks <= g.max_mark
order by g.grade desc, s.name, s.marks desc;

select if (g.grade > 7, s.name, 'NULL'), g.grade, s.marks
from students as s
join grades as g
on s.marks between g.min_mark and max_mark
order by g.grade desc, s.name, s.marks desc;
