-- 코드를 입력하세요
-- 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량을 총주문량이 작은 순서대로 조회

SELECT b.INGREDIENT_TYPE, sum(a.TOTAL_ORDER) as TOTAL_ORDER
from FIRST_HALF a join ICECREAM_INFO b
on a.FLAVOR = b.FLAVOR
group by b.INGREDIENT_TYPE
