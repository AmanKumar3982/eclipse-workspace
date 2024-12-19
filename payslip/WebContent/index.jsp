<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payslip Generator</title>
    <style>
        body {
            background: url('https://images.unsplash.com/photo-1618005182384-a83a8bd57fbe') no-repeat center center fixed;
            background-size: cover;
            font-family: 'Arial', sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            color: #333;
        }
        .container {
            backdrop-filter: blur(10px) saturate(180%);
            -webkit-backdrop-filter: blur(10px) saturate(180%);
            background-color: rgba(255, 255, 255, 0.75);
            border-radius: 16px;
            border: 1px solid rgba(0, 0, 0, 0.1);
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
            padding: 40px;
            text-align: center;
            max-width: 400px;
            width: 100%;
        }
        h1 {
            font-size: 2.5em;
            margin-bottom: 20px;
            color: #007BFF;
        }
        a {
            display: block;
            margin: 15px 0;
            padding: 10px 20px;
            text-decoration: none;
            color: #fff;
            background-color: #007BFF;
            border-radius: 8px;
            transition: background-color 0.3s ease, transform 0.3s ease;
        }
        a:hover {
            background-color: #0056b3;
            transform: translateY(-3px);
        }

        @media screen and (max-width: 700px) {
        	.container{
        		width: 65dvw !important;
        	}
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>PAYSLIP GENERATOR</h1>
        <a href="addPermanent.jsp">Add Permanent Employee</a>
        <a href="addTemporary.jsp">Add Temporary Employee</a>
        <a href="generatePaySlip.jsp">Generate Payslip</a>
        <a href="updatePaySlip.jsp">Update Payslip</a>
    </div>
</body>
</html>