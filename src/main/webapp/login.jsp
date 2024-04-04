<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="style.css" />
  <title>Form</title>
</head>
<body>
  <div class="login-wrap">
    <div class="login-html">
      <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
      <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
      <div class="login-form">
      <form action="login" method="post">
        <div class="sign-in-htm">
          <div class="group">
            <label for="user" class="label">Username</label>
            <input id="user" type="text" class="input" name="uname">
          </div>
          <div class="group">
            <label for="pass" class="label">Password</label>
            <input id="pass" type="password" class="input" data-type="password" name="upass">
          </div>
          <div class="group">
            <input id="check" type="checkbox" class="check" checked>
            <label for="check"><span class="icon"></span> Keep me Signed in</label>
          </div>
          <div class="group">
            <input type="submit" class="button" value="Sign In" name="submit">
          </div>
          <div class="hr"></div>
          <div class="foot-lnk">
            <a href="/learning/displaydatabase">Get All Data</a>
          </div>
        </div>
        </form>
        <div class="sign-up-htm">
        <form action="register" method="post">
          <div class="group">
            <label for="user" class="label">Username</label>
            <input id="user" type="text" class="input" name="uname">
          </div>
          <div class="group">
            <label for="pass" class="label">Password</label>
            <input id="pass" type="password" class="input" data-type="password" name="upass">
          </div>
          <div class="group">
            <label for="pass" class="label">Repeat Password</label>
            <input id="pass" type="password" class="input" data-type="password">
          </div>
          <div class="group">
            <label for="pass" class="label">Email Address</label>
            <input id="pass" type="text" class="input">
          </div>
          <div class="group">
            <input type="submit" class="button" value="Sign Up" name="submit">
          </div>
          <div class="hr"></div>
          <div class="foot-lnk">
            <label for="tab-1">Already Member?</label>
          </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</body>
</html>


<!-- 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            width: 50%;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #333;
        }
        form {
            margin-top: 20px;
            text-align: center;
        }
        form label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        form input[type="text"],
        form input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 3px;
            box-sizing: border-box;
        }
        form input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
        h4 {
            text-align: center;
            margin-top: 20px;
        }
        h4 a {
            color: #007bff;
            text-decoration: none;
        }
        .register-button {
        display: block;
        width: 100%;
        padding: 10px;
        background-color: #28a745;
        color: #fff;
        border: none;
        border-radius: 3px;
        cursor: pointer;
        text-decoration: none;
        text-align: center;
    }
    </style>
</head>
<body>
    <div class="container">
        <h2>Login Page!!!</h2>
        <form action="login" method="post">
            <label>Enter username :</label><br>
            <input type="text" name="uname"><br>
            <label>Enter password :</label><br>
            <input type="password" name="upass"><br>
            <input type="submit" name="submit" value="Login">
        </form>
        <h4>For Register </h4><br/>
        <a href="register.jsp" class="register-button">Register</a>
        <form action="getdata">
            <label>Enter User Id:</label><br>
            <input type="text" name="uid"><br>
            <input type="submit" name="submit" value="Submit">
        </form>
        <h4>For Database</h4>
        <form action="displaydatabase">
        <input type="submit" name="submit" value="get all data">
        </form>
    </div>
</body>
</html>
-->

