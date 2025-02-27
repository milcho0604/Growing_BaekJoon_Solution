-- 코드를 작성해주세요
-- 부모가 없는 item -> root
-- A -> B -> C (역순) root A

-- 희귀도 'RARE' 다음 업그레이드 아이템의 
-- 아이템ID, 아이템명, 희귀도 
-- 내림차순
select i.ITEM_ID, i.ITEM_NAME, i.RARITY from ITEM_INFO i
join ITEM_TREE t on i.item_id = t.item_id
join ITEM_INFO p on t.parent_item_id = p.item_id
where t.parent_item_id is not null 
and p.rarity = 'RARE'
order by i.item_id desc;




