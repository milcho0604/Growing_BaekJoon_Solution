-- 코드를 작성해주세요
-- 분화된 연도별 가장 큰 대장균의 크기 - 각 대장균의 크기

# select substring(DIFFERENTIATION_DATE, 1, 4) as YEAR, 
# ((select max(size_of_colony) from ECOLI_DATA) - size_of_colony)
# as YEAR_DEV,
# id
# from ECOLI_DATA
# order by YEAR, YEAR_DEV


select YEAR(DIFFERENTIATION_DATE) as YEAR, 
(max(SIZE_OF_COLONY) OVER (partition by YEAR(DIFFERENTIATION_DATE)) - SIZE_OF_COLONY)
as YEAR_DEV,
ID
from ECOLI_DATA
order by YEAR, YEAR_DEV