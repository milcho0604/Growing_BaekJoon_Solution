-- 코드를 입력하세요
-- 식품분류별로 가격이 제일 비싼 식품의 분류, 가격, 이름을 조회하는 SQL문을 작성해주세요. 
-- 이때 식품분류가 '과자', '국', '김치', '식용유'인 경우만 출력시켜 주시고 
-- 결과는 식품 가격을 기준으로 내림차순 정렬해주세요.

# SELECT category, max(price) as max_price
# from food_product
# where category in ('과자', '국', '김치', '식용유') 
# group by category
# order by max_price desc;

SELECT f.category, f.price as max_price, f.product_name
from food_product f join(
select max(price) as price from food_product
    group by category
) t
on f.price = t.price
where category in ('과자', '국', '김치', '식용유')
group by category
order by max_price desc;