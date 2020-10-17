DROP VIEW IF EXISTS student_books CASCADE;
CREATE VIEW student_books AS
  SELECT b.borrows_id as 'id',s.s_index , s_name, s_surname, s2.sample_id, b2.b_name
  FROM student s join borrows b on s.student_id = b.student_id
    join sample s2 on b.sample_id = s2.sample_id join book b2 on s2.book_id = b2.book_id;