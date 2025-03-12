-- 코드를 입력하세요
-- 2022년 5월에 예약한 환자 수를 진료과코드 별로 조회
-- 진료과 코드', '5월예약건수'
SELECT mcdp_cd as '진료과코드', count(MONTH(APNT_YMD)) as '5월예약건수'
from APPOINTMENT
where MONTH(APNT_YMD) = 5
group by mcdp_cd
order by 5월예약건수, 진료과코드

# select * from APPOINTMENT
# where MONTH(APNT_YMD) = 5