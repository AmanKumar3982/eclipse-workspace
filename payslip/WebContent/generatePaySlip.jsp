<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Generate Payslip</title>
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

        input,
        select {
            width: 350px;
            padding: 10px;
            /* margin: 5px 0; */
            border-radius: 5px;
            border: 1px solid #ccc;
            outline: none !important;
            font-size: 1.2rem;
        }

        select {
            width: 95% !important;
        }

        label {
            font-weight: bolder !important;
            font-size: 1.5rem;
        }

        input[type="submit"] {
            background-color: #007BFF;
            color: white;
            border: none;
            cursor: pointer;
        }

        input[type="number"]::-webkit-inner-spin-button {
            display: none !important;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        @media screen and (max-width: 700px) {
            .container {
                width: 80dvw !important;
            }

            input,
            select {
                width: 90% !important;
                background: white;
                color: #000;
                font-weight: bolder;
            }

            select {
                width: 95% !important;
            }
        }
    </style>
</head>

<body>
    <div class="container">
        <h1>Generate Payslip</h1>
        <form action="process" method="post">
            <input type="hidden" name="action" value="generatePaySlip">
            <label for="id">ID</label><br>
            <input type="number" id="id" name="id"><br><br>
            <label for="type">Type</label><br>
            <select id="type" name="type">
                <option value="P">Permanent</option>
                <option value="T">Temporary</option>
            </select><br><br><br>
            <input type="submit" value="Generate">
        </form>
    </div>
</body>

</html>