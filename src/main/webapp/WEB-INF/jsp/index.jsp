<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    

  
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand -->
  <a class="navbar-brand" href="#">LMS</a>

  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="/">All Books</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">New Book</a>
    </li>


  </ul>
</nav>
<br>
  
<div class="container">
	

	<table class="table table-striped">
    <thead>
      <tr>
        <th>Id</th>
        <th>Book name</th>
        <th>Author</th>
        <th>Purchase_date</th>
        <th>Edit</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${books}" var="book">
      <tr>
      
      		<td> ${book.id} </td>
      		<td> ${book.book_name}</td>
      		<td> ${book.author}</td>
      		<td> ${book.purchaseDate}</td>
      		<td> <a href="updateBook?id=${book.id}">  <span class="glyphicon glyphicon-pencil"> edit </span> </a></td>
      </tr>
	</c:forEach>      
    </tbody>
  </table>


	
	<form class="form-inline">
    <div class="form-group">
      <label class="sr-only" for="name">Name:</label>
      <input type="text" class="form-control" value="${book.name_book}" id="name" placeholder="Name"  name="name">
    </div>
    <div class="form-group">
      <label class="sr-only" for="author">Author:</label>
       <input type="text" class="form-control" id="author" value="${book.author}" placeholder="Author"  name="author">
    </div>
   <div class="form-group">
      <label class="sr-only" for="date">Date:</label>
       <input type="date" class="form-control" id="date" value="${book.purchaseDate}" placeholder="Date"  name="date">
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
   </form>
   
		

</div>

</body>
</html>
