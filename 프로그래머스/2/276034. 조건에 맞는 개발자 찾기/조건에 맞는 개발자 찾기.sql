-- 코드를 작성해주세요
-- DEVELOPERS 테이블에서 Python이나 C# 스킬을 가진 개발자의 정보를 조회하려 합니다. 조건에 맞는 개발자의 ID, 이메일, 이름, 성을 조회하는 SQL 문을 작성해 주세요.
select DISTINCT(d.id), d.email, d.first_name, d.last_name
from DEVELOPERS d join SKILLCODES s
on d.skill_code & s.code > 0
where s.name = 'python' or s.name = 'C#'
order by d.id;
