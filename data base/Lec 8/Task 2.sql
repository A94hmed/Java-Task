-- ==========================================================
-- 1. NATURAL JOIN
-- ==========================================================

SELECT EMPLOYEE_ID,
       JOB_ID,
       JOB_TITLE,
       START_DATE,
       END_DATE
FROM JOB_HISTORY
NATURAL JOIN JOBS;


-- ==========================================================
-- 2. JOIN USING (JOB_ID)
-- ==========================================================

SELECT EMPLOYEE_ID,
       JOB_ID,
       JOB_TITLE,
       START_DATE,
       END_DATE
FROM JOB_HISTORY
JOIN JOBS
USING (JOB_ID);


-- ==========================================================
-- 3. JOIN ON (JOB_ID)
-- ==========================================================

SELECT EMPLOYEE_ID,
       JOB_TITLE,
       START_DATE,
       END_DATE
FROM JOB_HISTORY
JOIN JOBS
ON JOB_HISTORY.JOB_ID = JOBS.JOB_ID;


-- ==========================================================
-- 4. INNER JOIN
-- ==========================================================

SELECT EMPLOYEE_ID,
       JOB_TITLE,
       START_DATE,
       END_DATE
FROM JOB_HISTORY
INNER JOIN JOBS
ON JOB_HISTORY.JOB_ID = JOBS.JOB_ID;


-- ==========================================================
-- 5. LEFT OUTER JOIN
-- ==========================================================

SELECT EMPLOYEE_ID,
       JOB_TITLE,
       START_DATE,
       END_DATE
FROM JOB_HISTORY
LEFT OUTER JOIN JOBS
ON JOB_HISTORY.JOB_ID = JOBS.JOB_ID;


-- ==========================================================
-- 6. RIGHT OUTER JOIN
-- ==========================================================

SELECT EMPLOYEE_ID,
       JOB_TITLE,
       START_DATE,
       END_DATE
FROM JOB_HISTORY
RIGHT OUTER JOIN JOBS
ON JOB_HISTORY.JOB_ID = JOBS.JOB_ID;


-- ==========================================================
-- 7. FULL OUTER JOIN
-- ==========================================================

SELECT EMPLOYEE_ID,
       JOB_TITLE,
       START_DATE,
       END_DATE
FROM JOB_HISTORY
FULL OUTER JOIN JOBS
ON JOB_HISTORY.JOB_ID = JOBS.JOB_ID;