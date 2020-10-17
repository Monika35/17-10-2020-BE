DROP VIEW IF EXISTS book_author CASCADE;
CREATE VIEW book_author AS
  SELECT b.book_id as 'id', b.b_name, t.t_name, a.a_name,a.a_surname
  FROM type t join book b on t.type_id=b.type_id
    join author_book ab on b.book_id = ab.book_id join author a on ab.author_id = a.author_id;