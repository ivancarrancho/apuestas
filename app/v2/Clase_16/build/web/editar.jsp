<%-- 
    Document   : index
    Created on : 27-ago-2017, 12:41:34
    Author     : mmcadmin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelos.Usuarios"%>
<%@page import="modelos.UsuariosOperaciones"%>
<%@page import="java.util.List"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
        
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
 
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
    </head>
    <BODY>
        <div class="row">
            <div class="col col-md"></div>
            <div class="col-10 col-md-3">
        <form action="lista.jsp">
     <div class="form-group"><label>Buscar Usuario</label></div>
     
                    <div class="form-group">
              <select name="id" class="form-group">
            
                       
        <%
     UsuariosOperaciones op=new UsuariosOperaciones();
        
        List<Usuarios> datos=new ArrayList<Usuarios>();
        
        datos = op.getUsuarios();
    
       for(Usuarios u:datos){
    %>
  
    <option value="<%=u.getId()%>"><%=u.getNombre()%></option>

    <%
    }
     %>   
     

   </select>
       </div>
           
         <input type="submit" class="btn btn-success" value="Enviar">
   

 </form>
         </div>
            <div class="col col-md"></div>
        </div>
        
    </BODY>
    
</html>