<%@page import="entite.compte"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
</head>
<body>
<%  compte ss = (compte) request.getAttribute("UP"); %>
<h1><% out.print(ss.getId()); %></h1>
<h1><% out.println(ss.getNumCompte()); %></h1>
<h1><% out.println(ss.getId()); %></h1>
    <div id="login">
        <h3 class="text-center text-white pt-5">Login form</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form class="form" action="modifierC" method="post">
                            <h3 class="text-center text-info">Login</h3>
                            <div class="form-group">
                             <input type="hidden" name="ed" value="<%out.print(ss.getId());%>"> 
                                <label for="username" class="text-info">Numero du compte:</label><br>
                                <input type="text" name="numC" id="username" class="form-control" value="<%out.print(ss.getNumCompte());%>">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Solde du compte:</label><br>
                                <input type="text" name="soldC" id="password" class="form-control" value="<%out.print(ss.getSolde());%>">
                            </div>
                            <div class="form-group">
                                
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="submit">
                            </div>
                       
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>