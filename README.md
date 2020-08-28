# bookinfo

This is a REST appliacation which provides information about books.

Controller endpoints: 


1. http://<ip>:8081/goodbooks/books/<book id>
  
  Output Json example:

  {
      "bookId": "3",
      "bookName": "Freedom at midnight",
      "bookAuthor": "Dominique Lapierre",
      "bookCategory": "Non-Fiction",
      "bookDescription": "Story of the events surrounding Indian independence"
  }

Port can be configured in application.yml

Database used is H2 in-memory database.
  H2 console: http://<ip>:8081/h2
  H2 url: jdbc:h2:mem:infodb
