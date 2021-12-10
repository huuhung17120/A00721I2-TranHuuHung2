USE quanlysinhvien;

select * from `student` where StudentName like 'h%';

select * from `class` where month(StartDate) = 12;

select * from `subject` where Credit between 3 and 5;

update `student` set ClassId= 2
where StudentName= 'Hung';

select st.StudentName, sj.SubName, m.Mark from `student` st join mark m on st.StudentId = m.StudentId join `subject`sj on m.SubId = sj.SubId
order by m.Mark desc;