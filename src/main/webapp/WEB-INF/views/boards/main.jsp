<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../layout/header.jsp"%>

<div class="container-fluid mt-3">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>글제목</th>
				<th>유저이름</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="boards" items="${boardsList}">
				<tr>
					<td>${boards.id}</td>
					<td><a href="/boards/${boards.id}">${boards.title}</a></td>
					<td>${boards.username}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
</div>

<%@ include file="../layout/footer.jsp"%>
