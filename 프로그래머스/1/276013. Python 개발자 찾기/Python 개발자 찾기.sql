-- 코드를 작성해주세요
-- python  id, email, first_name, last_name
select id, email, first_name, last_name 
from DEVELOPER_INFOS
where skill_1 = 'python'
or skill_2 = 'python'
or skill_3 = 'python'
order by id;