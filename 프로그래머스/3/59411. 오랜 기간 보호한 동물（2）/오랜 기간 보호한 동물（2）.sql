-- 코드를 입력하세요
-- 입양을 간 동물 중, 보호 기간이 가장 길었던 동물 두 마리의 아이디와 이름을 조회
-- 보호 기간이 긴 순으로 조회
SELECT i.animal_id, i.name
from animal_ins i left join animal_outs o
on i.animal_id = o.animal_id
where o.datetime is not null
order by timestampdiff(day, i.datetime, o.datetime) DESC
limit 2