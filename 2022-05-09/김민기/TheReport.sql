-- https://www.hackerrank.com/challenges/the-report/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
-- join, between

SELECT CASE
            WHEN GRADE<8 THEN 'NULL'
            ELSE NAME
            END ,
GRADE, MARKS
FROM STUDENTS 
INNER JOIN GRADES
ON MARKS BETWEEN MIN_MARK AND MAX_MARK
ORDER BY GRADE DESC, NAME;
