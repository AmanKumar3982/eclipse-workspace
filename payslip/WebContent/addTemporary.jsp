<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Temporary Employee</title>
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
            border-radius: 12px;
            border: 1px solid rgba(255, 255, 255, 0.3);
            padding: 20px;
            width: 400px;
            text-align: center;
            display: flex;
            align-items: center;
            justify-content: center;
            flex-direction: column;
        }
        input{
            width: 350px;
            padding: 10px;
            /* margin: 5px 0; */
            border-radius: 5px;
            border: 1px solid #ccc;
            outline: none !important;
            font-size: 1.2rem;
        }

        label{
            font-weight: bolder !important;
            font-size: 1.5rem;
        }
        input[type="submit"] {
            background-color: #007BFF;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="number"]::-webkit-inner-spin-button{
            display: none !important;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        @media screen and (max-width: 700px) {
        	.container{
        		width: 75dvw !important;
        	}

            input{
                width: 90% !important;
            }

            form{
                height: 40vh;
                overflow: scroll;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Add Temporary Employee</h1>
        <form action="process" method="post" id="form">
            <input type="hidden" name="action" value="addTemporary">
            <label for="id">ID</label><br>
            <input type="number" id="id" name="id"><br><br>
            <label for="name">Name</label><br>
            <input type="text" id="name" name="name"><br><br>
            <label for="workingDays">Working Days</label><br>
            <input type="number" id="workingDays" name="workingDays"><br><br>
            <label for="dailyWage">Daily Wage</label><br>
            <input type="number" id="dailyWage" name="dailyWage"><br><br>
            <label for="deduction">Deduction</label><br>
            <input type="number" id="deduction" name="deduction"><br><br>
            <label for="bonus">Bonus</label><br>
            <input type="number" id="bonus" name="bonus">
            </form>
            <br>
        <input type="submit" value="Add" onclick="document.getElementById('form').submit();">
    </div>
</body>
</html>
