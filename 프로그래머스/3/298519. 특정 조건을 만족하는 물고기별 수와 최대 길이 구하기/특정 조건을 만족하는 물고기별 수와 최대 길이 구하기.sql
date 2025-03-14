-- 코드를 작성해주세요
-- FISH_INFO에서 평균 길이가 33cm 이상인 물고기들을 종류별로 분류
-- 잡은 수, 최대 길이, 물고기의 종류를 출력
-- 물고기 종류에 대해 오름차순으로 정렬해주시고, 10cm이하의 물고기들은 10cm로 취급하여 평균 길이

select count(*) as FISH_COUNT, max(length) as MAX_LENGTH, FISH_TYPE
from fish_info
group by fish_type
having avg(case 
           when length is null then 10
           else length 
           end ) > 33
order by fish_type;

