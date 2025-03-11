-- 코드를 작성해주세요
-- 부모의 형질을 모두 보유한 대장균의 ID(ID), 대장균의 형질(GENOTYPE), 부모 대장균의 형질(PARENT_GENOTYPE)을 출력

select a.id, a.genotype, b.genotype as PARENT_GENOTYPE
from ECOLI_DATA a left join ECOLI_DATA b
on a.parent_id = b.id
WHERE b.genotype & a.genotype = b.genotype
order by a.id;