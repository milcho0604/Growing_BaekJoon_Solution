-- 코드를 입력하세요
SELECT animal_id, name, sex_upon_intake
from animal_ins
where name = 'Lucy' or name = 'Ella' or name = 'Pickle' or name = 'Rogan' or name = 'Sabrina' or name = 'Mitty'
group by animal_id
order by animal_id;