# https://programmers.co.kr/learn/courses/30/lessons/59034

SELECT *
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;


# https://programmers.co.kr/learn/courses/30/lessons/59035

SELECT NAME, DATETIME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID DESC;


# https://programmers.co.kr/learn/courses/30/lessons/59036

SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = 'Sick'
ORDER BY ANIMAL_ID;


# https://programmers.co.kr/learn/courses/30/lessons/59037

SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION != 'Aged'
ORDER BY ANIMAL_ID;
