-- ==========================================================
-- 1. NATURAL JOIN
-- ==========================================================

SELECT LOCATION_ID,
       STREET_ADDRESS,
       CITY,
       COUNTRY_NAME
FROM LOCATIONS
NATURAL JOIN COUNTRIES;


-- ==========================================================
-- 2. JOIN USING (COUNTRY_ID)
-- ==========================================================

SELECT LOCATION_ID,
       STREET_ADDRESS,
       CITY,
       COUNTRY_NAME
FROM LOCATIONS
JOIN COUNTRIES
USING (COUNTRY_ID);


-- ==========================================================
-- 3. JOIN ON (COUNTRY_ID)
-- ==========================================================

SELECT LOCATION_ID,
       STREET_ADDRESS,
       CITY,
       COUNTRY_NAME
FROM LOCATIONS
JOIN COUNTRIES
ON LOCATIONS.COUNTRY_ID = COUNTRIES.COUNTRY_ID;


-- ==========================================================
-- 4. INNER JOIN
-- ==========================================================

SELECT LOCATION_ID,
       STREET_ADDRESS,
       CITY,
       COUNTRY_NAME
FROM LOCATIONS
INNER JOIN COUNTRIES
ON LOCATIONS.COUNTRY_ID = COUNTRIES.COUNTRY_ID;


-- ==========================================================
-- 5. LEFT OUTER JOIN
-- ==========================================================

SELECT LOCATION_ID,
       STREET_ADDRESS,
       CITY,
       COUNTRY_NAME
FROM LOCATIONS
LEFT OUTER JOIN COUNTRIES
ON LOCATIONS.COUNTRY_ID = COUNTRIES.COUNTRY_ID;


-- ==========================================================
-- 6. RIGHT OUTER JOIN
-- ==========================================================

SELECT LOCATION_ID,
       STREET_ADDRESS,
       CITY,
       COUNTRY_NAME
FROM LOCATIONS
RIGHT OUTER JOIN COUNTRIES
ON LOCATIONS.COUNTRY_ID = COUNTRIES.COUNTRY_ID;


-- ==========================================================
-- 7. FULL OUTER JOIN
-- ==========================================================

SELECT LOCATION_ID,
       STREET_ADDRESS,
       CITY,
       COUNTRY_NAME
FROM LOCATIONS
FULL OUTER JOIN COUNTRIES
ON LOCATIONS.COUNTRY_ID = COUNTRIES.COUNTRY_ID;