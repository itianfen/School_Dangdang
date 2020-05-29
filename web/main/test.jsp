<%--
  Created by IntelliJ IDEA.
  User: Lonely
  Date: 2020/5/27
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-2.1.0.js"></script>
    <script type="text/javascript">
        $(
            function countTotalPrice(){
                $.ajax({
                    url:"${pageContext.request.contextPath}/cart/getCart.do",
                    type:"POST",
                    success:function(data){
                        if(data){
                            var totalPrice = data.totalPrice;
                            var totalDDPrice = data.totalDDPrice;
                            $("#totalSave").text(totalPrice - totalDDPrice);
                            $("#totalDDPrice").text(totalDDPrice);

                        }
                    },
                    dataType:"json"
                });
            }
        )
    </script>
</head>
<body>${sessionScope}
<span id="totalSave"></span><span id="totalDDPrice"></span>
</body>
</html>
