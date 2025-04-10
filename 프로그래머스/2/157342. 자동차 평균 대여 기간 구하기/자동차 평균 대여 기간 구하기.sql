-- 코드를 입력하세요
SELECT car_id, round(avg(datediff(end_date, start_date) + 1), 1) as AVERAGE_DURATION
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id
having AVERAGE_DURATION >=7
order by AVERAGE_DURATION desc, car_id desc;

# select * from CAR_RENTAL_COMPANY_RENTAL_HISTORY

# SELECT history_id, car_id, 
# date_format(start_date, '%Y-%m-%d') as start_date, 
# date_format(end_date, '%Y-%m-%d') as end_date, 
# if((datediff(end_date, start_date)+1) >= 30, '장기 대여', '단기 대여') as rent_type
# from car_rental_company_rental_history
# where start_date like '2022-09%%'
# order by history_id desc;