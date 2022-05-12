-- https://www.hackerrank.com/challenges/contest-leaderboard/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

select h.hacker_id, h.name, sum(sm.max_score) as total 
from hackers h

--해커 아이디, 챌린지로 그룹화 한 후 스코어가 최대값일 경우만 가지고 있는 테이블 생성하여 조인
join (select s.hacker_id, max(s.score) as max_score  
      from submissions s 
      group by s.challenge_id, s.hacker_id) as sm 
on h.hacker_id = sm.hacker_id
-- 최대점이 0인 경우는 제거
where sm.max_score > 0
group by h.hacker_id, h.name
order by total desc, h.hacker_id asc
