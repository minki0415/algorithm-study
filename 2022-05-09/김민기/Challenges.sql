-- https://www.hackerrank.com/challenges/challenges/problem?isFullScreen=true

select h.hacker_id, h.name, count(c.challenge_id) as c_count
from hackers h
join challenges c 
on h.hacker_id = c.hacker_id
group by h.hacker_id, h.name
having c_count = (select count(challenge_id) 
                  from challenges 
                  group by hacker_id 
                  order by count(challenge_id) desc limit 1)
       
       or
       
       c_count in (select t1.total -- 5) 해커 아이디 수가 1인 챌린지 수를 셀렉트하여 c_count가 속해 있어야한다는 조건 추가
                   from ((select t.total, count(t.hacker_id) -- 3) 챌린지 수 당 해커 아이디 수 테이블 생성 
                          from (select count(challenge_id) total, hacker_id from challenges group by hacker_id) as t -- 1) hacker_id 별 챌린지 수
                          group by t.total -- 2) hacker_id별 챌린지 수로 그룹화
                          having count(t.hacker_id) = 1) as t1)) -- 4) 해커 아이디 수가 1인 챌린지 수 테이블 생성
order by c_count desc, h.hacker_id asc
