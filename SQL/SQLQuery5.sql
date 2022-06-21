--请假与出勤不重复触发器
GO 
CREATE TRIGGER insert_qingjia ON qingjia
INSTEAD OF INSERT
AS 
	declare @start date
	declare @end date
	set @start = (select stime from INSERTED)
	set @end = (select endtime from INSERTED)

	IF EXISTS ( SELECT * FROM chuqin WHERE (select dday from INSERTED where chuqin.id=INSERTED.id) IN
	(select dateadd(dd,num,@start)
		FROM (SELECT ROW_NUMBER() OVER (ORDER BY ID)-1 AS num FROM sysobjects) KK
			where dateadd(dd,num,@start) <=@end))
		ROLLBACK TRANSACTION
	ELSE
		BEGIN	
		INSERT INTO qingjia SELECT id,stime,endtime,sumtime FROM INSERTED
		PRINT 'GOOD'
		END
	

