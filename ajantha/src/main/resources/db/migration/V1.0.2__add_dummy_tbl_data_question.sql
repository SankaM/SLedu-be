insert into sledu.t_grade values (1, 'Grade 5', 'en');
insert into sledu.t_grade values (2, '5 වසර', 'si');
insert into sledu.t_grade values (3, 'Grade 6', 'en');
insert into sledu.t_grade values (4, '6 වසර', 'si');
insert into sledu.t_grade values (5, 'Grade 7', 'en');
insert into sledu.t_grade values (7, 'GCE O/L', 'en');
insert into sledu.t_grade values (7, 'GCE A/L', 'en');

insert into sledu.t_subject values(1, 1, 'Mathematics');
insert into sledu.t_subject values(2, 2, 'ගණිතය');
insert into sledu.t_subject values(3, 1, 'English');
insert into sledu.t_subject values(4, 2, 'සිංහල');
insert into sledu.t_subject values(5, 3, 'Mathematics');
insert into sledu.t_subject values(6, 4, 'ගණිතය');
insert into sledu.t_subject values(7, 3, 'English');
insert into sledu.t_subject values(8, 4, 'සිංහල');


insert into sledu.t_lesson values(1, 2, 'වර්ගඵලය', 'https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/_5area.jpg' );
insert into sledu.t_lesson values(2, 2, 'පරිමිතිය', 'https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/_5parimithiya.png');
insert into sledu.t_lesson values(3, 2, 'භාග', 'https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/fraction.png');
insert into sledu.t_lesson values(4, 2, 'කාලය', 'https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/clock.jpg');

insert into sledu.t_topic values(1, 1, 1, 2, 'topic 1','sub topic 1');
insert into sledu.t_topic values(2, 1, 2, 2, 'topic 1','sub topic 2');
insert into sledu.t_topic values(3, 2, 1, 2, 'topic 2','sub topic 1');

insert into sledu.t_smart_note values(1, 1, 1, 2, 'sub topic 1',  'https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/_5parimithiya.png', 'පරිමිතිය යනු යම්කිසි තල රුපයක් වටා මුළු දිග ප්‍රමාණය වේ',' a theorem attributed to Pythagoras that the square on the hypotenuse of a      right-angled triangle is equal in area to the sum of the squares on the other two sides.','https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/fraction.png',' Start with:	a2 + b2 = c2 , Put in what we know:	52 + 122 = c2,Calculate squares:	25 + 144 = c2,25+144=169:	169 = c2,Swap sides:	c2 = 169,Square root of both sides:	c = √169,Calculate:	c = 13,','https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/fraction.png');

insert into sledu.t_question values (1, 2,  'පහත දී ඇති රුපයේ පරිමිතිය සොයන්න','24 cm','25 cm,23 cm,22 cm,24 cm', 'https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/_5area.jpg', 'සමචතුරශ්‍ර්යක පරිමිතිය = එක් පැත්තක දිග x 4', 'පරිමිතිය = 6cm x 4 = 24 cm');
insert into sledu.t_question values (2, 2,  'පහත දී ඇති රුපයේ පරිමිතිය සොයන්න','30 cm','28 cm,23 cm,22 cm,24 cm', 'https://sl-edu.s3-ap-southeast-1.amazonaws.com/cover-images/_5area.jpg', 'සමචතුරශ්‍ර්යක පරිමිතිය = එක් පැත්තක දිග x 4', 'පරිමිතිය = 7.5cm x 4 = 30 cm');



