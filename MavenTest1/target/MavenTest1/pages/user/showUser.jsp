<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../commons/tags.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="../commons/meta.jsp"%>
    <title>用户展示</title>
    <!-- 包含头部信息用于适应不同设备 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 包含 bootstrap 样式表 -->
    <link href="${ctx}/static/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
</head>

<body>
<div class="container">
    <h2>表格</h2>
    <p>创建响应式表格 (将在小于768px的小型设备下水平滚动)。另外：添加交替单元格的背景色：</p>
    <div class="table-responsive">
        <table class="table table-striped table-bordered">
            <thead>
                <tr>
                    <th>序号</th>
                    <th>用户名</th>
                    <th>用户年龄</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${user.id}</td>
                    <td>${user.userName}</td>
                    <td>${user.age}</td>
                </tr>
            </tbody>
        </table>
    </div>
</div>

<!-- JavaScript 放置在文档最后面可以使页面加载速度更快 -->
<!-- 可选: 包含 jQuery 库 -->
<script src="${ctx}/static/js/jquery-3.3.1.js" type="text/javascript"/>
<!-- 可选: 合并了 Bootstrap JavaScript 插件 -->
<script src="${ctx}/static/js/bootstrap.js" type="text/javascript"/>
</body>

</html>