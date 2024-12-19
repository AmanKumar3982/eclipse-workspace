<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Display Payslip</title>
    <style>
        body {
            background: url('https://images.unsplash.com/photo-1618005182384-a83a8bd57fbe') no-repeat center center fixed;
            background-size: cover;
            font-family: 'Arial', sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100dvh;
            margin: 0;
            color: #333;
        }
        .container {
            backdrop-filter: blur(10px) saturate(180%);
            -webkit-backdrop-filter: blur(10px) saturate(180%);
            background-color: rgba(255, 255, 255, 0.85);
            border-radius: 12px;
            border: 1px solid rgba(255, 255, 255, 0.3);
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 30px;
            text-align: center;
            width: 400px !important;
        }
        h1 {
            font-size: 24px;
            font-size: 4rem !important;
            margin-bottom: 20px;
        }
        .payslip-details {
            display: flex;
            flex-direction: column;
            gap: 10px;
            text-align: left;
        }
        .payslip-details p {
            margin: 0;
            padding: 10px;
            background: rgba(255, 255, 255, 0.9);
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        .payslip-details p span {
            font-weight: bold;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #007BFF;
            color: #fff;
            border-radius: 8px;
            text-decoration: none;
            transition: background-color 0.3s ease;
        }
        a:hover {
            background-color: #0056b3;
        }
        
        @media screen and (max-width: 700px) {
        	.container{
        		width: 75dvw !important;
        	}

            .payslip-details{
                height: 30vh;
                overflow: scroll;
            }

            h1 {
            font-size: 24px;
            font-size: 3.5rem !important;
            margin-bottom: 20px;
        }
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Salary Slip</h1>
        <c:if test="${data != null}">
            <div class="payslip-details">
                <p><span>ID:</span> ${data[0]}</p>
                <p><span>Name:</span> ${data[1]}</p>
                <p><span>Working Days:</span> ${data[2]}</p>
                <p><span>Daily Wages:</span> ${data[3]}</p>
                <p><span>Deduction:</span> ${data[4]}</p>
                <p><span>Bonus:</span> ${data[5]}</p>
                <p><span>Type:</span> ${data[6]}</p>
                <p><span>Salary:</span> ${data[7]}</p>
                <p><span>Net-Salary:</span> ${data[8]}</p>
            </div>
        </c:if>
        <c:if test="${message != null}">
            <p>${message}</p>
        </c:if>
        <a href="index.jsp">Go back</a>
    </div>
</body>
</html>