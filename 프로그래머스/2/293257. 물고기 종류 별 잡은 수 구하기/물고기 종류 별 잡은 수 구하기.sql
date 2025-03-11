-- 코드를 작성해주세요
select count(*)as FISH_COUNT, b.fish_name
from fish_info a left join fish_name_info b
on a.fish_type = b.fish_type
group by b.fish_name
order by FISH_COUNT desc;