--出勤日期不重复触发器
GO 
CREATE TRIGGER insert_chuqin ON chuqin
INSTEAD OF INSERT
AS 

	IF EXISTS ( SELECT * FROM INSERTED WHERE INSERTED.dday IN(SELECT chuqin.dday FROM chuqin WHERE chuqin.id=INSERTED.id))
		ROLLBACK TRANSACTION
	ELSE
		BEGIN	
		INSERT INTO chuqin SELECT id,uutime,untime,nutime,nntime,abcord,dday FROM INSERTED
		PRINT 'GOOD'
		END
