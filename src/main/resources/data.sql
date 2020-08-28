DROP TABLE IF EXISTS BOOK;
create table BOOK (
    book_id VARCHAR(10) PRIMARY KEY,
    book_name VARCHAR(100),
    book_author VARCHAR(100),
    book_category VARCHAR(20),
    book_desc VARCHAR(300)
);
insert into BOOK values('1', 'A Suitable Boy', 'Vikram Seth', 'Fiction', 'Story about an Indian family trying to find a perfect match for their daughter');
insert into BOOK values('2', 'White Tiger', 'Arvind Adiga', 'Fiction', 'Dark story of poor person rising through economic ranks');
insert into BOOK values('3', 'Freedom at midnight', 'Dominique Lapierre', 'Non-Fiction', 'Story of the events surrounding Indian independence');
insert into BOOK values('4', 'Alchemist', 'Paulo Coelho', 'Fiction', 'A shepherd boy travels to the Egyptian desert in search of a treasure');
insert into BOOK values('5', 'Wings of Fire', 'A.P.J Abdul Kalam', 'Autobiography', 'The son of a little-educated boat-owner in South India, had an unparalleled career as a defence scientist and he eventually became President of India');
insert into BOOK values('6', 'City of Djinns', 'William Dalrymple', 'Non-Fiction', 'The author explores the centuries of history of Delhi, India');
insert into BOOK values('7', 'Without Fear', 'Kuldip Nayar', 'Non-Fiction', 'The Life & Trial of Bhagat Singh - Indian revolutionary');
