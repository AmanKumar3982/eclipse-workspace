<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Result</title>
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
            background-color: rgba(255, 255, 255, 0.75);
            border-radius: 16px;
            border: 1px solid rgba(0, 0, 0, 0.1);
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
            padding: 40px;
            text-align: center;
            max-width: 400px;
            width: 100%;
        }
        p {
            margin: 10px 0;
            font-weight: bolder !important;
            font-size: 1.5rem;
        }
        h1{
            font-size: 3rem !important;
        }
        a {
            display: block;
            margin-top: 20px;
            text-decoration: none;
            color: #007BFF;
            font-size: 1.2rem;
        }
        a:hover {
            text-decoration: underline;
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
        <h1>Result</h1>
        <p>${message}</p>
        <a href="index.jsp">Go back</a>
    </div>
</body>
</html>
