-- 코드를 입력하세요
-- 대여 시작일이 2022년 9월에 속하는 대여 기록에 대해서 대여 기간이 30일 이상이면 '장기 대여' 그렇지 않으면 '단기 대여' 로 표시하는 컬럼(컬럼명: RENT_TYPE)을 추가하여 대여기록을 출력하는 SQL문
-- 대여 기록 ID를 기준으로 내림차순

SELECT history_id, car_id, 
date_format(start_date, '%Y-%m-%d') as start_date, 
date_format(end_date, '%Y-%m-%d') as end_date, 
if((datediff(end_date, start_date)+1) >= 30, '장기 대여', '단기 대여') as rent_type
from car_rental_company_rental_history
where start_date like '2022-09%%'
order by history_id desc;