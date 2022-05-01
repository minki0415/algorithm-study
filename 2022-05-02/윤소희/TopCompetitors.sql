-- https://www.hackerrank.com/challenges/full-score/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

select h.hacker_id, h.name
from hackers as h
join (select hacker_id, submission_id
    from submissions
    join (select c.challenge_id, d.score
        from challenges as c
        join difficulty as d
        on c.difficulty_level = d.difficulty_level) as s
    on submissions.challenge_id = s.challenge_id
    where s.score = submissions.score) as sub
on h.hacker_id = sub.hacker_id
group by h.hacker_id, h.name
having count(sub.submission_id) > 1
order by count(sub.submission_id) desc, h.hacker_id;


select h.hacker_id, h.name
from hackers as h
inner join submissions as s
on h.hacker_id = s.hacker_id
inner join challenges as c
on s.challenge_id = c.challenge_id
inner join difficulty as d
on c.difficulty_level = d.difficulty_level
where d.score = s.score
group by h.hacker_id, h.name
having count(s.submission_id) > 1
order by count(s.submission_id) desc, h.hacker_id;