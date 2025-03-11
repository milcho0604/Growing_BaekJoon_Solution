-- 코드를 작성해주세요
-- 상위 0% ~ 25% 를 'CRITICAL', 26% ~ 50% 를 'HIGH', 51% ~ 75% 를 'MEDIUM', 76% ~ 100% 를 'LOW'01
--  대장균 개체의 ID(ID) 와 분류된 이름(COLONY_NAME)을 출력

select id,
case 
    when COLONY_PERCENT <= 0.25 then 'CRITICAL'
    when COLONY_PERCENT <= 0.50 then 'HIGH'
    when COLONY_PERCENT <= 0.75 then 'MEDIUM'
    else 'LOW'
    end as COLONY_NAME
from (select id, SIZE_OF_COLONY, percent_rank() over (order by SIZE_OF_COLONY desc) as COLONY_PERCENT
from ECOLI_DATA) as colony_data
order by id;


