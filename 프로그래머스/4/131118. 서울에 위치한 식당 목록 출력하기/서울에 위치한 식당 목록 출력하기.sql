-- 코드를 입력하세요
-- 식당 ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수
-- 결과는 평균점수를 기준으로 내림차순
-- 평균점수가 같다면 즐겨찾기수를 기준으로 내림차순
select i.rest_id, i.rest_name, i.food_type, i.favorites, i.address, round(avg(r.review_score), 2) as score
from rest_info i 
join rest_review r on i.rest_id = r.rest_id
where substring(i.address, 1, 2) = '서울'
group by i.rest_id, i.rest_name, i.food_type, i.favorites, i.address
order by score desc, favorites desc;