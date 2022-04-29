-- https://www.hackerrank.com/challenges/the-company/problem?isFullScreen=true

select c.company_code, c.founder, l.total_lead, s.total_senior, m.total_manager, e.total_employee
from company as c,
    (select company_code, count(distinct lead_manager_code) as total_lead
    from lead_manager
    group by company_code) as l,
    (select company_code, count(distinct senior_manager_code) as total_senior
    from senior_manager
    group by company_code) as s,
    (select company_code, count(distinct manager_code) as total_manager
    from manager
    group by company_code) as m,
    (select company_code, count(distinct employee_code) as total_employee
    from employee
    group by company_code) as e
where c.company_code = l.company_code and 
    c.company_code = s.company_code and 
    c.company_code = m.company_code and 
    c.company_code = e.company_code
order by c.company_code;