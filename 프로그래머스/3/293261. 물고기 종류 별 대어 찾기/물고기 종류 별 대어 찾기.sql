-- 코드를 작성해주세요
--  종류 별로 가장 큰 물고기의 ID, 물고기 이름, 길이를 출력
--  물고기의 ID에 대해 오름차순
--  1마리만 있으며 10cm 이하의 물고기가 가장 큰 경우는 없습니다.

select a.id, b.fish_name, a.length
from fish_info a inner join fish_name_info b
on a.fish_type = b.fish_type
where a.length = (select max(c.length)
                 from fish_info c
                 where c.fish_type = a.fish_type)
order by a.id;