<%@page import="entite.compte"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
</head>
<body>
<p>hahwa ${cltup.id}</p>
    <div id="login">
        <h3 class="text-center text-white pt-5">Login form</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form class="form" action="updateclt" method="post">
                            <h3 class="text-center text-info">Login</h3>
                            <div class="form-group">
                              <input type="hidden" name="eed" value="${cltup.id}">  
                                <label for="nom" class="text-info">nom client :</label><br>
                                <input type="text" name="nom" id="nom" class="form-control" value="${cltup.nom} ">
                            </div>
                            <div class="form-group">
                                <label for="prenom" class="text-info">prenom client :</label><br>
                                <input type="text" name="prenom" id="prenom" class="form-control" value="${cltup.prenom}">
                            </div>
                             <div class="form-group">
                                <label for="cin" class="text-info">cin client :</label><br>
                                <input type="text" name="cin" id="cin" class="form-control" value="${cltup.cin }">
                            </div>
                             <div class="form-group">
                                <label for="idcompte" class="text-info">id du compte:</label><br>
                                <input type="number" name="compt_id" id="idcompte" class="form-control" value="${cltup.compte_id.id }">
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