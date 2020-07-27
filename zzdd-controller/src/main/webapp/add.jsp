<%--
  Created by IntelliJ IDEA.
  User: 86183
  Date: 2020/7/27
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-3.5.0.js"></script>
</head>
<script type="text/javascript">
    $(function () {
        $.ajax({
            async : false,
            url : "selectType",
            dataType : "json",
            type : "post",
            success : function (obj) {
                for (let x in obj) {
                    $("#type").append("<option value=" + obj[x].id + ">" + obj[x].name + "</option>" )
                }
            }
        })
    })
</script>
<body>
<form action="add" method="post">
    会议编号: <input type="text" name="code"><br>
    会议名称: <input type="text" name="name"><br>
    会议时间: <input type="text" name="start_time"> -- <input type="text" name="end_time"><br>
    会议类型: <select name="type" id="type">
                <option>请选择</option>
             </select><br>
    <input type="submit" value="保存">
</form>
</body>
</html>
