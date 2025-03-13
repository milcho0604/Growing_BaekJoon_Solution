-- 코드를 입력하세요
-- 2022년 10월 16일에 대여 중인 자동차인 경우 '대여중' 이라고 표시하고, 대여 중이지 않은 자동차인 경우 '대여 가능'을 표시하는 컬럼(컬럼명: AVAILABILITY)을 추가
-- 
SELECT car_id, case when car_id in(
    select car_id from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where '2022-10-16' between start_date and end_date
) then '대여중'
else '대여 가능'
end as AVAILABILITY
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
group by car_id
order by car_id desc;