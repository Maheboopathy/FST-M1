REM   Script: Activity 8
REM   Activity 8

select customer_id, max(purchase_amount) AS "Maximum Amount" from orders group by customer_id;

select salesman_id, order_date, max(purchase_amount) AS "Max Amount" from orders where order_date=to_date('2012-08-17', 'YYYY/MM/DD') group by salesman_id, order_date;

select customer_id, order_date, max(purchase_amount) AS "Max Amount" from orders group by customer_id, order_date having max(purchase_amount) in (2030, 3450, 5760, 6000);

