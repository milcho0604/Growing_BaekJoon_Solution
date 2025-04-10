-- 코드를 작성해주세요
-- 수원 지역의 연도 별 평균 미세먼지 오염도와 평균 초미세먼지 오염도를 조회하는 SQL문
-- 평균 미세먼지 오염도와 평균 초미세먼지 오염도의 컬럼명은 각각 PM10, PM2.5로 해 주시고, 값은 소수 셋째 자리에서 반올림
-- 연도 오름차
select year(ym) as YEAR,
round(avg(pm_val1), 2) as 'PM10',
round(avg(pm_val2), 2) as 'PM2.5'
from air_pollution
where location2 = '수원'
group by YEAR
order by YEAR;