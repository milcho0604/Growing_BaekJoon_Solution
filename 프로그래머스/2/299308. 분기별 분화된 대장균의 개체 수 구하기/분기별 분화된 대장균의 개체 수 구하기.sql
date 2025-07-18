-- 코드를 작성해주세요
select 
case
when month(DIFFERENTIATION_DATE) in (1,2,3) then '1Q'
when month(DIFFERENTIATION_DATE) in (4,5,6) then '2Q'
when month(DIFFERENTIATION_DATE) in (7,8,9) then '3Q'
when month(DIFFERENTIATION_DATE) in (10,11,12) then '4Q'
end as quarter,
count(*) as ecoli_count
from ecoli_data
group by quarter
order by quarter