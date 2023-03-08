<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<c:if test='${agree == "yes"}'>
	약관에 동의합니다.
</c:if>
<c:if test='${agree == "no"}'>
	약관에 동의 안합니다.
</c:if>
<hr>

약관에 동의
<c:choose>
	<c:when test='${agree == "yse"}'>
		합니다.
	</c:when>
	<c:otherwise>
		안 합니다.
	</c:otherwise>
</c:choose>