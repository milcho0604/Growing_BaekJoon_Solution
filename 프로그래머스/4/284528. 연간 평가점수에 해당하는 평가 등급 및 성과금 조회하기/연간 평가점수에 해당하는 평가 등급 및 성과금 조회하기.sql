-- 코드를 작성해주세요
-- 사원별 성과금 정보를 조회하려합니다. 
-- 평가 점수별 등급과 등급에 따른 성과금 정보가 아래와 같을 때, 사번, 성명, 평가 등급, 성과금을 조회하는 SQL문을 작성해주세요.
# select e.emp_no, e.emp_name, ?, ?
select e.emp_no, e.emp_name,
case
    when avg(g.score) >= 96 then 'S'
    when avg(g.score) >= 90 then 'A'
    when avg(g.score) >= 80 then 'B'
    else 'C'
end as grade,
case
    when avg(g.score) >= 96 then e.sal*0.2
    when avg(g.score) >= 90 then e.sal*0.15
    when avg(g.score) >= 80 then e.sal*0.1
    else 0
end as bonus

from HR_DEPARTMENT h left join HR_EMPLOYEES e 
on h.dept_id = e.dept_id left join HR_GRADE g
on e.emp_no = g.emp_no
group by e.emp_no
order by e.emp_no