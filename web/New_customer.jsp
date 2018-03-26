<%-- 
    Document   : New_Customer
    Created on : Mar 14, 2018, 12:14:08 PM
    Author     : Mitchell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Customer</title>
    </head>
    <body>
        <h1>New Customer</h1><br>
        <form action="newCustomer" method="POST">
            First Name:<br>
            <input type="text" name="FirstName"><br>
            Last Name:<br>
            <input type="text" name="LastName"><br>
            Phone:<br>
            <input type="tel" name="Phone"><br>
            Address:<br>
            <input type="text" name="Address"><br>
            City:<br>
            <input type="text" name="City"><br>
            State:<br>
            <input type="text" name="State"><br>
            Zip Code:<br>
            <input type="text" name="Zipcode"><br>
            Email:<br>
            <input type="email" name="Email"><br>
            <input type="submit" value="Submit">
        </form>
        <span>${NewCustomerServlet.message}</span>
    </body>
</html>
