-- 코드를 입력하세요
-- 2022년 1월의 카테고리 별 도서 판매량을 합산하고,
-- 카테고리(CATEGORY), 총 판매량(TOTAL_SALES) 리스트를 출력하는 SQL문
SELECT b.CATEGORY, sum(c.sales) as TOTAL_SALES
from book b left join book_sales c
on b.book_id = c.book_id
where date_format(c.sales_date, '%Y-%m') like '2022-01'
group by b.category
order by b.category;