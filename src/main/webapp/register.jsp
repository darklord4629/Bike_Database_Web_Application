<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Bike</title>
<style>
        body{
            background-image: linear-gradient(to bottom right,rgba(255, 136, 0, 0.582) 60%,rgba(15, 221, 15, 0.521));
            background-attachment:fixed ;
        }
        
        .container{
            width: 500px;
            height: 450px;
            background-image: linear-gradient(to bottom right,#252525,rgb(25, 0, 255));
            border-radius: 25px;
            position: absolute;
            top: 20%;
            left: 33%;
        }
        input{
            width: 450px;
            margin: 20px;
            background: none;
            outline: none;
            border: none;
            border-bottom: 2px solid white;
            height: 30px;
            color: #fff;
            font-size: 20px;
            padding-left: 10px;
        }
        input:hover{
            transform: scale(1.0041,1.0401);
        }
        
        #save{
            width: 100px;
            border: 2px solid white;
            margin-left: 38%;
        }
        #save:hover{
            cursor:grab;
            transform: scale(1.3,1.3);
            background-color: rgb(32, 30, 30);
            border:none;
            transition:.4s ease-in-out; 
        }
        h1{
            color: rgb(228, 224, 224);
            text-align: center;
            position: relative;
            top: 20px;

        }
        
    </style>
</head>
<body>
    
    <div class="container">
    <form action="insert">
        <h1>Enter The Details</h1>
        <input type="number" name="bid" placeholder="BID">
        <input type="text" name="name" placeholder="Model Name">
        <input type="number" name="cc" placeholder="CC">
        <input type="number" name="price" placeholder="Price in Rs">
        <input type="submit" value="Save" id="save">
    </form>
    </div>
</body>
</html>