# Library
  
```sql
CREATE TABLE staff(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL,
birth DATE,
address TEXT NOT NULL,
phone VARCHAR(10)
)
```
```sql
CREATE TABLE readers(
id INT KEY PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL,
birth DATE,
phone VARCHAR(10),
addrress TEXT NOT NULL
)
```
```sql
CREATE TABLE author(
id INT PRIMARY KEY AUTO_INCREMENT ,
name TEXT NOT NULL,
dates DATE
)
```
```sql
CREATE TABLE book(
id INT PRIMARY KEY AUTO_INCREMENT ,
name TEXT NOT NULL,
year_release DATE,
amount INT NOT NULL,
recommend TEXT NOT NULL,
img TEXT NOT NULL
)
```
```sql
CREATE TABLE id_author(
id_book INT,
id_author INT,
PRIMARY KEY (id_book ,id_author),
FOREIGN KEY (id_book) REFERENCES book(id),
FOREIGN KEY (id_author) REFERENCES author (id)
)

```
```sql
CREATE TABLE category(
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL
)
```
```sql
CREATE TABLE id_category(
id_book INT,
id_category INT,
PRIMARY KEY (id_category,id_book),

FOREIGN KEY (id_book) REFERENCES book(id),
FOREIGN KEY (id_category) REFERENCES category (id)
)
```
```sql
CREATE TABLE publisher (
id INT PRIMARY KEY AUTO_INCREMENT,
name TEXT NOT NULL
)
```
```sql
CREATE TABLE id_publisher (
id_book INT ,
id_publisher INT,
PRIMARY KEY (id_publisher,id_book),
FOREIGN KEY (id_book) REFERENCES book(id),
FOREIGN KEY (id_publisher) REFERENCES publisher(id)
)
```
```sql
CREATE TABLE borrow (
id INT PRIMARY KEY AUTO_INCREMENT ,
name TEXT NOT NULL,
id_book INT,
dates DATE,
id_readers INT,
amount INT,
id_staff INT,
FOREIGN KEY (id_book) REFERENCES book (id),
FOREIGN KEY (id_staff) REFERENCES staff (id),
FOREIGN KEY (id_readers) REFERENCES readers (id)
)
```
```sql
CREATE TABLE id_borrow(
id_book INT ,
id_borrow INT,
PRIMARY KEY (id_borrow,id_book),
FOREIGN KEY (id_book) REFERENCES book (id),
FOREIGN KEY (id_borrow) REFERENCES borrow (id)
)
```
```sql
CREATE TABLE back(
id INT PRIMARY KEY AUTO_INCREMENT ,
id_borrow INT,
dates DATE,
amount INT,
status TEXT NOT NULL,
id_staff INT,

FOREIGN KEY (id_borrow) REFERENCES borrow (id),
FOREIGN KEY (id_staff) REFERENCES staff (id)
)
```
  
`author`  
 
![image](1.jpg)
  
`back`  
 
![image](2.jpg)  
`book`  
 
![image](3.jpg)  
`borrow`  
 
![image](4.jpg)  
`category`  
 
![image](5.jpg)  
`id author`  
 
![image](6.jpg)  
`id borrow`  
 
![image](7.jpg)  
`id category`  
 
![image](8.jpg)  
`id publisher`  
 
![image](9.jpg)  
`publisher`  
 
![image](10.jpg)  
`readers`  
 
![image](11.jpg)  
`staff`  
 
![image](12.jpg)