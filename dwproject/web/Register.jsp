
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign-up</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
<%@ include file="navbar.jsp"%>
<div class="card text-bg-dark container mt-4" style="align-content: center;width: 24rem">
<form action="register" method="post" id="signup-form">
    <div class="mb-3">
        <label for="name1" class="form-label">Name</label>
        <input type="text" class="form-control" id="name1" placeholder="Enter your name" name="name">
    </div>
    <div class="mb-3">
        <label for="Email1" class="form-label">Email address</label>
        <input type="email" class="form-control" id="Email1" aria-describedby="emailHelp" placeholder="Enter your Email" name="email">
    </div>
    <div class="mb-3">
        <label for="InputPassword1" class="form-label">Password</label>
        <input type="password" class="form-control" id="InputPassword1" name="password">
    </div>
    <button  type="submit" class="btn btn-primary" id="submit-btn">Submit</button>
</form>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous">

</script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
    $(document).ready(function() {
        $('#signup-form').on('submit',function(event){
            event.preventDefault();
        });

        $('#submit-btn').click(function() {
            // Serialize the form data
            var formData = $('#signup-form').serialize();

            // Send an AJAX POST request to the servlet
            $.ajax({
                type: 'POST',
                url: 'register',
                data: formData,
                success: function(response) {
                    // Handle the response from the servlet here (if needed)
                    console.log('Form data sent successfully.');
                    console.log((formData))
                },
                error: function() {
                    // Handle any errors that occur during the AJAX request
                    console.error('Error sending form data.');
                }
            });
        });
    });
</script>
</body>
</html>
