-- 코드를 입력하세요
--  '네비게이션' 옵션이 포함된 자동차 리스트를 출력하는 SQL문
SELECT * from car_rental_company_car
where options like '%네비게이션%'
order by car_id desc;