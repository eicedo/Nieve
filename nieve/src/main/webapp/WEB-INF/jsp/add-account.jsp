<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
    <meta charset="utf-8">
    <title>Nieve Add Account</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/cover/">

    <!-- Bootstrap core CSS -->
<link href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="cover.css" rel="stylesheet">
  </head>


<body class="text-center">
    <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
  <header class="masthead mb-auto">
    <div class="inner">
      <h3 class="masthead-brand">Add Account</h3>
      <nav class="nav nav-masthead justify-content-center">
      <li ><a class="glyphicon glyphicon-home" href="/home">Home</a></li>
      </nav>
    </div>
    
  </header>

  <main role="main" class="inner cover">
     
     
<form:form action = "/add-account" modelAttribute="account" method = "post">

  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputAccountName">Account Name</label>
      <form:input path="accountName" type="text" class="form-control" id="inputAccountName"/>
    </div>
 	<div class="form-group col-md-6">
      <label for="totalAmount">Total Amount</label>
      <form:input path="totalAmount" class="form-control"/>
    </div>
    <div class="form-group col-md-6">
      <label for="interest">Interest</label>
      <form:input path="interest" class="form-control"/>
    </div>
  </div>
    <div class="form-row"> 
   <div class="form-group col-md-6">
      <label for="minPayment">Minimum Payment</label>
      <form:input path="minPayment" class="form-control"/>
    </div>  
    <div class="form-group col-md-6">
      <label for="loanLength">Loan Length</label>
      <form:input path="loanLength" class="form-control"/>
    </div>
   </div>
  <button type="submit" class="btn btn-primary">Add</button>
</form:form>

</html>