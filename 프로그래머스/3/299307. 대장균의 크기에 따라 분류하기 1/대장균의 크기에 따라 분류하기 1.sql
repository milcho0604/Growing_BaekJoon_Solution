-- 코드를 작성해주세요
-- 개체의 크기가 100 이하라면 'LOW', 100 초과 1000 이하라면 'MEDIUM', 1000 초과라면 'HIGH' 라고 분류
-- 대장균 개체의 ID(ID) 와 분류(SIZE)를 출력

select id, 
case 
    when SIZE_OF_COLONY <= 100 then 'LOW'
    when SIZE_OF_COLONY <= 1000 then 'MEDIUM'
    else 'HIGH'
    end as SIZE
from ECOLI_DATA;
