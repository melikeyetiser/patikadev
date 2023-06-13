select count(*) from film
where length > (select avg(length) from film);

select count(*) from film
where rental_rate = (select max(rental_rate) from film);

select * from film
where rental_rate = (select min(rental_rate) from film)
and replacement_cost = (select min(replacement_cost) from film);

select * from customer as c
inner join payment as p
	on c.customer_id = p.customer_id
where p.amount = (select max(amount) from payment);