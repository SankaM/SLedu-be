CREATE TABLE sledu.t_grade (
 id int,
 name varchar(50),
 medium varchar(10)
);

CREATE TABLE sledu.t_subject (
 id int,
 grade_id int,
 name varchar(100)
);

CREATE TABLE sledu.t_lesson (
 id int,
 subject_id int,
 name varchar(100),
 image_url varchar(255)
);

CREATE TABLE sledu.t_question (
 id int,
 lesson_id int,
 question varchar(255),
 correct_answer varchar(255),
 other_answers varchar(255),
 question_img_url varchar(255),
 theory varchar(255),
 solution varchar(255)
);