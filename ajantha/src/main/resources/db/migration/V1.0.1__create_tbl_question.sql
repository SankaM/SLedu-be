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

CREATE TABLE sledu.t_topic(
    id int,
    topic_id int,
    sub_topic_id int,
    lesson_id int,
    topic_name varchar(255),
    sub_topic_name varchar(255)
);

CREATE TABLE sledu.t_smart_note(
    id int,
    topic_id int,
    sub_topic_id int,
    lesson_id int,
    sub_topic_name varchar(255),
    image_def_url varchar(255),
    definition varchar(1000),
    theory varchar(1000),
    image_theory_url varchar(255),
    example varchar(1000),
    image_example_url varchar(255)
);


--CREATE TABLE sledu.t_short_note(
--    id int,
--
--);

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