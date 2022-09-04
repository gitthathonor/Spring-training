<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<div class="container">
	<br /> <br />
	<div>
		<h3>${boards.title }</h3>
	</div>
	<hr/>

	<div>${boards.content }</div>
	
	<c:choose>
		<c:when test="${boards.usersId == sessionScope.principal.id }">
		<a href="/boards/updateForm/${boards.id}"><button>글 수정하기</button></a>
		<a href="/boards/delete/${boards.id}" onclick="return confirm('정말 글을 삭제하시겠습니까?');"><button>글 삭제하기</button></a>
		</c:when>
		<c:otherwise></c:otherwise>
	</c:choose>
	
</div>

<%@ include file="../layout/footer.jsp"%>
