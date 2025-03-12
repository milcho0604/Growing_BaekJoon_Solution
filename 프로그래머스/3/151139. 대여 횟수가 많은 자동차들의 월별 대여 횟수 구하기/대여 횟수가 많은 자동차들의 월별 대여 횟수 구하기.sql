-- 코드를 입력하세요
-- 시작일 2022년 8월부터 2022년 10월까지 총 대여 횟수가 5회 이상인 자동차들에 대해서 해당 기간 동안의 월별 자동차 ID 별 총 대여 횟수(컬럼명: RECORDS) 리스트를 출력
-- 월을 기준으로 오름차순 정렬하고, 월이 같다면 자동차 ID를 기준으로 내림차순
-- 대여 횟수가 0인 경우에는 결과에서 제외

# SELECT MONTH(start_date) as month, car_id, count(*) as records
# from CAR_RENTAL_COMPANY_RENTAL_HISTORY
# where MONTH(start_date) = 8 or MONTH(start_date) = 9 or MONTH(start_date) = 10
# group by car_id
# order by month, car_id desc

# SELECT MONTH(start_date) as month, car_id, count(*) as records
# from (
#     select start_date, car_id, count(*) as temp
#     from CAR_RENTAL_COMPANY_RENTAL_HISTORY
#     group by car_id
#     having temp >= 5
#     ) as car
# where MONTH(start_date) = 8 or MONTH(start_date) = 9 or MONTH(start_date) = 10
# group by car_id
# order by month, car_id desc

SELECT MONTH(start_date) as MONTH, CAR_ID, count(*) as RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where car_id in (
    select car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where START_DATE >= '2022-08-01' and START_DATE <= '2022-10-31'
    group by car_id
    having count(*) >= 5
    )
    and START_DATE >= '2022-08-01' and START_DATE <= '2022-10-31'
group by MONTH, CAR_ID
order by MONTH, CAR_ID desc