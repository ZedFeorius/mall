<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript">
    var contextPath = "${ctx}";
</script>
<html>
<head>
</head>
<body>
<div class="table_normal_div">
    <form action="${ctx}/admin/addOrUpdate" method="post" enctype="multipart/form-data">
        <table border="1px" align="center">
            <tr>
                <td>名称</td>
                <td>图片</td>
            </tr>
            <tr>
                <input type="text" name="categoryId" value="${requestScope.category.categoryId}" hidden>
                <td><input type="text" name="categoryName" value="${requestScope.category.categoryName}"></td>
                <td><input type="file" name="categoryImageSrc" src="${requestScope.category.categoryImageSrc}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交"></td>

            </tr>
        </table>
    </form>
</div>
</body>
</html>
