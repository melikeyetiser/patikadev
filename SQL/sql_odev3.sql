SELECT country FROM country
WHERE country LIKE 'A%a';

SELECT country FROM country
WHERE country LIKE '%_____n'; -- at least 6 characters

SELECT title FROM film
WHERE title ILIKE '%t%t%t%t%';

SELECT * FROM film
WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99;