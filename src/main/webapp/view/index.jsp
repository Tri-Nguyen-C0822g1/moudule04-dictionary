<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Conversion</title>
</head>
<body>
<center>
    <h2>
        <a href="/dictionary">Back</a>
    </h2>
</center>
<div align="center">
    <form method="post" action="/translate">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Translation</h2>
            </caption>
            <tr>
                <th>English</th>
                <td>
                    <input type="text" name="key" id="usd" value="${en}" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Vietnamese</th>
                <td>
                    <p id="vnd">${vn}</p>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" name="conv" value="Translate"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>