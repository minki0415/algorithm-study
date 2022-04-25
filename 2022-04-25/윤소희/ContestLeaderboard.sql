-- https://www.hackerrank.com/challenges/contest-leaderboard/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

select h.hacker_id, h.name, s.score
from hackers as h
join (
    select ss.hacker_id, sum(ss.max) as score
    from (
        select hacker_id, challenge_id, max(score) as max
        from submissions
        group by hacker_id, challenge_id
    ) as ss
    group by ss.hacker_id) as s
on h.hacker_id = s.hacker_id
where s.score != 0
order by s.score desc, s.hacker_id;

-- group by절에서 사용하지 않은 컬럼은 select절에서 사용할 수 없음
-- group by 절에서 h.name을 같이 사용해주면 select에서 사용할 수 있음
select h.hacker_id, h.name, sum(s.max)
from hackers as h
join (
      select hacker_id, challenge_id, max(score) as max
      from submissions
      group by hacker_id, challenge_id
     )as s
on h.hacker_id = s.hacker_id
group by h.hacker_id, h.name
having sum(s.max) > 0
order by sum(s.max) desc, s.hacker_id;