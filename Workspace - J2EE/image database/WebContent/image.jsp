<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>JSP Page</title>

</head>

<body>

    <form name="f1" method="post" enctype="multipart/form-data" action="ImageUploadServlet">

    <h2>

        Add Image In DB

    </h2>

    <table>

        <tr>

            <td>

                <table>

                    <tr>

                        <td>First Name:</td>

                        <td><input type="text" name="fname" value="" /></td>

                    </tr>

                    <tr>

                        <td>Last Name:</td>

                        <td><input type="text" name="lname" value="" /></td>

                    </tr>

                    <tr>

                        <td>Photo:</td>

                        <td><input type="file" name="image" value="" /></td>

                    </tr>

                    <tr>

                        <td colspan="2" align="right"><input type="submit" value="Save" name="btnSave" /></td>

                    </tr>

                </table>

            </td>

            <td>

                <table>

                    <tr>

                        <td style="width: 450px; height: auto;">

                            <iframe name="ifs" src="DisplayData" style="width: 550px; height: 300px"></iframe>

                        </td>

                    </tr>

                </table>

            </td>

        </tr>

    </table>

    </form>

</body>

</html>