use demo_a07;

insert into tai_khoan (username, password) value ("huuhung","huuhung123"), ("hienmai","hienmai123"),("nhathuy","nhathuy123"),("thanhhiep","thanhhiep123"),("quangminh","quangminh123"),("ducduy","ducduy123"),("hoanganh","hoanganh123");
select * from tai_khoan;

insert into lop_hoc (ten_lop_hoc) value ("a0721i1"),("a0721i2"),("a0720i1"),("a0720i2"),("a0719i2"),("a0719i1"),("a0718i2");
select * from lop_hoc;

insert into giang_vien (ten_giang_vien,ngay_sinh ) value ("trung doan",'2021-01-01'),("viet tran",'2021-01-01'),("chanh tran",'2021-01-01'),("hai truong",'2021-01-01'),("quoc nguyen",'2021-01-01'),("linh nguyen",'2021-01-01'),("thu dang",'2021-01-01');
select * from giang_vien;

insert into hoc_vien (ten_hoc_vien ,ngay_sinh ,email ,username ,ma_lop_hoc ) value ("huu hung",'2000-01-17',"tranhuuhunghk@gmail.com","huuhung",1), ("hien mai",'1998-10-22',"hienmai@gmail.com","hienmai",2),("nhat huy",'2000-01-01',"nhathuy@gmail.com","nhathuy",1),("thanh hiep",'2000-07-02',"thanhhiep@gmail.com","thanhhiep",2),("quang minh",'2000-04-01',"quangminh@gmail.com","quangminh",3),("duc duy",'2000-04-22',"ducduy@gmail.com","ducduy",4),("hoang anh",'2000-04-22',"hoanganh@gmail.com","hoanganh",5);
select * from hoc_vien;

insert into dia_chi (dia_chi, ma_hoc_vien ) value ("da nang", 1),("ho chi minh", 2),("da nang", 3),("da nang", 4),("da nang", 5),("da nang", 6),("da nang", 7);
select * from dia_chi;

insert into giang_vien_day_lop_hoc (ma_giang_vien ,ma_lop_hoc ) value (1,2),(1,1),(2,2),(5,3),(3,3),(4,4),(6,6);
select * from giang_vien_day_lop_hoc;
