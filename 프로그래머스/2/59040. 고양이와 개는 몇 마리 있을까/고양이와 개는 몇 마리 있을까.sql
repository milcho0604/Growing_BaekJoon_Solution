-- 코드를 입력하세요
SELECT ANIMAL_TYPE, count(*) as count
from animal_ins
where animal_type = 'Cat' or animal_type = 'Dog'
group by animal_type
order by animal_type;

# select count(*) from animal_ins;