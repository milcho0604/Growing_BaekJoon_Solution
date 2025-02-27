-- 코드를 입력하세요
-- 2022년 10월에 작성
-- 게시글 제목, 게시글 id, 댓글 id, 댓글 작성자 id, 댓글 내용, 작성일
-- 댓글 작성일 오름차순 -> 게시글 제목 오름차순
SELECT b.title,  b.board_id, u.reply_id, u.writer_id, u.contents, 
date_format(u.created_date, '%Y-%m-%d')
from USED_GOODS_BOARD b
join USED_GOODS_REPLY u on b.board_id = u.board_id
where b.created_date like "%2022-10%"
-- and u.created_date like "%2022-10%"
order by u.created_date, b.title;