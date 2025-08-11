-- 코드를 입력하세요
-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이
-- 큰 순서대로 상위 3개의 맛을 조회
SELECT j.flavor
# , sum(j.total_order + f.total_order) as total
from july j join first_half f 
on j.flavor = f.flavor
group by flavor
order by sum(j.total_order + f.total_order) desc
limit 3

# SELECT j.flavor, j.total_order
# from july j