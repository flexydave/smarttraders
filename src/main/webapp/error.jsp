

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="index.css">
    <link rel="stylesheet" href="privacy.css">
    <link rel="stylesheet" href="bootstrap-icons/bootstrap-icons.css">
    <link rel="stylesheet" href="login.css">
    <title>error</title>
</head>




<style>
    .container{ 
        height: 100vh;
    }

    .container > .flex > form > .header > h1{ 
        font-size: 2rem;
        text-transform: uppercase;
    }
    .container > .flex > form > .header{ 
        position: relative;
        top: 30%;
        width: 100%;
    }
</style>
<body>
    <div class="container">
        <section class="home">
            <nav>
                <div class="mini">
                    <p><a href="index.html">SMART TRADERS</a></p>
                </div>
            </nav>
        </section>

       
        <img src="images/img15.png" alt="img">
        <img src="images/img16.png" alt="img">
        <div class="flex">
            <img src="images/img14.png" alt="img">
            <form>
                <div class="header">
                    <h1> <%=request.getAttribute("err").toString(); %></h1>
                </div>
            </form>
        </div>
       
    </div>
</body>

</html>
