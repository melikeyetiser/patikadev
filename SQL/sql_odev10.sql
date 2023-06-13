select city.city, country.country from city
left join country
on city.country_id = country.country_id;

select p.payment_id, c.first_name, c.last_name from customer c
right join payment p
on c.customer_id = p.customer_id;

select r.rental_id, c.first_name, c.last_name from rental r
full join customer c
on r.customer_id = c.customer_id;