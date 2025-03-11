-- 코드를 작성해주세요
-- 대장균 개체의 ID(ID)와 자식의 수(CHILD_COUNT)를 출력
-- 자식이 없다면 자식의 수는 0
-- 개체 ID 오름차순

select A.id, count(B.id) as CHILD_COUNT
from ECOLI_DATA A left join ECOLI_DATA B 
on A.id = B.parent_id
group by A.id;


# GROUP BY A.ID
# ORDER BY A.ID ASC;
