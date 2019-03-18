<%-- 
    Document   : Actualiza
    Created on : Sep 3, 2017, 3:52:47 PM
    Author     : Administrator
--%>

<%@page import="Modelos2.Boleta"%>
<%@page import="modelos.Boleteria"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel='stylesheet' id='style-css'  href='estilo.css' type='text/css' media='all'>
     <head>
        
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
 
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
    </head>
       
    <body>
         <div class="row">
            <div class="col col-md"></div>
            <div class="col-10 col-md-3">

          <h2>Actualizar Datos</h2>
             
             <form  action="editarbo" method="post">
       
        <%
          session.setAttribute("id", Integer.parseInt(request.getParameter("id")));
        
        int id;
        id=Integer.parseInt(request.getParameter("id"));
       //  out.println(id);
      

  Boleta op=new Boleta();
  List<Boleteria> resultado = op.updatebo(id);
         
      for(Boleteria u:resultado){
    %>
        

    
 <div class="form-group"><label>Id</label></div>
 <div class="form-group">
 <input type="text" name="id"  class="form-control" value="<%=u.getIdBoleteria()%>">
     </div>
     
 <div class="form-group"><label>Cantidad</label></div>
 <div class="form-group"> 
  <input type="text" class="form-control" name="cantidad" value="<%=u.getCantidad()%>">
       </div>
       
  <div class="form-group"><label>Precio</label></div>
 <div class="form-group">      
<input type="text" class="form-control" name="precio" value="<%=u.getPrecio()%>">
 </div>


       
    
        <%       
        } 
        //
        %>
   
             <input type="submit" class="btn btn-success" value="Enviar">
   </form>
             </div>
            <div class="col col-md"></div>
        </div>
        
         
        
    </body>
</html>
