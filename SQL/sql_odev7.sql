select rating, count(*) as num_of_movies from film
group by rating;

select replacement_cost, count(*) from film
group by replacement_cost
having count(*) > 50;

select store_id, count(*) as num_of_customers from customer
group by store_id;

select country_id, count(*) as num_of_cities from city
group by country_id
order by count(*) desc limit 1; -- finding the country with the highest number of cities