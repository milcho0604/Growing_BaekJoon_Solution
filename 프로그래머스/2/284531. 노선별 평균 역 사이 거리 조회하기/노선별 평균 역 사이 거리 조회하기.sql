-- 코드를 작성해주세요
select a.route,
concat(a.total_distances, 'km') as total_distance,
concat(a.average_distances, 'km') as average_distance
from (select
    route,
    round(sum(D_BETWEEN_DIST), 1) as total_distances,
    round(avg(D_BETWEEN_DIST), 2) as average_distances
    from SUBWAY_DISTANCE
    group by route
) as a
order by total_distances desc