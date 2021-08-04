REM   Script: Activity 9
REM   Activity 9

select * from salesman;

select * from customers;

select a.customer_name as "CUSTOMER NAME", a.city, b.salesman_name as "salesman name", b.commission from customers a inner join salesman b on a.salesman_id=b.salesman_id;

select a.customer_name, a.city, a.grade, b.salesman_name as "salesman name", b.salesman_city from customers a left outer join salesman b on a.salesman_id=b.salesman_id where a.grade<300 order by a.customer_id;

select a.customer_name as "CUSTOMER NAME", a.city, b.salesman_name as "salesman name", b.commission from customers a inner join salesman b on a.salesman_id=b.salesman_id where b.commission>12;

select a.order_no, a.order_date, a.purchase_amount, b.customer_name as "Customer Name", b.grade, c.salesman_name as "Salesman", c.commission from orders a  
inner join customers b on a.customer_id=b.customer_id inner join salesman c on b.salesman_id=c.salesman_id;

