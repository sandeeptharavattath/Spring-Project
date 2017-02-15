<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<title>Registration</title>
</head>
<body style="background-color: gray;">
<form:form name="Save" action="save" method="POST" enctype="multipart/form-data">
<div class="container-fluid">
      <div class="row" align="center" style="background-color:  #98AFC7 ;">
          <h1>Register Your Details</h1>
      </div>
      <div style="background-color: #BF988F;">
      <div class="row" style="margin-top: 20px;">
         <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-left: 40px; padding-top: 40px;">
               <label>First Name : </label>
        
         </div>
         <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-right: 40px; padding-top: 40px;">
              <input type="text" name="fname" id="fname" class="form-control" required="">
         </div>
      </div>
      <div class="row">
         <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-left: 40px; padding-top: 20px;">
             <label>Last Name : </label>
         </div>
         <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-right: 40px; padding-top: 20px;">
             <input type="text" name="lname" id="lname" class="form-control" required="">
         </div>
      </div>
      <div class="row">
          <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-left: 40px; padding-top: 20px;">
              <label>Gender : </label>
          </div>
          <div class="col-md-3 col-lg-3 col-sm=6 col-xs-6" style="padding-left: 40px; padding-top: 20px;">
             <div class="radio">
              <input type="radio" name="gen" value="Male">
              <label>Male</label>
              </div>
          </div>
          <div class="col-md-3 col-lg-3 col-sm=6 col-xs-6" style="padding-right: 40px; padding-top: 20px;">
             <div class="radio">
              <input type="radio" name="gen" value="Female">
              <label>Female</label>
              </div>
          </div>
      </div>
      <div class="row">
        <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-left: 40px; padding-top: 20px;">
            <label>Date Of Birth :</label>
        </div>
        <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-right: 40px; padding-top: 20px;">
           <input type="text" name="dob" id="dob" class="form-control" required="">
        </div>
      </div>
      <div class="row">
           <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-left: 40px; padding-top: 20px;">
              <label>E-Mail : </label>
           </div>
           <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-right: 40px; padding-top: 20px;">
              <input type="text" name="email" id="email" class="form-control" required="">
           </div>
      </div>
      <div class="row">
           <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-left: 40px; padding-top: 20px;">
              <label>Username : </label>
           </div>
           <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-right: 40px; padding-top: 20px;">
              <input type="text" name="uname" id="uname" class="form-control" required="">
           </div>
      </div>
      <div class="row">
           <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-left: 40px; padding-top: 20px;">
              <label>Password : </label>
           </div>
           <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-right: 40px; padding-top: 20px;">
              <input type="password" name="pswd" id="pswd" class="form-control" required="">
           </div>
      </div>
      <div class="row">
           <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-left: 40px; padding-top: 20px;">
           <label>Upload Your File : </label>
           </div>
           <div class="col-md-6 col-lg-6 col-sm=12 col-xs-12" style="padding-right: 40px; padding-top: 20px;">
           <input type="file" name="file" id="file" class="form-control">
           </div>
      </div>
      <div class="row">
         <div class="col-md-12 col-lg-12 col-sm=12 col-xs-12" style="padding-right: 40px; padding-top: 20px; padding-bottom: 20px;" align="center">
            <button type="submit" class="btn btn-primary">Submit</button>
         </div>
      </div>
      </div>
</div>
</form:form>
</body>
</html>