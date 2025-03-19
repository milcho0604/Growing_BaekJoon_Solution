-- 코드를 입력하세요
-- PRODUCT 테이블과 OFFLINE_SALE 테이블에서 
-- 상품코드 별 매출액(판매가 * 판매량) 합계를 출력하는 SQL문
-- 매출액을 기준으로 내림차순 정렬해주시고 매출액이 같다면 상품코드를 기준으로 오름차순 
SELECT PRODUCT_CODE, sum(price * sales_amount) as SALES
from PRODUCT p left join OFFLINE_SALE o
on p.product_id = o.product_id
group by product_code
order by sales desc, product_code asc;

