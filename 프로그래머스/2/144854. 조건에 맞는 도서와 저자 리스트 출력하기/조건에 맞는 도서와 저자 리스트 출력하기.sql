-- 경제 카테고리 도서의 도서 ID, 저자명(author_name), 출판일 리스트 출력

SELECT b.book_id, a.author_name, date_format(b.published_date, '%Y-%m-%d') published_date
from book b inner join author a on b.author_id = a.author_id 
where category = '경제' order by b.published_date;