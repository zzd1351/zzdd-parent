<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86183
  Date: 2020/7/27
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-3.5.0.js"></script>
</head>
<script type="text/javascript">
    function fenye(cpage) {
        $("[name='cpage']").val(cpage);
        $("form").submit();
    }
    function toAdd() {
        location = "toAdd";
    }
    function toupd(id) {
        location = "toupd?id=" + id;
    }
</script>
<body>
<form action="list" method="post">
    <input type="hidden" name="cpage">
</form>
<input type="button" value="新增" onclick="toAdd()">
<table>
    <tr>
        <td>
            <input type="checkbox">
        </td>
        <td>序号</td>
        <td>会议编号</td>
        <td>会议名称</td>
        <td>会议开始时间</td>
        <td>会议结束时间</td>
        <td>会议类型</td>
        <td>会议创建时间</td>
    </tr>
    <c:forEach items="${list}" var="l">
        <tr>
            <td>
                <input type="checkbox">
            </td>
            <td>${l.id}</td>
            <td>${l.code}</td>
            <td>${l.name}</td>
            <td>${l.start_time}</td>
            <td>${l.end_time}</td>
            <td>${l.type}</td>
            <td>${l.create_time}</td>
            <td>
                <input type="button" value="修改" onclick="toupd(${l.id})">
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="11">
            <input type="button" value="首页" onclick="fenye(1)">
            <input type="button" value="上一页" onclick="fenye(${pi.isIsFirstPage()?1:pi.getPrePage()})">
            <input type="button" value="下一页" onclick="fenye(${pi.isIsLastPage()?pi.getPages():pi.getNextPage()})">
            <input type="button" value="尾页" onclick="fenye(${pi.getPages()})">
        </td>
    </tr>
</table>
</body>
</html>
