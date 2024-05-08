
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Example of login form</title>
    <link href="./css/Home.css" rel="stylesheet">
</head>
<body>
    <header>
        <h1>Welcome to Our Website</h1>
        <!-- Add navigation links or logo here -->
    </header>

    <aside>
        <!-- Sidebar content goes here -->
        <h2>Sidebar</h2>
        <ul>
            <li><a href="#">Link 1</a></li>
            <li><a href="#">Link 2</a></li>
            <li><a href="#">Link 3</a></li>
        </ul>
    </aside>

    <main>
        <div class="contain">
            <div class="text">
                <h3><b>Application Form</b></h3>
                <form action="/register" method="post"">
                    <div class="form">
                        <div class="input_field">
                            <label>First Name:</label>
                            <input type="text" class="input" name="firstname" placeholder="Enter your full name" required>
                        </div>
                        <br>
                        <div class="input_field">
                            <label>Last name:</label>
                            <input type="text" class="input" name="lastname" placeholder="Enter your last name" required>
                        </div>
                        <br>
                        <div class="input_field">
                            <label>Password:</label>
                            <input type="password" class="input" name="password" placeholder="Enter your password" minlength="8" required>
                        </div>
                        <br>
                        <div class="input_field">
                            <label>E-Mail:</label>
                            <input type="text" class="input" name="email" placeholder="Enter your e-mail" required>
                        </div>
                        <br>
                        <div class="input_field">
                            <label>Gender:</label>
                            <input type="radio" name="gender" value="male" id="male"> <label for="male">Male</label>
                            <input type="radio" name="gender" value="female" id="female"> <label for="female">Female</label>
                        </div>
                        <br>
                        <div class="input_field">
                            <label>Nationality:</label>
                            <select name="nationality">
                                <option value="india">India</option>
                                <option value="pakistan">Pakistan</option>
                                <option value="nepal">Nepal</option>
                            </select>
                        </div>
                        <br>
                        <div class="input_field">
                            <label>Upload Resume:</label>
                            <input type="file" name="resume">
                        </div>
                        <br>
                        <div class="input_field">
                            <label>Address:</label>
                            <textarea rows="2" cols="30" name="address" required></textarea>
                        </div>
                        <br>
                        <input type="checkbox" name="notify"><span>Notify me the status via e-mail.</span>
                        <br>
                        <input type="checkbox" name="terms"><span>I agree to terms & conditions.</span>
                        <br>
                        <div class="submit">
                            <br><input type="submit" id="submit" value="Submit">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </main>

    <footer>
        <!-- Footer content goes here -->
        <p>&copy; 2024 Your Website Name. All rights reserved.</p>
    </footer>

    <script>
        function validateForm() {
            // Your validation logic here
            return true; // Return true if form is valid, false otherwise
        }
    </script>
</body>
</html>
