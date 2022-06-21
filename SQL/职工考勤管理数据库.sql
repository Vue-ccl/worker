	-- ***判断要创建的数据库是否存在，如果存在，则先删除***
use master -- 切换到系统数据库
-- 下面先判断数据库是否存在，如果存在就先删除。
-- if exists( ) 判断( )里的语句是否返回值，若返回值就返回True，否则false
-- select * from sysdatabases where name='Test4' --选择

if exists(select * from sysdatabases where name='Attend')  -- 如果存在，则if 结果为True
drop database Attend -- 如果存在就删除
go -- 表明上面内容交给服务器去完成

create database Attend  --数据库名称
on -- primary  -- on 文件组  （primary为默认组，写不写都可以）
(   -- 主数据文件
name=Attend_data,  -- 数据文件逻辑名称
size=5,  --mb,  -- 逗号必须加mb单位不写也默认是MB
filegrowth=10, --%,  -- 单位%不写默认是以MB方式增长
maxsize=100mb,
filename='D:\Softwares\SQLServer_2012\Samples\MSSQL11.MSSQLSERVER\MSSQL\DATA\Attend_data.mdf' 
), 

(   -- 次数据文件
name=Attend_data1,  -- 数据文件逻辑名称
size=5mb,  -- 逗号必须加。mb单位不写也默认是MB
filegrowth=10%,  -- 单位%不写默认是以MB方式增长
maxsize=100mb,
filename='D:\Softwares\SQLServer_2012\Samples\MSSQL11.MSSQLSERVER\MSSQL\DATA\Attend_data1.ndf' 
) 

log on -- 日志不属于文件组
(
name='Attend_log', -- 这里单引号可加可不加
size=1mb,
filegrowth=10%,
maxsize=100mb,
filename='D:\Softwares\SQLServer_2012\Samples\MSSQL11.MSSQLSERVER\MSSQL\DATA\Attend_log.ldf' 
)
--以上为创建数据库Attend。

use Attend
create table adminuser (
id int identity(1,1) not null constraint PK_id primary key,
name char(30) not null,
sex nchar(2) not null,
age int not null,
prof char(30) not null,
username char(30) not null,
password varchar(30) not null,
root int not null
)
insert into adminuser
		select'张三','男',29,'法外狂徒','zhangsan','123456',0union
		select'老八','男',29,'美食家','laoba','123456',0union
		select'新二','男',29,'雷霆嘎巴','xiner','123456',0




use Attend
create table chuqin (--创建出勤表
wd int identity(1,1) not null,
id int not null,
uutime time(0) null,
untime time(0) null,
nutime time(0) null,
nntime time(0) null,
abcord char(30) not null,
dday date not null,
constraint PK_chuqin primary key(wd,id)
)
insert into chuqin
		select'8','9:00','12:00','14:00','17:00','否','2020-7-9'union
		select'9','9:00','12:00','14:00','17:00','否','2020-7-9'union
		select'10','9:00','12:00','14:00','17:00','否','2020-7-9'union
		select'7','9:00','12:00','14:00','17:00','否','2020-7-9'union
		select'8','9:00','12:00','14:00','17:00','否','2020-7-10'union
		select'9','','','','','是','2020-7-10'union
		select'10','9:00','12:00','14:00','17:00','否','2020-7-10'union
		select'7','','','','','是','2020-7-10'

use Attend
create table jiaban (--创建加班表
jd int identity(1,1) not null ,
id int not null ,
stime time(0) not null,
endtime time(0) not null,
sumtime int not null,
dday date not null,
constraint PK_jiaban primary key(jd,id)
)
insert into jiaban
		select'8','19:00','21:00','2','2020-7-10'union
		select'9','19:00','21:00','2','2020-7-10'union
		select'10','19:00','21:00','2','2020-7-10'union
		select'7','19:00','21:00','2','2020-7-10'

create table chuchai (--创建出差表
cd int identity(1,1) not null,
id int not null,
stime date not null,
endtime date not null,
sumtime int not null
constraint PK_chuchai primary key(cd,id)
)
insert into chuchai
		select'8','2020-7-11','2020-7-13','2'union
		select'9','2020-7-11','2020-7-13','2'union
		select'10','2020-7-11','2020-7-13','2'union
		select'7','2020-7-11','2020-7-13','2'

create table qingjia (--创建请假表
qd int identity(1,1) not null,
id int not null,
stime date not null,
endtime date not null,
sumtime int not null
constraint PK_qingjia primary key(qd,id)
)
insert into qingjia
		select'8','2020-5-25','2020-5-30','5'union
		select'9','2020-5-25','2020-5-30','5'union
		select'10','2020-5-25','2020-5-30','5'union
		select'7','2020-5-25','2020-5-30','5'


-- SELECT*
-- FROM adminuser
-- WHERE username 

--删除表数据
--DELETE from  chuqin where wd=11


--删除表
----use Attend
----DROP TABLE jiaban

--创建表
----use Attend
----create table chuqin      
  
--查看表 
--use Attend
--select *
--from chuqin


--创建触发器
use Attend
GO
CREATE TRIGGER del_jiaban ON adminuser
AFTER DELETE
AS
	DELETE FROM jiaban
	WHERE jiaban.id 
	IN(SELECT id FROM DELETED)



insert into chuqin
		select'2','9:00','12:00','14:00','17:00','否','2020-7-6'union
		select'3','9:00','12:00','14:00','17:00','否','2020-7-6'union
		select'4','9:00','12:00','14:00','17:00','否','2020-7-6'union
		select'7','9:00','12:00','14:00','17:00','否','2020-7-6'union
		select'2','9:00','12:00','14:00','17:00','否','2020-7-6'