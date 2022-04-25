-- https://www.hackerrank.com/challenges/binary-search-tree-1/problem?isFullScreen=true

select N, (case
               when P is null then 'Root'
               when N in (select P from BST) then 'Inner'
               else 'Leaf'
          end)
from BST
order by N;