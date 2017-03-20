create table if not exists post(
	zipcode char(5) null,
	sido varchar(20) null,
	sigungu varchar(20) null,
	doro varchar(20) null,
	building1 int(5) null,
	building2 int(5) null
);

drop table post;
delete from post;


		

LOAD data LOCAL INFILE 'C:/Users/lee/git/Post/DataFiles세종특별자치시.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

select * from post;

LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/강원도.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/경기도.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/경상남도.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/경상북도.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/광주광역시.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/대구광역시.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/부산광역시.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/서울특별시.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/울산광역시.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/인천광역시.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/전라남도.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;
LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/전라북도.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;


LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/제주특별자치도.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/충청남도.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/충청북도.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;


LOAD data LOCAL INFILE 'D:/workspace_mybatis/postZipFinder/DataFiles/대전광역시.txt' 
INTO table  post   
character set 'euckr'  
fields TERMINATED by '|' 
IGNORE 1 lines 
(@zipcode, @sido, @d, @sigungu , @d, @d, @d, @d, @doro, @d, @d, @building1, @building2, @d, @d, @d, @d, @d, @d ,@d, @d, @d, @d, @d, @d, @d) 
set zipcode=@zipcode, sido=@sido, sigungu=@sigungu, doro=@doro, building1=@building1, building2=@building2;

create index idx_post_sido on post(sido);
create index idx_post_doro on post(doro);

select * from post;


select * from post where sido='울산광역시';

SELECT zipcode, sido, sigungu, doro, building1, building2	FROM post where sido like '대구';

SELECT zipcode, sido, sigungu, doro, building1, building2	FROM post where sido like '%대구%' and doro like '%상화로%';

 SELECT zipcode, sido, sigungu, doro, building1, building2   FROM post     
