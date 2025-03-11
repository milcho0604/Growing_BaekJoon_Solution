# -- 코드를 작성해주세요
# -- 점수, 사번, 성명, 직책, 이메일
# select sum(c.score) as score, b.emp_no, b.emp_name, b.position, b.email
# from HR_DEPARTMENT a left join HR_EMPLOYEES b 
# on a.dept_id = b.dept_id left join HR_GRADE c
# on b.emp_no = c.emp_no
# where year = '2022'
# group by emp_no

select max(d.score) as score, d.emp_no, d.emp_name, d.position, d.email
from (
    select sum(c.score) as score, b.emp_no, b.emp_name, b.position, b.email 
    from HR_DEPARTMENT a left join HR_EMPLOYEES b 
    on a.dept_id = b.dept_id left join HR_GRADE c
    on b.emp_no = c.emp_no
    where year = '2022'
    group by emp_no
) as d
group by emp_no
order by score desc
limit 1;
