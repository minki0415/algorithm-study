-- Q1.
SELECT * from ANIMAL_INS order by animal_id asc;

-- Q2.
SELECT name, datetime from animal_ins order by animal_id desc;

-- Q3.
SELECT animal_id, name from animal_ins where intake_condition = 'sick' order by animal_id;

-- Q4.
SELECT animal_id, name from animal_ins where intake_condition != 'aged' order by animal_id asc;

-- Q5.
SELECT animal_id, name from animal_ins order by animal_id asc;

-- Q6.
SELECT animal_id, name, datetime from animal_ins order by name asc, datetime desc;

-- Q7.
    -- mysql
    -- 1.
    SELECT name from animal_ins where datetime = (select min(datetime) from animal_ins);
    -- 2.
    SELECT name from animal_ins order by datetime asc limit 1;

    -- oracle
    SELECT a.name from (select name, datetime from animal_ins order by datetime asc) a where rownum = 1;
