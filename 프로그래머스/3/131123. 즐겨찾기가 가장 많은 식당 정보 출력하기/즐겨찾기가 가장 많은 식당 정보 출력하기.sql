-- 코드를 입력하세요
-- 음식종류별로 즐겨찾기수가 가장 많은 
-- 식당의 음식 종류, ID, 식당 이름, 즐겨찾기수를 조회하는 SQL문
-- 음식 종류를 기준으로 내림차순 정렬
SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
from rest_info
where favorites in (
select max(favorites) from rest_info
group by food_type
)
group by food_type
# having favorites = max(favorites)
order by food_type desc;

# SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
# FROM REST_INFO
# WHERE FAVORITES IN (
#       SELECT MAX(FAVORITES)
#       FROM REST_INFO
#       GROUP BY FOOD_TYPE)
# ORDER BY FOOD_TYPE DESC;