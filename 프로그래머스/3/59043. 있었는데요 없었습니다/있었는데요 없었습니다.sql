-- 코드를 입력하세요
# SELECT a.animal_id, a.name
# from animal_ins a left join animal_outs b
# on a.animal_id = b.animal_id
# group by animal_id
# having a.datetime > b.datetime
# order by a.datetime;


SELECT animal_id, name
from (select a.animal_id, a.name, a.datetime
      from animal_ins a left join animal_outs b
      on a.animal_id = b.animal_id
     where a.datetime > b.datetime) as result
order by datetime;
