-- 코드를 입력하세요
SELECT cart_id
from cart_products
WHERE name IN ('Milk', 'Yogurt')
group by cart_id
having count(distinct name) = 2;
