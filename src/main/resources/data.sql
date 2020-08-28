DROP TABLE IF EXISTS BOOK;
create table BOOK (
    book_id VARCHAR(10) PRIMARY KEY,
    book_name VARCHAR(100),
    book_author VARCHAR(100),
    book_category VARCHAR(20),
    book_desc VARCHAR(200)
);
insert into BOOK values('1', 'A Suitable Boy', 'Vikram Seth', 'Fiction', 'Story about an Indian family trying to find a perfect match for their daughter');
insert into BOOK values('2', 'White Tiger', 'Arvind Adiga', 'Fiction', 'Dark story of poor person rising through economic ranks');
insert into BOOK values('3', 'Freedom at midnight', 'Dominique Lapierre', 'Non-Fiction', 'Story of the events surrounding Indian independence');