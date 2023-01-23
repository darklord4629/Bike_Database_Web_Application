<%@page import="com.js.dto.Bike"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bike Data</title>
<style>
        body{
            background-image: linear-gradient(to bottom right,rgba(255, 136, 0, 0.582) 60%,rgba(15, 221, 15, 0.521));
            background-attachment:fixed ;
        }
        td,th{
            /* border: 1px solid rgb(18, 31, 209); */
            
        }
        td,th{
            padding: 18px;

        }
        th{
            border-right: 0.1px solid black;
            background-color: rgb(235, 230, 230);
        }
        th:last-child,td:last-child{
            border: none;
        }
        table{
        	position: absolute;
        	top:10%;
        	left: 20%;
            border-spacing: 0;
            font-size: 25px;
            font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
        }
        td{
            border-right: .1px solid white;
            background-color: #252525;
            color: aliceblue;
            
        }
        a {
			text-decoration: none;
			color:white;
			border-radius: 7px;
		}
		#a1{
		position:absolute;
		left: 5%;
		color:white;
		background-image:linear-gradient(grey,black);
		border-radius:5px;
		font-size:35px;
		}
		#a1:hover{
			background-image:linear-gradient(black,grey);
		}
    </style>
</head>
<body >
    <table >
        <tr>
            <th>BID</th>
            <th>MODEL NAME</th>
            <th>CC</th>
            <th>PRICE</th>
            <th>DELETE</th>
            <th>UPDATE</th>
        </tr>
        <% ArrayList<Bike> al=(ArrayList)request.getAttribute("data");
        for(Bike b:al){%>
        <tr>
            <td><%=b.getBid() %></td>
            <td><%=b.getModelname() %></td>
            <td><%=b.getCc() %></td>
            <td><%=b.getPrice() %></td>
            <td><a href="delete?bid=<%=b.getBid()%>" ><u>DELETE</u></a>
            <td><a href="update?bid=<%=b.getBid() %>"><u>Edit</u></a>
        </tr>
        <%} %>
    </table>
    <a href="homepage.html" id=a1>Home</a>

</body>
</html>