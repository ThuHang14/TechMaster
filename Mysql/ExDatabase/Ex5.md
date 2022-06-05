


- question  
``` sql
CREATE TABLE question(
id INT PRIMARY KEY AUTO_INCREMENT,
title TEXT NOT NULL,
types ENUM('S','M')
)
```
![image](https://user-images.githubusercontent.com/96046778/155837374-d24fef1a-8d5d-4ae2-8ed2-f4d4b142c60b.png)

- answer  
```sql
CREATE TABLE answer(
id INT PRIMARY KEY AUTO_INCREMENT,
content TEXT NOT NULL,
checks ENUM('True','False')
)
```
![image](https://user-images.githubusercontent.com/96046778/155837388-c1ead71b-2d71-4159-aa4a-e39f5e7967fc.png)
 
 - id  
```sql
CREATE TABLE id_answer(
id_answer INT,
id_question INT,
PRIMARY KEY (id_question,id_answer),
FOREIGN KEY (id_question) REFERENCES question (id) ,
FOREIGN KEY (id_answer) REFERENCES answer (id) 
)
```
![image](https://user-images.githubusercontent.com/96046778/155837409-8d00ff39-20c9-42a7-8776-7f8bbeadbc6a.png)



