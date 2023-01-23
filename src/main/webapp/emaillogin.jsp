<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
 <style>
        body{
            background-image: linear-gradient(to top left,red,blue);
        }
        .box{
            border: 1.8px solid rgba(139, 134, 134, 0.596);
            width: 450px;
            height: 500px;
            border-radius: 2%;
            margin: auto;
            margin-top: 7%;
            margin-bottom: 7%;
            background-color: white;
        }
        h1{
            font-weight: 500;
            font-family:  system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
            text-align: center;
        }
        h3{
            text-align: center;
            font-weight: 10;
            font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
        }
        .bs{
            text-align: center;
            color: rgb(0, 110, 255);
            font-size: 35px;
            font-family: trebuchet MS;
        }
        input{
            
            width: 350px;
            height: 35px;
            font-size: 110%;
            margin-left: 8%;
            padding-left: 10px;
            outline: none;
            background-color: rgb(233, 241, 241);
            border: .5px solid grey;
            color: #252525;
             
            
        
        }
        
        button{
            width: 80px;
            height: 30px;
            background-color: rgb(38, 0, 255);
            color: white;
            font-size: 100%;
            border: none;
            border-radius: 4px;
            position: relative;
            left: 70%;
            top: 10%;
        }
        button:hover{
            background-color: rgb(29, 1, 182);
            cursor: pointer ;
        }


    </style>
</head>
<body>
    <div class="box"><br><br><br><br><br><br>
        <div class="bs"> BIKE SHOWROOM</div>
        <h1>Sign in</h1>
        <h3>Use your Showroom Account</h3>
        <form action="emaillogin">
            
            <input type="email" name="email" id="" placeholder="Email" required><br><br>
        <button type="submit">Next</button>
        </form>
    </div>

</body>
</html>