-- https://www.hackerrank.com/challenges/full-score/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

select h.hacker_id, h.name
from hackers h
join submissions as s on s.hacker_id = h.hacker_id --해커의 챌린지 기록 조인
join challenges as c on c.challenge_id = s.challenge_id -- 챌린지id 기준으로 챌린지 내역과 챌린지 기록 조인
join difficulty as d on d.difficulty_level = c.difficulty_level -- 난이도(만점기준) 과 챌린지 내역 조인
where s.score = d.score -- 해커의 점수가 만점인 경우 출력
group by h.hacker_id, h.name -- 해커의 id와 name으로 그룹
having count(1) > 1 -- 만점을 받은 챌린지가 한개 이상인 경우 
order by count(1) desc, h.hacker_id asc  -- 챌린지 내림차순, hacker_id 오름차순
