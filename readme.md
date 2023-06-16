
## Table DDL

```sql
  CREATE TABLE "APP_USER1"."APP_TABLE2" 
   (	"ID" VARCHAR2(20 BYTE), 
	"DATE_AS_TIMESTAMP" DATE, 
	"DATE_AS_DATE" DATE, 
	"TIMESTAMP_AS_TIMESTAMP" TIMESTAMP (6)
   ) SEGMENT CREATION IMMEDIATE 
```



| DB Column Name         | Column Format | Java Type          | Format |
| ---------------------- | ------------- | ------------------ | ------ |
| DATE_AS_TIMESTAMP      | DATE          | java.sql.Timestamp |        |
| DATE_AS_DATE           | DATE          | java.util.Date     |        |
| TIMESTAMP_AS_TIMESTAMP | TIMESTAMP     | java.sql.Timestamp |        |